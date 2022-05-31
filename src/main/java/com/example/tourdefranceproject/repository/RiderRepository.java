package com.example.tourdefranceproject.repository;

import com.example.tourdefranceproject.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
  @Override
  void deleteById(Long id);

  @Query("SELECT b FROM Rider b WHERE b.team.id = ?1")
  Optional<List<Rider>> findAllByTeamId(Long id);


}

