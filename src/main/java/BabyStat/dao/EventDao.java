package BabyStat.dao;

import BabyStat.domain.Event;

import java.util.List;

public interface EventDao {
        List<Event> getEvents();
        void removeEvent(Long id);
        void saveEvent(Event event);
        Event getById(Long id);

}
