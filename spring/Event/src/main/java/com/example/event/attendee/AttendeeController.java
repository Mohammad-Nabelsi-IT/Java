package com.example.event.attendee;

import com.example.event.event.Event;
import com.example.event.event.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/att")
public class AttendeeController {

    @Autowired
    private  EventService eventService;

    private AttendeeService attendeeService;

    public AttendeeController(AttendeeService attendeeService) {
        this.attendeeService = attendeeService;
    }

    @PostMapping("/create")
    public String createAttendee(@RequestParam(value = "name") String name
            , @RequestParam(value = "email") String email
            , @RequestParam(value = "phone") String phone
            , @RequestParam(value = "event_id") int event_id) {
        Event event = eventService.getEvent(event_id);
        Attendee attendee = new Attendee();
        attendee.setName(name);
        attendee.setEmail(email);
        attendee.setPhone(phone);
        attendee.setEvent(event);
        attendeeService.createAttendee(attendee);
        return "redirect:/att/show";
    }

    @GetMapping("/show")
    public String showAttendee(Model model) {
        model.addAttribute("att", attendeeService.allAttendees());
        model.addAttribute("ev", eventService.allEvents());
        return "attendee";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "id") int id) {
        Attendee attendee = attendeeService.getAttendee(id);
        attendeeService.delete(attendee);
        return "redirect:/att/show";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam(value = "id") int id) {
        Attendee attendee = attendeeService.getAttendee(id);
        model.addAttribute("att", attendee);
        model.addAttribute("ev", eventService.allEvents());
        return "attendee_edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam(value = "id") Integer id
            , @RequestParam(value = "name") String name
            , @RequestParam(value = "email") String email
            , @RequestParam(value = "phone") String phone
            , @RequestParam(value = "event_id") int event_id) {
        Attendee attendee = attendeeService.getAttendee(id);
        attendee.setName(name);
        attendee.setEmail(email);
        attendee.setPhone(phone);
        attendee.setId(event_id);
        attendee=attendeeService.createAttendee(attendee);
        return "redirect:/att/show";
    }


}
