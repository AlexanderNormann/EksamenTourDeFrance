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
    team1.setTeamName("INEOS Grenadiers");

    Team team2 = new Team();
    team2.setTeamName("BORA - Hansgrobe");

    Team team3 = new Team();
    team3.setTeamName("TREK - Segafredo");

    Team team4 = new Team();
    team4.setTeamName("Jumbo-Visma");

    Team team5 = new Team();
    team5.setTeamName("Cofidis");

    Team team6 = new Team();
    team6.setTeamName("Quick-Step Alpha");

    Team team7 = new Team();
    team7.setTeamName("Lotto Soudal");




    Rider rider1 = new Rider();
    rider1.setRiderName("Egan Bernal");
    rider1.setTeam(team1);

    Rider rider2 = new Rider();
    rider2.setRiderName("Wilco Kelderman");
    rider2.setTeam(team2);

    Rider rider3 = new Rider();
    rider3.setRiderName("Lennard Kamna");
    rider3.setTeam(team2);

    Rider rider4 = new Rider();
    rider4.setRiderName("Jonas Vingegaard");
    rider4.setTeam(team4);

    Rider rider5 = new Rider();
    rider5.setRiderName("Wout van Aert");
    rider5.setTeam(team4);

    Rider rider6 = new Rider();
    rider6.setRiderName("Sam Bennett");
    rider6.setTeam(team2);

    Rider rider7 = new Rider();
    rider7.setRiderName("Kapser Asgreen");
    rider7.setTeam(team6);


    Rider rider8 = new Rider();
    rider8.setRiderName("Julian Alaphilippe");
    rider8.setTeam(team6);


    Rider rider9 = new Rider();
    rider9.setRiderName("Remi Cavagna");
    rider9.setTeam(team6);

    Rider rider10 = new Rider();
    rider10.setRiderName("Caleb Ewan");
    rider10.setTeam(team7);

    Rider rider11 = new Rider();
    rider11.setRiderName("Tim Wellens");
    rider11.setTeam(team7);

    Rider rider12 = new Rider();
    rider12.setRiderName("Ion Izagirre");
    rider12.setTeam(team5);

    Rider rider13 = new Rider();
    rider13.setRiderName("Filippo Ganna");
    rider13.setTeam(team1);

    Rider rider14 = new Rider();
    rider14.setRiderName("Geraint Thomas");
    rider14.setTeam(team1);

    Rider rider15 = new Rider();
    rider15.setRiderName("Laurens De Plus");
    rider15.setTeam(team1);

    Rider rider16 = new Rider();
    rider16.setRiderName("Mads Pedersen");
    rider16.setTeam(team3);

    Rider rider17 = new Rider();
    rider17.setRiderName("Jasper Stuyven");
    rider17.setTeam(team3);

    teamService.save(team1);
    teamService.save(team2);
    teamService.save(team3);
    teamService.save(team4);
    teamService.save(team5);
    teamService.save(team6);
    teamService.save(team7);


    riderService.save(rider1);
    riderService.save(rider2);
    riderService.save(rider3);
    riderService.save(rider4);
    riderService.save(rider5);
    riderService.save(rider6);
    riderService.save(rider7);
    riderService.save(rider8);
    riderService.save(rider9);
    riderService.save(rider10);
    riderService.save(rider11);
    riderService.save(rider12);
    riderService.save(rider13);
    riderService.save(rider14);
    riderService.save(rider15);
    riderService.save(rider16);
    riderService.save(rider17);



  }
}
