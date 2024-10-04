package com.Mega.MegaBox.repository;

import com.Mega.MegaBox.model.TheaterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatersRepository extends JpaRepository<TheaterModel, Integer> {
    @Query("SELECT m FROM TheaterModel m WHERE  m.region_id = :regionId AND m.useyn ='Y'")
    List<TheaterModel> findByUse(Integer regionId);
}
