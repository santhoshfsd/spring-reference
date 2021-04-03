package com.mcb.administration.dao;


import com.mcb.administration.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {


    JdbcTemplate template;

    public StudentDao(JdbcTemplate template){
        this.template = template;
    }
    public List<Student> findAll(){

        return template.query("select * from student",
                new BeanPropertyRowMapper(Student.class));
    }

    public Student findById(String id){

        return template.queryForObject("select * from student where id=?", new Object[]{id},
                new BeanPropertyRowMapper<Student>(Student.class));
    }

    public int deleteById(String id) {
        return template.update("delete from student where id=?", new Object[]{id});
    }

    public int insert(Student sd){
        return template.update("INSERT INTO student(ID,FIRST_NAME, LAST_NAME,PHONE_NUMBER) VALUES (?,?,?,?);",
                new Object[]{
                        sd.getId(),
                        sd.getFirstName(),
                        sd.getLastName(),
                        sd.getPhoneNumber()
                });
    }

    public int update(String id, Student sd){
        return template.update("update student set FIRST_NAME=?, LAST_NAME=?, PHONE_NUMBER=? where id=?",
                new Object[]{
                        sd.getFirstName(),
                        sd.getLastName(),
                        sd.getPhoneNumber(),
                        id
                });
    }
}
