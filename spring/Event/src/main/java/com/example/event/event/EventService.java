package com.example.event.event;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> allEvents() {
        return eventRepository.findAll();
    }

    public void delete(Event event) {
        eventRepository.delete(event);
    }

    public Event getEvent(Integer id) {
        return eventRepository.findById(id).get();
    }



}
