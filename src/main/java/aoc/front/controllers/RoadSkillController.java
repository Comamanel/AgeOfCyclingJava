package aoc.front.controllers;

import aoc.bll.services.skillservices.RoadSkillService;
import aoc.front.dto.RoadSkillForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/skill/road")
public class RoadSkillController {
    private RoadSkillService roadSkillService;

    @Autowired
    public RoadSkillController(RoadSkillService roadSkillService) {
        this.roadSkillService = roadSkillService;
    }

    @PostMapping(value = "/new")
    public ResponseEntity<RoadSkillForm> add(@RequestBody RoadSkillForm roadSkillForm){
        RoadSkill roadskill = new RoadSkill();
        roadskill.setLabel(roadSkillForm.getLabel());
        return ResponseEntity.ok(RoadSkillForm.from(this.roadSkillService.save(roadskill)));
    }
}
