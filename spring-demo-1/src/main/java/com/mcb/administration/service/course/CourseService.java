package com.mcb.administration.service.course;

import com.mcb.administration.dao.course.CourseJpaRepository;
import com.mcb.administration.dto.CourseDto;
import com.mcb.administration.entity.Course;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CourseService {

    private CourseJpaRepository courseJpaRepository;

    public CourseService(CourseJpaRepository courseJpaRepository) {
        this.courseJpaRepository = courseJpaRepository;
    }

    public Course findById(int id) {
       return courseJpaRepository.findById(id);
    }

    public Course createCourse(CourseDto courseDto) {
        ModelMapper mapper = new ModelMapper();
        Course course = mapper.map(courseDto, Course.class);
        Course updated = courseJpaRepository.createOrUpdate(course);
        return updated;
    }
}
