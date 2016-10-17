package hello;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting" )
    public GreetingsList greeting(@RequestParam(value="name", defaultValue="World") String name) {
      GreetingsList l = new GreetingsList(Arrays.asList(new Greeting(3, "bdbfkd")));
        return l;zzz
    }

}