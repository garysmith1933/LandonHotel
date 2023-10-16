package edu.wgu.d387_sample_code;


import java.util.Locale;
import java.util.ResourceBundle;

public class MessageDisplay extends Thread {
    @Override
    public void run() {}

    public static String getWelcomeMessage(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Languages", locale);
        String welcomeMessage = resourceBundle.getString("welcomeMessage");
        System.out.print("returning message" + " " + welcomeMessage);
        return welcomeMessage;
    }

}
