package main;

import java.io.Serializable;

public class Grade implements Serializable {
    
    String course;
    int grade;

    public Grade (String c, int g) {
        course = c;
        grade = g;
    }

    public String getCourse () {
        return course;
    }

    public int getGrade () {
        return grade;
    }
}
