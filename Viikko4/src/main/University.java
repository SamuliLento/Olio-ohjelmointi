package main;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students;

    public University () {
        students = new ArrayList<Student>();
    }

    public void addStudent (Student s) {
        students.add(s);
    }

    public void listStudents () {
        System.out.println("Opiskelijat:");

        for (Student student : students) {
            System.out.println(student.getId() + ": " + student.getName());
        }
    }

    public void saveStudents () {

    }

    public void loadStudents () {
        
    }
}
