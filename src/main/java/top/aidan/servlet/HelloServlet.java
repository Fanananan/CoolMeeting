package top.aidan.servlet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aidan on 2021/8/25 22:17
 * GitHub: github.com/huaxin0304
 * Blog: aidanblog.top
 */

@RestController
public class HelloServlet {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
