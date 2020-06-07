package BabyStat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectedEventController {

    @Value("${app.title.select}") // wstrzykiwanie do zmiennej title tego co mamy w application properties
    private String title;

    /*@GetMapping("select")
    public String selectEventPage(Model model) {
        model.addAttribute("title", title);
        return "select";
    }*/

    @GetMapping("children/{select}")
    public String selectEventOPage(Model model) {
        model.addAttribute("title", title);
        return "select";
    }
}
