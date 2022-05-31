package com.example.tourdefranceproject.service;

import com.example.tourdefranceproject.model.Rider;
import com.example.tourdefranceproject.model.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Import(RiderService.class)
class RiderServiceTest {

  @Autowired
  RiderService riderService;



  @Test
  void save() {
    Rider rider = new Rider();
    Rider saved = riderService.save(rider);
    riderService.deleteById(saved.getId());

    Assertions.assertNotNull(saved);

  }

  @Test
  void findAll() {
    List<Rider> riders = riderService.findAll();
    int size = riders.size();

    Rider rider = new Rider();
    Rider saved = riderService.save(rider);
    riderService.deleteById(saved.getId());

    Assertions.assertEquals(17, size);
  }

  @Test
  void deleteById() {
    Rider rider = new Rider();
    Rider saved = riderService.save(rider);
    Long id = saved.getId();

    riderService.deleteById(id);

    Assertions.assertNotNull(saved.getId());

  }

  @Test
  void findById() {
    Rider rider = new Rider();
    Rider saved = riderService.save(rider);
    Long id = saved.getId();

    Assertions.assertNotNull(riderService.findById(id));
  }

}