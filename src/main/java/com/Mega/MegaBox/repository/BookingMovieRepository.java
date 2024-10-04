package com.Mega.MegaBox.repository;

import com.Mega.MegaBox.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingMovieRepository extends JpaRepository<BookingModel, Integer> {
    Optional<BookingModel> findByBookingId(String bookingId);
}
