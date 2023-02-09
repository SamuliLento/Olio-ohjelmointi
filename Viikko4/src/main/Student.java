package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    private String name;
    private int id;
    private ArrayList<Grade> grades;

    public Student (String n, int i) {
        name = n;
        id = i;
        grades = new ArrayList<Grade>();
    }

    public String getName () {
        return name;
    }

    public int getId () {
        return id;
    }

    public ArrayList<Grade> getGrades () {
        return grades;
    }

    public void addGrade (String course, int grade) {
        grades.add(new Grade(course, grade));
    }
}
