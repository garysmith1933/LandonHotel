package edu.wgu.d387_sample_code.controllers;

import edu.wgu.d387_sample_code.MessageDisplay;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/messages")
public class MessageController {

    @GetMapping("/en")
    public String getEnglishWelcomeMessage() {
        Locale usLocale = new Locale("en", "US");
        MessageDisplay enMessageDisplayThread = new MessageDisplay();

        enMessageDisplayThread.start();

        return MessageDisplay.getWelcomeMessage(usLocale);
    }

    @GetMapping("/fr")
    public String getFrenchWelcomeMessage() {
        Locale frLocale = new Locale("fr", "CA");
        MessageDisplay frMessageDisplayThread = new MessageDisplay();
        frMessageDisplayThread.start();

        return MessageDisplay.getWelcomeMessage(frLocale);
    }
}
