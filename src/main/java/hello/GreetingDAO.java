package hello;

import java.util.List;

/**
 * Created by Oleg on 15.10.2016.
 */
public interface GreetingDAO {
     void save(Greeting g);
    List<Greeting> get();

}
