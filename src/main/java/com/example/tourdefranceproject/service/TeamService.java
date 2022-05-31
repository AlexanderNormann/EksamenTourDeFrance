package com.example.tourdefranceproject.service;

import com.example.tourdefranceproject.model.Team;
import com.example.tourdefranceproject.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
  private final TeamRepository teamRepository;

  @Autowired
  public TeamService(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }


  public Team save(Team team) {
    return teamRepository.save(team);
  }

  public List<Team> findAll(){
    return teamRepository.findAll();
  }


}
