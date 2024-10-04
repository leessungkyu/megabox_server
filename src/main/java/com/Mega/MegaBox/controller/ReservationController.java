package com.Mega.MegaBox.controller;

import com.Mega.MegaBox.model.*;
import com.Mega.MegaBox.repository.*;
import com.Mega.MegaBox.service.BookingService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ReservationController {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private RegionsRepository regionsRepository;
    @Autowired
    private TheatersRepository theatersRepository;
    @Autowired
    private TimesRepository timesRepository;
    @Autowired
    private BookingService bookingService;
    @Autowired
    private BookingSeatRepository bookingSeatRepository;

    @GetMapping("/reservation_movieList")
    public List<MoviesModel> getReservationMovieList() {
        return movieRepository.findUseMovieList();
    }

    @GetMapping("/reservation_regions")
    public ResponseEntity<List<RegionsModel>> getReservationRegionList(){
        List<RegionsModel> regions = regionsRepository.findByUseRegions();
        if (!regions.isEmpty()){
            return ResponseEntity.ok(regions);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/reservation_theaters")
    public ResponseEntity<List<TheaterModel>> getReservationTheaterLst
            (@RequestParam(name="region") Integer regionId){
        List<TheaterModel> theaters = theatersRepository.findByUse(regionId);
        if(!theaters.isEmpty()){
            return ResponseEntity.ok(theaters);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/reservation_times")
    public ResponseEntity<List<TimesModel>> getReservationTimeList(
            @RequestParam(name="movie") Integer movieId,
            @RequestParam(name="theater") Integer theaterId){
        List<TimesModel> times = timesRepository.findByUseMoiveTheater(movieId, theaterId);
        if(!times.isEmpty()){
            return ResponseEntity.ok(times);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/reservation_time")
    public ResponseEntity<TimesModel> getReservationTime(
            @RequestParam(name = "time") Integer timeId){
        Optional<TimesModel> time = timesRepository.findById(timeId);
        return time.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
     }

    @PostMapping("/reservationSaveBooking")
    public ResponseEntity<String> setReservation(
            @RequestBody BookingRequest bookingRequest
     ){
         bookingService.saveBooking(bookingRequest);
         return ResponseEntity.status(200).body("부킹성공");
     }

     @PostMapping("/reservationSaveSeat")
    public ResponseEntity<String> setReservationSeat(
            @RequestBody BookingSeatRequest bookingSeatRequest
     )
    {
        bookingService.saveSeat(bookingSeatRequest);
        return ResponseEntity.status(200).body("좌석 성공");
    }
}
