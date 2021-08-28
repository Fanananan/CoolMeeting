package top.aidan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.aidan.bean.Department;
import top.aidan.mapper.DepartmentMapper;

/**
 * Created by Aidan on 2021/8/28 19:53
 * GitHub: github.com/huaxin0304
 * Blog: aidanblog.top
 */

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {
        return departmentMapper.getDepById(id);
    }
}
