package com.mcb.administration.service;

import com.mcb.administration.dao.StudentDao;
import com.mcb.administration.dao.StudentJpaRepository;
import com.mcb.administration.dao.StudentRepository;
import com.mcb.administration.dto.StudentDto;
import com.mcb.administration.entity.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class StudentService {

    StudentRepository repository;
    StudentDao studentDao;
    StudentJpaRepository jpaRepository;

    public StudentService(StudentRepository repository, StudentDao studentDao, StudentJpaRepository studentJpaRepository) {
        this.repository = repository;
        this.studentDao = studentDao;
        this.jpaRepository = studentJpaRepository;
    }

    public Student create(Student student) {
        Student s = repository.save(student);
        return student;
    }

    public List<Student> findAllFromTemplate() {
     return jpaRepository.findAll();
    }

    public  Student findById(Long id) {
        return jpaRepository.findById(id);
    }

    public int deleteById(String id) {
        return studentDao.deleteById(id);
    }

    public int createUsingTemplate(Student student) {
        int s = studentDao.insert(student);
        return s;
    }

    public int updateUsingTemplate(String id, Student student) {
        int s = studentDao.update(id,student);
        return s;
    }

    @Transactional
    public Student createUsingJpa(Student student) {
        Student s = jpaRepository.insertOrUpdate(student);
        return s;
    }

    public Student createStudentWithPassport(StudentDto studentDao) {
        ModelMapper modelMapper = new ModelMapper();
        Student student = modelMapper.map(studentDao, Student.class);
        student = jpaRepository.saveStudentWithPassport(student);
        student.getId();
        return student;
    }
}
