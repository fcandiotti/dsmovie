package com.devsuperior.dsmovieback.repositories;

import com.devsuperior.dsmovieback.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
