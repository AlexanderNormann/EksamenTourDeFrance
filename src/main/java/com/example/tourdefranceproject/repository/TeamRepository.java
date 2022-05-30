package com.example.tourdefranceproject.repository;

import com.example.tourdefranceproject.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Rider, Long> {
}
