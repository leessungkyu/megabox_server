package com.Mega.MegaBox.controller;

import com.Mega.MegaBox.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // http://localhost:8080/event-contents/1
    @GetMapping("/event-title/{EVENT_ID}")
    public String getTitleById(@PathVariable Integer EVENT_ID) {
        return this.eventService.getTitleById(EVENT_ID);
    }

    @GetMapping("/event-contents/{EVENT_ID}")
    public String eventImgById(@PathVariable Integer EVENT_ID) {
        return this.eventService.getImgById(EVENT_ID);
    }

    @GetMapping("/event-begin/{EVENT_ID}")
    public Date eventBeginById(@PathVariable Integer EVENT_ID) {
        return this.eventService.getBeginDate(EVENT_ID);
    }

    @GetMapping("/event-end/{EVENT_ID}")
    public Date eventEndById(@PathVariable Integer EVENT_ID) {
        return this.eventService.getEndDate(EVENT_ID);
    }

}
