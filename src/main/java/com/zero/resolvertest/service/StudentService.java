package com.zero.resolvertest.service;

import com.zero.resolvertest.pojo.entity.Student;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.service
 * @Author: zero
 * @CreateTime: 2024-07-16  14:34
 * @Description: TODO
 * @Version: 1.0
 */
public interface StudentService {
    Student getById(Long id);

    void save(Student student);

    Boolean deleteById(Long id);

    Boolean updateById(Student student);

    String updateInfo(Long id);

    Boolean saveByName(String name);

    Boolean update(Long id,String name);

    Boolean saveByCertain(String name);
}
