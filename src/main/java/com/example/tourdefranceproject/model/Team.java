package com.example.tourdefranceproject.model;

import javax.persistence.*;

@Entity
public class Team {

  @Id
 @Column(name = "team_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "teamname")
  private String teamName;


}
