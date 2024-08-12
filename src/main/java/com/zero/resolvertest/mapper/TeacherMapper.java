package com.zero.resolvertest.mapper;

import com.zero.resolvertest.pojo.entity.Student;
import com.zero.resolvertest.pojo.entity.Teacher;
import org.apache.ibatis.annotations.*;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.mapper
 * @Author: zero
 * @CreateTime: 2024-07-16  14:39
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface TeacherMapper {
    @Select("select * from teacher where id = #{id}")
    Student getById(Long id);

    @Insert("insert into student" +
            "        (id, name, sex)" +
            "        values (#{id}, #{name}, #{sex})")
    void save(Teacher teacher);

    @Delete("delete from teacher where id =#{id}")
    Boolean deleteById(Long id);

    @Update("update teacher set name = #{name},sex = #{sex}  where id = #{id}")
    Boolean updateById(Teacher teacher);


}
