package com.zero.resolvertest.controller.teacher;

import com.zero.resolvertest.pojo.entity.Student;
import com.zero.resolvertest.pojo.entity.Teacher;
import com.zero.resolvertest.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.controller.teacher
 * @Author: zero
 * @CreateTime: 2024-07-16  14:33
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/save")
    public Boolean save(@RequestBody Teacher teacher){
        teacherService.save(teacher);
        return true;
    }

    @PostMapping("/update")
    public Boolean updateById(@RequestBody Teacher teacher){
        teacherService.updateById(teacher);
        return true;
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id){
        return teacherService.deleteById(id);
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable Long id){
        return teacherService.getById(id);
    }
}
