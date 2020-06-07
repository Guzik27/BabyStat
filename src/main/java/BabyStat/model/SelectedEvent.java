package BabyStat.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "selected_event")
public class SelectedEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String event;
    private Date ctime;



    public SelectedEvent() {
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
