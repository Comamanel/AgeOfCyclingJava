package aoc.front.controllers;

import aoc.business.models.CrossSkill;
import aoc.business.services.skillservices.CrossSkillService;
import aoc.front.dto.CrossSkillForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/skill/cross")
public class CrossSkillController {
    private CrossSkillService crossSkillService;

    @Autowired
    public CrossSkillController(CrossSkillService crossSkillService) {
        this.crossSkillService = crossSkillService;
    }

    @PostMapping(value = "/new")
    public ResponseEntity<CrossSkillForm> add(@RequestBody CrossSkillForm crossSkillForm){
        CrossSkill crossSkill = new CrossSkill();
        crossSkill.setLabel(crossSkillForm.getLabel());
        return ResponseEntity.ok(CrossSkillForm.from(this.crossSkillService.save(crossSkill)));
    }
}
