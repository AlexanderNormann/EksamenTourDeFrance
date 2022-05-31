package com.example.tourdefranceproject.controller;

import com.example.tourdefranceproject.model.Team;
import com.example.tourdefranceproject.service.RiderService;
import com.example.tourdefranceproject.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/teams")
public class TeamRestController {
  @Autowired
   TeamService teamService;


@Autowired
  public TeamRestController(TeamService teamService) {
    this.teamService = teamService;
  }

  @PostMapping()
  public ResponseEntity<Team> addTeam(@RequestBody Team team){
    System.out.println(team);
    return new ResponseEntity<>(teamService.save(team), HttpStatus.OK);
  }

  @GetMapping()
  public ResponseEntity<List<Team>> getTeams (Team team){
    System.out.println(team);
    return new ResponseEntity<>(teamService.findAll(), HttpStatus.OK);
  }
}
