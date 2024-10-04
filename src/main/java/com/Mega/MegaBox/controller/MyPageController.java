package com.Mega.MegaBox.controller;

import com.Mega.MegaBox.service.MovieService;
import com.Mega.MegaBox.service.MyPageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyPageController {
    private MyPageService myPageService;
    private MovieService movieService;

    public MyPageController(MyPageService myPageService, MovieService movieService) {
        this.myPageService = myPageService;
        this.movieService = movieService;
    }

    @GetMapping("/my-page/{id}")
    public String myPage(@PathVariable String id) {
        return myPageService.getMyPageNameFindById(id);
    }

    @GetMapping("/my-page/movie-title")
    public String movieTitle() {
        return this.movieService.getMovieName(1);
    }
}
