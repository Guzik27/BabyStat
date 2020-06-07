package BabyStat.Controller;

import BabyStat.dao.BabyDao;
import BabyStat.Domain.Baby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BabyStatController {

    @Autowired
    private BabyDao babyDao;


    @GetMapping
    public String welcome() {
        return "welcome";
    }

    @GetMapping("children/{babyId}")
    public String babyId() {
        return "babyId";
    }


    @GetMapping("children")
    public String children(Model model) {
        model.addAttribute("children", babyDao.getChildren());
        return "children";
    }

    @GetMapping("children/remove/{babyId}")
    public String removeBaby(@PathVariable Long babyId){
        babyDao.removeBaby(babyId);
        return "redirect:/children";
    }

    @GetMapping("children/new")
    public String newBaby(Model model) {
        model.addAttribute("baby", new Baby());
        return "baby";
    }

    @PostMapping("children/save")
    public String saveBaby(Baby baby) {
        babyDao.saveBaby(baby);
        return "redirect:/children";
    }

    @GetMapping("children/edit/{babyId}")
    public String editBaby(@PathVariable Long babyId, Model model) {
        Baby baby = babyDao.getById(babyId);
        model.addAttribute("baby", baby);
        return "baby";
    }

}
