package com.mrpanda2.volunteerapp;
import android.content.Context;
import java.util.List;
import java.util.UUID;
public class EventList {
    private static EventList sEventList;
    private List<Event> mEvents;

    public static EventList get(Context context){
        if (sEventList == null){
            sEventList = new EventList(context);
        }
        return sEventList;
    }

    public List<Event> getEvents(){
        return mEvents;
    }

    public Event getEvent(UUID id){
        for (Event event : mEvents){
            if (event.getId().equals(id)){
                return event;
            }
        }
        return null;
    }
    private EventList(Context context){
        for (int i=0; i < 30; i++){
            Event event = new Event();
            event.setName("Event #" + i);
            event.setTime("12:00");
            event.setLocation("OSU");
            mEvents.add(event);
        }
    }
}
