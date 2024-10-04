package com.Mega.MegaBox.controller;

import com.Mega.MegaBox.model.MoviesModel;
import com.Mega.MegaBox.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class MoviesController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movieAll")
    @ResponseBody
    public List<MoviesModel> getMovieList() {
        return movieRepository.findAll();
    }

    @GetMapping("/movies")
    @ResponseBody
    public List<MoviesModel> getMovieRange(@RequestParam Integer startId, @RequestParam Integer endId){
        List<MoviesModel> moviesRange = movieRepository.findMovieRange(startId, endId);
        return moviesRange;
    }

    @GetMapping("/movie")
    @ResponseBody
    public ResponseEntity<MoviesModel> getMovieById(@RequestParam Integer id) {
        Optional<MoviesModel> movieOptional = movieRepository.findById(id);

        if (movieOptional.isPresent()) {
            return ResponseEntity.ok(movieOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(null); // 영화가 없을 경우 404 에러 반환
        }
    }

}
