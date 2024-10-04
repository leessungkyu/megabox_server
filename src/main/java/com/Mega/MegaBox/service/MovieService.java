package com.Mega.MegaBox.service;

import com.Mega.MegaBox.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String getMovieName(Integer id) {
        return this.movieRepository.findById(id).get().getMovies_name();
    }
}
