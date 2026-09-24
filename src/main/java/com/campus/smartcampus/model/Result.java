package com.campus.smartcampus.model;
import jakarta.persistence.*;

@Entity
public class Result {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentRegNo;
    private String courseCode;
    private int coursework;
    private int exam;
    private int total;
    private String grade;
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getStudentRegNo(){return studentRegNo;} public void setStudentRegNo(String s){this.studentRegNo=s;}
    public String getCourseCode(){return courseCode;} public void setCourseCode(String c){this.courseCode=c;}
    public int getCoursework(){return coursework;} public void setCoursework(int c){this.coursework=c;}
    public int getExam(){return exam;} public void setExam(int e){this.exam=e;}
    public int getTotal(){return total;} public void setTotal(int t){this.total=t;}
    public String getGrade(){return grade;} public void setGrade(String g){this.grade=g;}
}