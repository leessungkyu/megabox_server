package com.Mega.MegaBox.repository;

import com.Mega.MegaBox.model.RegionsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionsRepository extends JpaRepository<RegionsModel, Long> {
    @Query("SELECT m FROM RegionsModel m WHERE m.useyn = 'Y'")
    List<RegionsModel> findByUseRegions();
}
