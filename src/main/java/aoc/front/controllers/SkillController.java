package aoc.front.controllers;

import aoc.bll.services.skillservices.SkillService;
import aoc.front.dto.SkillList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api/skill")
public class SkillController {
    private SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping(value={"/", "/list"})
    public ResponseEntity<List<SkillList>> getAll(){
        List<SkillList> skillList = new ArrayList<>();
        this.skillService.findAll().forEach(s -> skillList.add(SkillList.from(s)));
        return ResponseEntity.ok(skillList);
    }

}
