package BabyStat.controller;

import BabyStat.dao.BabyDao;
import BabyStat.dao.EventDao;
import BabyStat.domain.Baby;
import BabyStat.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import java.util.Date;

@Controller
public class SelectedEventController {

    @Autowired
    private EventDao eventDao;

    @Value("${app.title.select}")
    private String title;

    @GetMapping("children/select/{babyId}")
    public String selectEventOPage(Model model, @PathVariable String babyId) {
        model.addAttribute("title", title);
        model.addAttribute("event", eventDao.getEvents());
        return "select";
    }

    @GetMapping("children/select/{babyId}/remove/{eventId}")
    public String removeEvent(@PathVariable Long eventId, @PathVariable String babyId){
        eventDao.removeEvent(eventId);
        return "select";
    }

    @GetMapping("children/select/{babyId}/new")
    public String newEvent(Model model, @PathVariable String babyId) {
        model.addAttribute("event", new Event());
        return "event";
    }

    @PostMapping("children/select/{babyId}/save")
    public String saveEvent(Event event, @PathVariable String babyId) {
        eventDao.saveEvent(event);
        return "select";
    }

    @GetMapping("children/select/{babyId}/edit/{eventId}")
    public String editEvent(@PathVariable Long eventId, Model model, @PathVariable String babyId) {
        Event event = eventDao.getById(eventId);
        model.addAttribute("event", event);
        return "event";
    }



}
