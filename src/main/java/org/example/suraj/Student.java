package org.example.suraj;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id

    int student_id;
    String name;
    int age;
    String Address;

    //this is unidirectional
    @OneToOne
    @JoinColumn(name="course_id")
    private Course courses;

    public Student() {

    }


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public Student(int student_id, String name, int age, String address, Course courses) {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        Address = address;
        this.courses = courses;
    }
}
