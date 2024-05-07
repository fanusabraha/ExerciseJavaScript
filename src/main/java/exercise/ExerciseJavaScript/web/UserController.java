package exercise.ExerciseJavaScript.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/login")
    public String userLogin(ModelMap map){
        return "login";
    }
}
