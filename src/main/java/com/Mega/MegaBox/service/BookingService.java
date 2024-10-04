package com.Mega.MegaBox.service;

import com.Mega.MegaBox.model.*;
import com.Mega.MegaBox.repository.BookingMovieRepository;
import com.Mega.MegaBox.repository.BookingSeatRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private BookingMovieRepository bookingMovieRepository;
    private BookingSeatRepository bookingSeatRepository;


    public BookingService(BookingMovieRepository bookingMovieRepository, BookingSeatRepository bookingSeatRepository) {
        this.bookingMovieRepository = bookingMovieRepository;
        this.bookingSeatRepository = bookingSeatRepository;
    }

    public BookingModel saveBooking(BookingRequest bookingRequest){
        BookingModel booking = new BookingModel();
        booking.setBookingId(bookingRequest.getBooking_id());
        booking.setTimeId(bookingRequest.getTime_id());
        booking.setUser_pin(bookingRequest.getUser_pin());
        return bookingMovieRepository.save(booking);
    }

    public BookingSeatModel saveSeat(BookingSeatRequest bookingSeatRequest){
        BookingSeatModel seat = new BookingSeatModel();

        seat.setBooking_pin(bookingSeatRequest.getBooking_pin());
        seat.setSeat(bookingSeatRequest.getSeat());
        return bookingSeatRepository.save(seat);
    }
}
