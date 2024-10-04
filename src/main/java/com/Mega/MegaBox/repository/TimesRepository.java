package com.Mega.MegaBox.repository;

import com.Mega.MegaBox.model.TimesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimesRepository extends JpaRepository<TimesModel, Integer> {
    @Query("SELECT m FROM TimesModel m WHERE m.movies_id = :movieId AND m.theaters_id = :theaterId AND m.useyn = 'Y'")
    List<TimesModel> findByUseMoiveTheater(Integer movieId, Integer theaterId);
}
