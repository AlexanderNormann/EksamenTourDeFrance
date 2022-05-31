package com.example.tourdefranceproject.controller;

import com.example.tourdefranceproject.model.Rider;
import com.example.tourdefranceproject.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@RestController
@CrossOrigin
@RequestMapping("/api/riders")
public class RiderRestController {

  @Autowired
  RiderService riderService;

  @Autowired
  public RiderRestController(RiderService riderService) {
    this.riderService = riderService;
  }

  @PostMapping()
  public ResponseEntity<Rider> addRider(@RequestBody Rider rider) {
    System.out.println(rider);
    return new ResponseEntity<>(riderService.save(rider), HttpStatus.OK);
  }

  @GetMapping()
  public ResponseEntity<List<Rider>> getRiders(Rider rider) {
    System.out.println(rider);
    return new ResponseEntity<>(riderService.findAll(), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Rider> deleteRider(@PathVariable Long id) {
    riderService.deleteById(id);
    System.out.println(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Rider> updateRider(@PathVariable Long id, @RequestBody Rider rider) {
    Optional<Rider> optRider = riderService.findById(id);
    if (optRider.isPresent()) {
      riderService.save(rider);
      return new ResponseEntity<>(rider, HttpStatus.OK);
    } else {
      Rider riderNotFound = new Rider();
      riderNotFound.setRiderName("kunne ikke finde id= " + id);
      return new ResponseEntity<>(riderNotFound, HttpStatus.NOT_FOUND);
    }
  }

  @GetMapping("/team/{id}")
  public ResponseEntity<List<Rider>> GetRidersByTeamId(@PathVariable Long id) {
    List<Rider> riders = riderService.findAllByTeamId(id);
    return ResponseEntity.status(HttpStatus.OK).body(riders);
  }


  @GetMapping("/byid/{id}")
  public ResponseEntity<Rider> getRiderById(@PathVariable Long id, @RequestBody Rider rider) {
    Optional<Rider> rideropt = riderService.findById(id);
    if (rideropt.isPresent()) {
      riderService.save(rider);
      return new ResponseEntity<>(rider, HttpStatus.OK);
    } else {
      Rider riderNotFound = new Rider();
      riderNotFound.setRiderName("kunne ikke finde id= " + id);
      return new ResponseEntity<>(riderNotFound, HttpStatus.NOT_FOUND);
    }
  }


}


