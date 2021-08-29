package top.aidan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aidan.bean.Employee;
import top.aidan.mapper.EmployeeMapper;

/**
 * Created by Aidan on 2021/8/29 20:26
 * GitHub: github.com/huaxin0304
 * Blog: aidanblog.top
 */

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee doLogin(String username, String password) {
        Employee employee = employeeMapper.loadEmpByUsername(username);
        if (employee == null || !employee.getPassword().equals(password)) {
            return null;
        }
        return employee;
    }
}
