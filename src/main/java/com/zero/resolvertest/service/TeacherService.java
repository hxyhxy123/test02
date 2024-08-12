package com.zero.resolvertest.service;

import com.zero.resolvertest.pojo.entity.Student;
import com.zero.resolvertest.pojo.entity.Teacher;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.service
 * @Author: zero
 * @CreateTime: 2024-07-16  14:34
 * @Description: TODO
 * @Version: 1.0
 */
public interface TeacherService {
    Student getById(Long id);

    void save(Teacher teacher);

    Boolean deleteById(Long id);

    Boolean updateById(Teacher teacher);
}
