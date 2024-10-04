package com.Mega.MegaBox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class MoviesModel {
    @Id
    private Integer movies_id;
    private String movies_name;
    private String movies_imgurl;
    private String useyn;

    public MoviesModel() {
    }

    public MoviesModel(Integer movieId, String movies_name, String useyn) {
        this.movies_id = movieId;
        this.movies_name = movies_name;
        this.useyn = useyn;
    }

    public Integer getMovieId() {
        return movies_id;
    }

    public void setMovieId(Integer movies_id) {
        this.movies_id = movies_id;
    }

    public String getMovies_name() {
        return movies_name;
    }

    public void setMovies_name(String movies_name) {
        this.movies_name = movies_name;
    }

    public String getMovies_imgurl() {
        return movies_imgurl;
    }

    public void setMovies_imgurl(String movies_imgurl) {
        this.movies_imgurl = movies_imgurl;
    }

    public String getUseyn() {
        return useyn;
    }

    public void setUseyn(String useyn) {
        this.useyn = useyn;
    }
}
