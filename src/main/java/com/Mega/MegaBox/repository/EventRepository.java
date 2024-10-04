package com.Mega.MegaBox.repository;

import com.Mega.MegaBox.model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventModel, Integer> {
}
