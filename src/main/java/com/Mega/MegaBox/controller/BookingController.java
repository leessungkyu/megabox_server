package com.Mega.MegaBox.controller;

import com.Mega.MegaBox.model.BookingModel;
import com.Mega.MegaBox.repository.BookingMovieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookingController {
   private BookingMovieRepository bookingMovieRepository;

    public BookingController(BookingMovieRepository bookingMovieRepository) {
        this.bookingMovieRepository = bookingMovieRepository;
    }

    @GetMapping("/booking/{bookingId}")
    public BookingModel getBookingPin(@PathVariable String bookingId) {
        return bookingMovieRepository.findByBookingId(bookingId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Booking not found"));
    }
}
