package BabyStat.domain;

import java.sql.Time;
import java.util.Date;

public class Event {

    private Long id;
    private Time sleep;
    private Time feedingTime;
    private Long amountOfFood;
    private boolean dirty;
    private boolean wet;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getSleep() {
        return sleep;
    }

    public void setSleep(Time sleep) {
        this.sleep = sleep;
    }

    public Time getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(Time feedingTime) {
        this.feedingTime = feedingTime;
    }

    public Long getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(Long amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
