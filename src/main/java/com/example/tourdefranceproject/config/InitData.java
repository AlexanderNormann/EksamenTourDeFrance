package com.example.tourdefranceproject.config;

import com.example.tourdefranceproject.model.Rider;
import com.example.tourdefranceproject.model.Team;
import com.example.tourdefranceproject.service.RiderService;
import com.example.tourdefranceproject.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {
  private final RiderService riderService;

  private final TeamService teamService;

  @Autowired
  public InitData(RiderService riderService, TeamService teamService) {
    this.riderService = riderService;
    this.teamService = teamService;
  }

  @Override
  public void run(String... args) throws Exception {

    Team team1 = new Team();
    team1.setTeamName("INEOS");

    Team team2 = new Team();
    team2.setTeamName("BORA");

    Team team3 = new Team();
    team3.setTeamName("TREK");

    Rider rider1 = new Rider();
    rider1.setRiderName("Egan Bernal");
    rider1.setTeam(team1);

    Rider rider2 = new Rider();
    rider2.setRiderName("Wilco Kelderman");
    rider2.setTeam(team2);

    Rider rider3 = new Rider();
    rider3.setRiderName("Leonard Kamna");
    rider3.setTeam(team2);

    teamService.save(team1);
    teamService.save(team2);

    riderService.save(rider1);
    riderService.save(rider2);
    riderService.save(rider3);

  }
}
