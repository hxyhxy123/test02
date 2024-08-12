package com.zero.resolvertest.service.impl;

import com.zero.resolvertest.mapper.StudentMapper;
import com.zero.resolvertest.pojo.entity.Student;
import com.zero.resolvertest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @BelongsProject: ResolverTest
 * @BelongsPackage: com.zero.resolvertest.service.impl
 * @Author: zero
 * @CreateTime: 2024-07-16  14:37
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student getById(Long id) {
        if(id!=null){
            return studentMapper.getById(id);
        }else{
            return null;
        }
    }

    @Override
    public void save(Student student) {
        studentMapper.save(student);
    }



    @Override
    public Boolean deleteById(Long id) {
        studentMapper.deleteById(id);
        return true;
    }

    @Override
    public Boolean updateById(Student student) {
        studentMapper.updateById(student);
        return true;
    }

    @Override
    public String updateInfo(Long id) {
        if(id==1){
            return studentMapper.getName(id);
        }else if(id==2){
            studentMapper.deleteById(id);
            return "id==2";
        }else{
            return "id不正确";
        }
    }

    @Override
    public Boolean saveByName(String name) {
        if(name=="小明"){
            studentMapper.saveByName(name);
        }else if(name=="小芳"){
            Long id1=12L;
            studentMapper.saveOne(id1,name);
        }else{
            Long id=6L;
            studentMapper.updateBatch(id,name);
        }
        return true;
    }

    @Override
    public Boolean update(Long id, String name) {
        if(name==null){
            return false;
        }else if(name=="小红"){
            studentMapper.updateName(id,name);
        }else if(name=="小林"){
            if(id==10){
                studentMapper.saveByName(name);
            }else if(id>20){
                Long id1=id*id;
                studentMapper.saveOne(id1,name);
            }
        }else if(name=="小阳"&&id!=3){
            if(id<0){
                studentMapper.deleteById(id);
            }
        }else{
            studentMapper.updateBatch(id,name);
        }
        return true;
    }

    @Override
    public Boolean saveByCertain(String name) {
        Long id2= 9L;
        studentMapper.saveByCertain(id2,name);
        return true;
    }
}
