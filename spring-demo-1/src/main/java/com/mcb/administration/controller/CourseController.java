package com.mcb.administration.controller;

import com.mcb.administration.dto.CourseDto;
import com.mcb.administration.dto.HttpResponse;
import com.mcb.administration.entity.Course;
import com.mcb.administration.service.course.CourseService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "fetch the course by id",
            response = HttpResponse.class,
            responseContainer = "Course"
    )
    @PostMapping(value = "")
    public Course createCourse(@RequestBody CourseDto courseDto) {
        Course course = courseService.createCourse(courseDto);
        return course;
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="Authorization", value = "Auth Token", required = true, dataType = "string",
                    paramType = "header")
    })
    @ApiOperation(
            value = "fetch the course by id",
            response = HttpResponse.class,
            responseContainer = "Course"
    )
    @GetMapping(value = "/{id}")
    public Course findById(@PathVariable int id) {
        return courseService.findById(id);
    }
}
