package top.aidan.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.aidan.bean.Employee;
import top.aidan.service.EmployeeService;

import javax.servlet.http.HttpSession;

/**
 * Created by Aidan on 2021/8/28 20:53
 * GitHub: github.com/huaxin0304
 * Blog: aidanblog.top
 */

@Controller
public class LoginServlet {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(String username, String password, Model model, HttpSession httpSession) {
        Employee employee = employeeService.doLogin(username, password);

        if (employee == null) {
            model.addAttribute("error", "用户名或密码输入错误，登录失败");
            return "forward:/";
        } else {
            if (employee.getStatus() == 0) {
                model.addAttribute("error", "用户待审批");
                return "forward:/";
            } else if (employee.getStatus() == 2) {
                model.addAttribute("error", "用户审批未通过");
                return "forward:/";
            } else {
                httpSession.setAttribute("currentuser", employee);
                return "redirect:/notifications";
            }
        }

    }
}
