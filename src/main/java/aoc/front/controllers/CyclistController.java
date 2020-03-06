package aoc.front.controllers;

import aoc.bll.services.cyclistservices.CyclistService;
import aoc.bll.services.skillservices.SkillService;
import aoc.bll.services.skillservices.SkillSetService;
import aoc.dal.models.Cyclist;
import aoc.dal.models.SkillSet;
import aoc.front.dto.CyclistForm;
import aoc.front.dto.CyclistList;
import aoc.front.dto.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping(value={"/api/cyclist"})
public class CyclistController {
    private CyclistService cyclistService;
    private SkillService skillService;
    private SkillSetService skillSetService;

    @Autowired
    public CyclistController(CyclistService cyclistService, SkillService skillService, SkillSetService skillSetService){
        this.cyclistService = cyclistService;
        this.skillService = skillService;
        this.skillSetService = skillSetService;
    }

    @GetMapping(value={"/", "/list"})
    public ResponseEntity<List<CyclistList>> getAll(){
        return ResponseEntity.ok(cyclistService.findAll()
                .stream()
                .map(CyclistList::new)
                .collect(Collectors.toList()));
    }

    @GetMapping(value={"/ByUser/{id}"})
    public ResponseEntity<List<CyclistList>> getByUser(@PathVariable Long id){
        return ResponseEntity.ok(cyclistService.findAllByUserId(id)
                .stream()
                .map(CyclistList::new)
                .collect(Collectors.toList()));
    }

    @PostMapping(value={"/ByUser"})
    public ResponseEntity<List<CyclistList>> getByUser(@RequestBody UserList userlist){
        return ResponseEntity.ok(cyclistService.findAllByUserUsername(userlist.getUsername())
                .stream()
                .map(CyclistList::new)
                .collect(Collectors.toList()));
    }

    @PostMapping(value = {"/add"})
    public ResponseEntity<CyclistList> add(@RequestBody CyclistForm cyclistForm) throws Exception {
        Cyclist cyclist = cyclistService.save(cyclistForm);
        // TODO: 21-02-20 Problème avec l'id compiste du skillset
        List<SkillSet> skillSets = cyclistForm.getSkillSetList()
                .stream()
                .map(cyclistListSkillSet -> {
                    return new SkillSet(cyclist,
                            skillService.findByLabel(cyclistListSkillSet.getSkill().getLabel()).orElse(null),
                            cyclistListSkillSet.getValue());
                })
                .collect(Collectors.toList());

        // TODO: 21-02-20 il dit que j'essaie de mettre un long dans un cyclist
        skillSets.forEach(skillSet -> skillSetService.save(skillSet));
        return ResponseEntity.ok(new CyclistList(cyclist));
    }
}