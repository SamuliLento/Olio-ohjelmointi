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

    public Student getStudent (int j) {
        return students.get(j);
    }

    public void chooseStudent () {
        int i = 0;
        for (Student student : students) {
            System.out.println(i + ": " + student.getName());
            i++;
        }
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
