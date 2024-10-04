package com.Mega.MegaBox.service;

import com.Mega.MegaBox.model.EventModel;
import com.Mega.MegaBox.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventService {

    private EventRepository eventRepository;

    // 생성자
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    // 모든 데이터 가져오기 (사용안함)
    public List<EventModel> getAllEvent() {
        return eventRepository.findAll();
    }

    // id별 title 가져오기
    public String getTitleById(Integer EVENT_ID) {
        return eventRepository.findById(EVENT_ID).get().getEVENT_TITLE();
    }

    // id별 img 가져오기
    public String getImgById(Integer EVENT_ID) {
        return eventRepository.findById(EVENT_ID).get().getEVENT_IMG();
    }

    // id별 시작일
    public Date getBeginDate(Integer EVENT_ID) {
        return eventRepository.findById(EVENT_ID).get().getEVENT_BEGIN();
    }

    // id별 종료일
    public Date getEndDate(Integer EVENT_ID) {
        return eventRepository.findById(EVENT_ID).get().getEVENT_END();
    }

}
