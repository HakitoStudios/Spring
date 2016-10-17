package hello;

import java.util.List;

/**
 * Created by Oleg on 15.10.2016.
 */
public class GreetingsList {
    private List<Greeting> greetings;

    public GreetingsList(List<Greeting> greetings) {
        this.greetings = greetings;
    }

    public GreetingsList() {
    }

    public List<Greeting> getGreetings() {
        return greetings;
    }

    public void setGreetings(List<Greeting> greetings) {
        this.greetings = greetings;
    }
}
