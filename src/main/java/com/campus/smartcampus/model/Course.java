package com.campus.smartcampus.model;
import jakarta.persistence.*;

@Entity
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String lecturer;
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getCode(){return code;} public void setCode(String c){this.code=c;}
    public String getName(){return name;} public void setName(String n){this.name=n;}
    public String getLecturer(){return lecturer;} public void setLecturer(String l){this.lecturer=l;}
}