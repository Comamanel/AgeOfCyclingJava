package aoc.front.controllers;

import aoc.business.services.CyclistService;
import aoc.front.dto.CyclistList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value={"/api/cyclist"})
public class CyclistController {
    private CyclistService cyclistService;

    @Autowired
    public CyclistController(CyclistService cyclistService){
        this.cyclistService = cyclistService;
    }

    @GetMapping(value={"/", "/list"})
    public ResponseEntity<List<CyclistList>> getAll(){
        return ResponseEntity.ok(cyclistService.findAll()
                .stream()
                .map(CyclistList::from)
                .collect(Collectors.toList()));
        //TODO: cf CyclistList.class
    }
}
