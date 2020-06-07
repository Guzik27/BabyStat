package BabyStat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectedEventController {

    @GetMapping("/select")
    public String SelectEventPage() {
        return "select";
    }

}
