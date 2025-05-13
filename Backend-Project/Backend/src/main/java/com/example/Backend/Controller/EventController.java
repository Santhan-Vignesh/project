package com.example.Backend.Controller;

import com.example.Backend.Model.Event;
import com.example.Backend.Service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EvenController {

    private final EventService eventService;

    // Constructor Injection
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // GET: Retrieve a specific event by ID (using @PathVariable)
    @GetMapping("/GetEvent/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable Long id) {
        Event event = eventService.getEventId(id);
        System.out.println("Admin sign done: ");
        return ResponseEntity.ok(event);
    }

    @GetMapping("/GetSingleEvent")
    public ResponseEntity<Event> getSingleEvent() {
        Event event = eventService.findSingleEvent();
        System.out.println("Hello guys your single event purpose");
        return ResponseEntity.ok(event);
    }

    // GET: Retrieve all events
    @GetMapping("/GetAllEvent")
    public ResponseEntity<List<Event>> findAllEvents() {
        List<Event> events = eventService.getEvents();
        return ResponseEntity.ok(events);
    }

    // POST: Save a single event
    @PostMapping("/postEvent")
    public ResponseEntity<Event> postEvent(@RequestBody Event event) {
        Event savedEvent = eventService.saveEvent(event);
        return ResponseEntity.ok(savedEvent);
    }

    // POST: Save multiple events
    @PostMapping("/postAllEvent")
    public ResponseEntity<List<Event>> postEvents(@RequestBody List<Event> events) {
        List<Event> savedEvents = eventService.saveEvents(events);
        return ResponseEntity.ok(savedEvents);
    }

    // PUT: Update an event by ID
    @PutMapping("/update/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event event) {
        Event updatedEvent = service.updateEventId(id, event);
        return ResponseEntity.ok(updatedEvent);
    }

    // PUT: Update event name by name parameter
    @PutMapping("/updateName/{name}")
    public ResponseEntity<Event> updateNameEvent(@PathVariable String name, @RequestBody Event event) {
        Event updatedEvent = eventService.updateEventName(name, event);
        return ResponseEntity.ok(updatedEvent);
    }

    // DELETE: Delete a single event by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> removeEvent(@PathVariable Long id) {
        Event deletedEvent = eventService.deleteEventId(id);
        if (deletedEvent != null) {
            return ResponseEntity.ok("Event deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE: Delete multiple events by list of IDs
    @DeleteMapping("/deleteMultiple")
    public ResponseEntity<String> removeEvents(@RequestBody List<Long> eventIds) {
        eventService.deleteEventById(eventIds);
        return ResponseEntity.ok("Events deleted successfully.");
    }
}