package top.aidan.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Aidan on 2021/8/28 20:53
 * GitHub: github.com/huaxin0304
 * Blog: aidanblog.top
 */

@Controller
public class LoginServlet {

    @RequestMapping("/")
    public String login() {
        return "login";
    }
}
