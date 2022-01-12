package com.devsuperior.dsmovieback.controllers;

import com.devsuperior.dsmovieback.dto.MovieDTO;
import com.devsuperior.dsmovieback.dto.ScoreDTO;
import com.devsuperior.dsmovieback.entities.Movie;
import com.devsuperior.dsmovieback.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }

}
