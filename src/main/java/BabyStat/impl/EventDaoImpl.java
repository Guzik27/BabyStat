package BabyStat.impl;

import BabyStat.dao.EventDao;
import BabyStat.domain.Baby;
import BabyStat.domain.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EventDaoImpl implements EventDao {

    private Map<Long, Event> eventMap;
    private static Long id = 1L;

    @Override
    public List<Event> getEvents() {
        return new ArrayList<>(eventMap.values());
    }

    public EventDaoImpl() {
        this.eventMap = new HashMap<>();
        prepareEventList();
    }



    /*======================================*/

    @Override
    public void removeEvent(Long id) {
        eventMap.remove(id);
    }

    @Override
    public void saveEvent(Event event) {
        if (event.getId() < 1) {
            event.setId(id);
            id++;
        }
        eventMap.put(event.getId(), event);
    }

    @Override
    public Event getById(Long id) {
        return eventMap.get(id);
    }

    private void prepareEventList() {
        Event event = new Event();
        event.setId(id);
        event.setDirty(true);
        event.setNote("Wszystko w porządku");
        event.setWet(false);
        event.getSleep();
    }
}
