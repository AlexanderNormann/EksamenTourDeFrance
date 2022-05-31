package com.example.tourdefranceproject.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@ToString
@Entity
public class Team {

  @Id
 @Column(name = "team_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "teamname")
  private String teamName;

  @JsonBackReference(value = "Riders")
 @OneToMany(mappedBy = "team", cascade = CascadeType.MERGE)
 @ToString.Exclude
 private List<Rider> riders;



}
