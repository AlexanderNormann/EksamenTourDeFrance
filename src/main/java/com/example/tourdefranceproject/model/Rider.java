package com.example.tourdefranceproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@ToString
@Entity
public class Rider {

  @Id
  @Column(name = "rider_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "team_id")
  private Team team;

  @Column(name = "ridername")
  private String riderName;

  @Column(name = "generalclassification")
  private double generalClassification;

  @Column(name = "youthclassification")
  private double youthClassification;

  @Column(name = "pointsjersey")
  private int pointsJersey;

  @Column(name = "mountainsjerey")
  private int  mountainsJersey;




}
