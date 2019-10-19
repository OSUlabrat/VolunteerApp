package com.mrpanda2.volunteerapp;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Date;
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
        mEvents = new ArrayList<>();
        for (int i=1; i < 30; i++){
            Event event = new Event();
            Date date = new Date(2020,1,i);
            event.setName("Event #" + i);
            event.setTime("12:00");
            event.setLocation("OSU");
            event.setDate(date);
            mEvents.add(event);
        }
    }
}
