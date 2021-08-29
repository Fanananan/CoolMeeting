package top.aidan.mapper;

import top.aidan.bean.Employee;

/**
 * Created by Aidan on 2021/8/29 20:20
 * GitHub: github.com/huaxin0304
 * Blog: aidanblog.top
 */

public interface EmployeeMapper {

    Employee loadEmpByUsername(String username);
}
