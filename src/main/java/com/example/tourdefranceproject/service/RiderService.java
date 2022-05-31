package com.example.tourdefranceproject.service;

import com.example.tourdefranceproject.exceptions.NotFoundException;
import com.example.tourdefranceproject.model.Rider;
import com.example.tourdefranceproject.model.Team;
import com.example.tourdefranceproject.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RiderService {

  private final RiderRepository riderRepository;

  @Autowired
  public RiderService(RiderRepository riderRepository) {
    this.riderRepository = riderRepository;
  }

  public Rider save(Rider rider) {
    return riderRepository.save(rider);
  }

  public List<Rider> findAll() {
    return riderRepository.findAll();
  }
@Transactional
  public void deleteById(Long id) {
    riderRepository.deleteById(id);
  }

  public Optional<Rider> findById(Long id) {
    return riderRepository.findById(id);
  }



  public List<Rider> findAllByTeamId(Long id) {
    List<Rider> riders = riderRepository.findAllByTeamId(id).orElseThrow(() -> new NotFoundException("Fejl"));

    if (riders.size() ==0){
      throw  new NotFoundException("Kunne ikke finde rytter med teamID: " + id);
    } else
      return riders;
  }

}
