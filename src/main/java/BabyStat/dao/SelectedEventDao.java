package BabyStat.dao;

import Model.SelectedEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository         /*Typ encji i typ klucza głównego w crud repository*/
public interface SelectedEventDao extends CrudRepository<SelectedEvent, Integer> {
    SelectedEvent findByEvent(String event); /*zgłaszamy potrzebę wprowadzenia dowolnej metody do naszego dao, nie jest konieczna implementacja tych metod*/
}
