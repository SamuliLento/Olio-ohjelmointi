package main;

public class Enrollment {
    private Student student;
    private Course course;
    private int grade;

    public Enrollment (Student s, Course c) {
        student = s;
        course = c;
        grade = -1;
    }

    public void gradeCourse (int grade) {
        this.grade = grade;
    }

    public Student getStudent () {
        return student;
    }

    public Course getCourse () {
        return course;
    }

    public int getGrade () {
        return grade;
    }
}
