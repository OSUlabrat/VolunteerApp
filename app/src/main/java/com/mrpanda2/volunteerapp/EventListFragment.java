package com.mrpanda2.volunteerapp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public class EventListFragment extends Fragment{
    private RecyclerView mEventRecyclerView;
    private EventAdapter mAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_event_list,container, false);

        mEventRecyclerView = (RecyclerView) view.findViewById(R.id.event_recycler_view);
        mEventRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }
    private void updateUI(){
        EventList eventList = EventList.get(getActivity());
        List<Event> events = eventList.getEvents();

        mAdapter = new EventAdapter((events));
        mEventRecyclerView.setAdapter(mAdapter);
    }
    private class EventHolder extends RecyclerView.ViewHolder{
        private TextView eventTitle;
        private TextView eventDate;
        private TextView eventTime;
        private TextView eventLocation;
        private Event mEvent;
        public EventHolder (LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.list_item_event, parent, false));

            eventTitle = (TextView) itemView.findViewById(R.id.event_name);
            eventDate= (TextView) itemView.findViewById(R.id.event_date);
            eventTime = (TextView) itemView.findViewById(R.id.event_time);
            eventLocation = (TextView) itemView.findViewById(R.id.event_location);

        }
        public void bind(Event event){
            mEvent = event;
            eventTitle.setText(mEvent.getName());
            eventDate.setText(mEvent.getDate().toString());
            eventTime.setText(mEvent.getTime());
            eventLocation.setText((mEvent.getLocation()));


        }
    }
    private class EventAdapter extends RecyclerView.Adapter<EventHolder> {
        private List<Event> mEvents;

        public EventAdapter(List<Event> events){
            mEvents = events;
        }
        @Override
        public EventHolder onCreateViewHolder(ViewGroup parent, int viewType){
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new EventHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(EventHolder holder, int pos){
            Event event = mEvents.get(pos);
            holder.bind(event);
        }
        @Override
        public int getItemCount(){
            return mEvents.size();
        }
    }
}
