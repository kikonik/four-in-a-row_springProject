package pu.fmi.cources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @ResponseBody
    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }
}
