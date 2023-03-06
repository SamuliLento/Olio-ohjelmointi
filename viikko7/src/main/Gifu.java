package main;

import java.util.ArrayList;

public class Gifu {
    private String university;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Enrollment> enrollments;

    public Gifu (String u) {
        university = u;
        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
    }

    // Course methods

    public void addCourse (Course c) {
        courses.add(c);
    }

    public Course getCourse (int id) {
        return courses.get(id);
    }

    public ArrayList<Course> getCourses () {
        return courses;
    }

    public void listCourses () {
        int i = 0;

        for (Course course : courses) {
            System.out.println(i++ + ") " + course.getInformation());
        }
    }

    // Student methods

    public void addStudent (Student s) {
        students.add(s);
    }

    public Student getStudent (int id) {
        return students.get(id);
    }

    public void listStudents () {
        int i = 0;

        for (Student student : students) {
            System.out.println(i++ + ") " + student.getInformation());
        }
    }

    // Enrollment methods

    public void enrollStudent(Student student, Course course) {
        
    }
}
