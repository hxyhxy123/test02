package com.zero.resolvertest.service.impl;

import com.zero.resolvertest.mapper.StudentMapper;
import com.zero.resolvertest.mapper.TeacherMapper;
import com.zero.resolvertest.pojo.entity.Student;
import com.zero.resolvertest.pojo.entity.Teacher;
import com.zero.resolvertest.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.service.impl
 * @Author: zero
 * @CreateTime: 2024-07-16  14:37
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public Student getById(Long id) {
        return teacherMapper.getById(id);
    }

    @Override
    public void save(Teacher teacher) {
        teacherMapper.save(teacher);
    }

    @Override
    public Boolean deleteById(Long id) {
        teacherMapper.deleteById(id);
        return true;
    }

    @Override
    public Boolean updateById(Teacher teacher) {
        teacherMapper.updateById(teacher);
        return true;
    }
}
