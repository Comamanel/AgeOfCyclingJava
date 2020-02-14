package aoc.front.controllers;

import aoc.bll.services.raceservices.RaceService;
import aoc.front.dto.RaceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/api/race")
public class RaceController {
    private RaceService raceService;

    @Autowired
    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping(value={"/", "/list"})
    public ResponseEntity<List<RaceList>> getAll(){
        return ResponseEntity.ok(
            this.raceService.findAll()
                .stream()
                .map(RaceList::from)
                .collect(Collectors.toList()));
    }
}
