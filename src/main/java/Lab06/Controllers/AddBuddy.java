package Lab06.Controllers;

import Lab06.Models.Book;
import Lab06.Models.Buddy;
import Lab06.Models.Newbud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddBuddy {
    private Book book = new Book();

    @GetMapping("/addBuddy")
    public Newbud addBuddy(@RequestParam String name, @RequestParam String phone) {
        return new Newbud(name, phone);
    }

    @PostMapping("/addBuddy")
    public String addBuddySubmit(@ModelAttribute Buddy buddy) {
        book.addBuddies(buddy);
        return "newBuddy";
    }

    @GetMapping("/addressBook")
    public String getBook(Model model) {
        book.setString();
        model.addAttribute("book", book);
        return "addressBook";
    }
}
