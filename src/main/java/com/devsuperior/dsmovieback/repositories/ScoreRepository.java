package com.devsuperior.dsmovieback.repositories;

import com.devsuperior.dsmovieback.entities.Score;
import com.devsuperior.dsmovieback.entities.ScorePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
}
