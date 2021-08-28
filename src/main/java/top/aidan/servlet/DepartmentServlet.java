package top.aidan.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.aidan.bean.Department;
import top.aidan.service.DepartmentService;

/**
 * Created by Aidan on 2021/8/28 20:33
 * GitHub: github.com/huaxin0304
 * Blog: aidanblog.top
 */

@RestController
public class DepartmentServlet {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/dep")
    public void getDepById(Integer id) {
        Department depById = departmentService.getDepById(id);
        System.out.println(depById);
    }
}
