package temp.Controller;
/*
import temp.Model.Buddy;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Book {

    private ArrayList buddies = new ArrayList();

    @GetMapping("/viewBook")
    public List<Buddy> buddy() {
        return buddies;
    }

    @PostMapping("/addBuddy")
    public String addSubmit(@ModelAttribute Buddy buddy) {
        return "results";
    }

    @GetMapping("/removeBuddy")
    public String removeBuddy(Model model) {
        model.addAttribute("buddy", new Buddy());
        return "removeBuddy";
    }

    @PostMapping("/removeBuddy")
    public String removeSubmit(@ModelAttribute Buddy buddy) {
        // addrBook.deleteById(buddy.getId());
        return "results";
    }
    /*private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();
    private ArrayList<Buddy> buddies = new ArrayList<Buddy>();
    private String str = "";

    @GetMapping("/addBuddy")
    public String addBuddy(temp.Model model) {
        model.addAttribute("buddy", new Buddy());
        return "addBuddy";
    }

    @PostMapping("/addBuddy")
    public String addSubmit(@ModelAttribute Buddy buddy) {
        buddies.add(buddy);
        setString();
        return "results";
    }

    @GetMapping("/removeBuddy")
    public String removeBuddy(temp.Model model) {
        model.addAttribute("buddy", new Buddy());
        return "removeBuddy";
    }

    @PostMapping("/removeBuddy")
    public String removeSubmit(@ModelAttribute Buddy buddy) {
        buddies.remove(buddy.getId());
        resetString();
        return "results";
    }

    public void setString() {
        str += buddies.get(buddies.size()-1) + "\n\r";
        System.out.println(str);
    }

    public void resetString() {
        String tmp = "";
        for(Buddy buddy : buddies) {
            tmp += buddy + "\n\r";
        }
        str = tmp;
    }

    public String getStr() {
        return str;
    }


}

*/