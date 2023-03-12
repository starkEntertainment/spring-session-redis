package controllers;

import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/user")
    @ResponseBody
    public String getUser(HttpSession session){
        logger.error("asdasdasdaddfffffs");
        return "test111";
    }
    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
