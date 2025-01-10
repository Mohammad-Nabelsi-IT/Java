package com.example.event.event;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller
@RequestMapping("/ev")
public class EventController {
    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;

    }


    @PostMapping("/new")
    public String create(@RequestParam(value = "name") String name
            , @RequestParam(value = "date") LocalDate date
            , @RequestParam(value = "time") LocalTime time
            , @RequestParam(value = "venue") String venue
            , @RequestParam(value = "description") String description
            , @RequestParam(value = "capacity") Integer capacity) {

        Event event = new Event();
        event.setName(name);
        event.setDate(date);
        event.setTime(time);
        event.setVenue(venue);
        event.setDescription(description);
        event.setCapacity(capacity);
        event = eventService.createEvent(event);
        return "redirect:/ev/view";
    }

    @GetMapping("/view")
    public String show(Model model) {
        List<Event> events = eventService.allEvents();
        model.addAttribute("events", events);
        return "event";

    }

    @GetMapping("")
    public String index(Model model) {
        System.out.println("Starting index...");
        List<Event> events = eventService.allEvents();
        System.out.println("all events : " +events);
        model.addAttribute("events", events);
        return "indexxxx";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Event event = eventService.getEvent(id);
        eventService.delete(event);
        return "redirect:/ev/view";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        Event event = eventService.getEvent(id);
        model.addAttribute("event", event);
        return "event_edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") int id
            , @RequestParam(value = "name") String name
            , @RequestParam(value = "date") LocalDate date
            , @RequestParam(value = "time") LocalTime time
            , @RequestParam(value = "venue") String venue
            , @RequestParam(value = "description") String description
            , @RequestParam(value = "capacity") Integer capacity) {

        Event event = eventService.getEvent(id);
        event.setName(name);
        event.setDate(date);
        event.setTime(time);
        event.setVenue(venue);
        event.setDescription(description);
        event.setCapacity(capacity);
        event = eventService.createEvent(event);
        return "redirect:/ev/view";
    }


}



