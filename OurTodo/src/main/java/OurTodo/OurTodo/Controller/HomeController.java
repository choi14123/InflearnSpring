package OurTodo.OurTodo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @PostMapping(value = "/android")
    @ResponseBody
    public String androidResponse(@RequestBody User user) {
        System.out.println("HomeController.androidResponse");
        System.out.println("연결되었습니다.");
        System.out.println("id : = " + user.getId() + " password : = " + user.getPassword());
        return "1";
    }
}