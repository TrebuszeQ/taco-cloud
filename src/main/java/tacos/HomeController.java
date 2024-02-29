package tacos;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class HomeController {
    @GetMapping("/")
    public String getHome() { return "home"; }
}
