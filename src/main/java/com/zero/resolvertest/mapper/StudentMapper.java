package com.zero.resolvertest.mapper;

import com.zero.resolvertest.pojo.entity.Student;
import org.apache.ibatis.annotations.*;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.mapper
 * @Author: zero
 * @CreateTime: 2024-07-16  14:38
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student where id = #{id}")
    Student getById(Long id);

    @Insert("insert into student" +
            "        (id, name, sex, teacher)" +
            "        values (#{id}, #{name}, #{sex}, #{teacher})")
    void save(Student student);

    @Insert("insert into student (name) values #{name}")
    void saveByName(String name);

    @Insert("insert into student (name) values  (#{id1}, #{name})")
    void saveOne(Long id1,String name);

    @Delete("delete from student where id =#{id}")
    Boolean deleteById(Long id);
    @Update("update student set name = #{name},sex = #{sex} ,teacher = #{teacher} where id = #{id}")
    Boolean updateById(Student student);

    @Select("select name from student where id = #{id}")
    String getName(Long id);

    @Update("update student set name = #{name} where id <= #{id}")
    Boolean updateName(Long id,String name);

    @Update("update student set name = #{name} where id=#{id}")
    Boolean updateBatch(Long id,String name);

    @Update("update student set name = #{name} where id=#{id2}")
    Boolean saveByCertain(Long id2,String name);
}
