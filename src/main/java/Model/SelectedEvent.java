package Model;

import ch.qos.logback.classic.boolex.GEventEvaluator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "selected_event")          // pozwala sterować nazwą tabeli
public class SelectedEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // generuje wartość
    private Integer id;

    private String event;
    private Date ctime;

    public SelectedEvent() {
    }

    public SelectedEvent(String event, Date ctime) {
        this.event = event;
        this.ctime = ctime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
