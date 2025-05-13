package com.example.Backend.Service;

import com.example.Backend.Model.Event;
import com.example.Backend.Repository.EventRepository;

import java.util.List;

public class EventService {

    private final EventRepository eventRepository;
    private final Event event;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event EventRequestDto){}

    public Event getEventById(String name){}

    public EventStatsResponse getEventStats(){}

    public Event getEventId(Long eventId) {
        return eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + eventId));
    }

    public Event findSingleEvent() {
        return eventRepository.findAll().stream().findFirst()
                .orElseThrow(() -> new RuntimeException("No events found."));
    }

    public List<Long> getAllEvents() {
        return eventRepository.findAll();
    }

    public void deleteEventById(List<Long> eventIds) {
        List<Event> events = eventRepository.findAllById(eventIds);
        if (events.isEmpty()) {
            throw new RuntimeException("No events found with the provided IDs.");
        }
        eventRepository.deleteAll(events);
    }

    public Event deleteEventId(Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + id));
        eventRepository.delete(event);
        return event;
    }


    public Event updateEventName(String name, Event event) {
        event.setName(name);
        return eventRepository.save(event);
    }
}
