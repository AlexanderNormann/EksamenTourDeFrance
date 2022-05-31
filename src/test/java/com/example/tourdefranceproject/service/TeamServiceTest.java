package com.example.tourdefranceproject.service;

import com.example.tourdefranceproject.model.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Import(TeamService.class)
class TeamServiceTest {

  @Autowired
  TeamService teamService;

  @Test
  void save() {
    Team team = new Team();
    Assertions.assertNotNull(team);
  }

  @Test
  void findAll() {
    Team team = new Team();
    teamService.save(team);
    List<Team> foundTeam = teamService.findAll();

    Assertions.assertNotNull(foundTeam);
  }
}