package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int studentId;
    private String name;
    private Date dateOfAdmission;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
}
