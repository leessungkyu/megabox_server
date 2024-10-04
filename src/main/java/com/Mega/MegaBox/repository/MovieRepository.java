package com.Mega.MegaBox.repository;

import com.Mega.MegaBox.model.MoviesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MoviesModel, Integer> {


    // JPQL 쿼리 수정
    @Query("SELECT m FROM MoviesModel m WHERE m.useyn ='Y' AND m.id BETWEEN :startId AND :endId ")
    List<MoviesModel> findMovieRange(Integer startId, Integer endId);

    @Query("SELECT m FROM MoviesModel m WHERE m.useyn = 'Y'")
    List<MoviesModel> findUseMovieList();
}
