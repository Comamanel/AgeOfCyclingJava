package aoc.front.controllers;

import aoc.bll.services.cyclistservices.CyclistService;
import aoc.front.dto.CyclistList;
import aoc.front.dto.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
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
    }

    @GetMapping(value={"/ByUser/{id}"})
    public ResponseEntity<List<CyclistList>> getByUser(@PathVariable Long id){
        return ResponseEntity.ok(cyclistService.findAllByUserId(id)
                .stream()
                .map(CyclistList::from)
                .collect(Collectors.toList()));
    }

    @PostMapping(value={"/ByUser"})
    public ResponseEntity<List<CyclistList>> getByUser(@RequestBody UserList userlist){
        return ResponseEntity.ok(cyclistService.findAllByUserUsername(userlist.getUsername())
                .stream()
                .map(CyclistList::from)
                .collect(Collectors.toList()));
    }
}
