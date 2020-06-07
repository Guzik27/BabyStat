package BabyStat.dao;

import BabyStat.model.SelectedEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedEventDao extends CrudRepository<SelectedEvent, Integer> {
    SelectedEvent findByEvent(String event);
}
