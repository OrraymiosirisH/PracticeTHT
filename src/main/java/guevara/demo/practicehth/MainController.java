package guevara.demo.practicehth;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class MainController {


    @RequestMapping("/")

    public String sayhello(Model model){

        //String message = "This is a text from sayHello() method";

        model.addAttribute("myMessage","Somos duros todo el tiempo!");

        return "index";

    }

    @GetMapping("/test")
    public @ResponseBody
    String showIndex()

    {

        return "We are here!:";
    }



}
