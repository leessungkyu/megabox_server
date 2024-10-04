package com.Mega.MegaBox.repository;

import com.Mega.MegaBox.model.BookingSeatModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingSeatRepository extends JpaRepository<BookingSeatModel, Integer> {
}
