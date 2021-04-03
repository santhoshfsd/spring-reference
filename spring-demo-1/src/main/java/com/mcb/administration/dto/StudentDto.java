package com.mcb.administration.dto;


import com.mcb.administration.entity.Passport;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class StudentDto {

    private String firstName;
    private String lastName;
    private long phoneNumber;
    private PassportDto passport;
//    private List<CourseDto> courseDtoList;
}

