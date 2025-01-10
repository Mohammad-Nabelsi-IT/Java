package com.example.event.attendee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendeeService {
    private final AttendeeRepository attendeeRepository;

    public AttendeeService(AttendeeRepository attendeeRepository) {
        this.attendeeRepository = attendeeRepository;
    }

    public Attendee createAttendee(Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    public List<Attendee> allAttendees() {
        return attendeeRepository.findAll();
    }

    public void delete(Attendee attendee) {
        attendeeRepository.delete(attendee);
    }

    public Attendee getAttendee(Integer id) {
        return attendeeRepository.findById(id).get();
    }

}
