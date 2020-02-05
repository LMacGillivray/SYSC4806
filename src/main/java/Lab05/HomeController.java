package Lab05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/index")
    public @ResponseBody String greeting() {
        return "Helloo, World";
    }

}
