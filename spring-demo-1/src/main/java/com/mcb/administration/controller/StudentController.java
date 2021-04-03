package com.mcb.administration.controller;

import com.mcb.administration.dto.HttpResponse;
import com.mcb.administration.dto.StudentDto;
import com.mcb.administration.entity.Student;
import com.mcb.administration.service.StudentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "Create Student With Passport and course",
            response = HttpResponse.class,
            responseContainer = "Student"
    )
    @PostMapping
    public ResponseEntity create(@RequestBody StudentDto student) {
        service.createStudentWithPassport(student);
        return new ResponseEntity(student, HttpStatus.CREATED);
    }

//    @PostMapping
//    public ResponseEntity create(@RequestBody Student student) {
//        service.create(student);
//        return new ResponseEntity(student, HttpStatus.CREATED);
//    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "List all the students",
            response = HttpResponse.class,
            responseContainer = "List"
    )
    @GetMapping
    public List<Student>  findAllFromTemplate(){
        logger.info("All Students -> {}");
       List std =  service.findAllFromTemplate();
       return std;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "Get the student by Id",
            response = HttpResponse.class,
            responseContainer = "Student"
    )
    @GetMapping(value = "/{id}")
    public Student  findById(@PathVariable Long id){
        logger.info("Find Student by Id -> {}");
        Student std =  service.findById(id);
        return std;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "Delete student by id",
            response = HttpResponse.class,
            responseContainer = "int"
    )
    @DeleteMapping(value = "/{id}")
    public int  deleteById(@PathVariable String id){
        logger.info("delete Student by Id -> {}");
        int std =  service.deleteById(id);
        return std;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "Create student ",
            response = HttpResponse.class,
            responseContainer = "int"
    )
    @PostMapping(value = "/create")
    public Student  createUsingTemplate(@RequestBody Student student){
        logger.info("Create Student -> {}");
        Student id = service.createUsingJpa(student);
        return id;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "Update student ",
            response = HttpResponse.class,
            responseContainer = "int"
    )
    @PutMapping(value = "/{id}")
    public int update (@PathVariable String id, @RequestBody Student student){
        logger.info("Create Student -> {}");
        int delete = service.updateUsingTemplate(id,student);
        return delete;
    }
}
