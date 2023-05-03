package teamskiy.eventtracker.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import teamskiy.eventtracker.pojos.Event;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @ModelAttribute
    public void addSomeEventsToModel (Model model) {
        List<Event> events = Arrays.asList(
                new Event("Arctic Monkeys", new Date(2023, 7, 4), "https://www.atelier.lu/shows/arctic-monkeys-2/"),
                new Event("Macklemore", new Date(2023, 8, 16), "https://www.atelier.lu/shows/macklemore-2/"),
                new Event("PAPA ROACH + HOLLYWOOD UNDEAD", new Date(2023, 6, 17), "https://rockhal.lu/shows/papa-roach/")
        );

        model.addAttribute("events", events);
    }

    @GetMapping
    public String showTestPage() {
        return "test";
    }
}
