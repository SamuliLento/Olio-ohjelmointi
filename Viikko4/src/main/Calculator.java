package main;

import java.util.Arrays;

public class Calculator {

    public void listGrades(Student s) {
        for (Grade grade : s.getGrades()) {
            System.out.println(grade.getCourse() + ": " + grade.getGrade());
        }
    }
    
    public double getAverageGrade (Student s) {
        int i = 0;
        double sum = 0;
        double average;

        for (Grade grade : s.getGrades()) {
            sum += grade.getGrade();
            i++;
        }
        if (i == 0) {
            average = 0;
        } else {
            average = sum / i;
        }
        return average;
    }

    public double getMedianGrade (Student s) {
        int[] grades = new int[s.getGrades().size()];
        int i = 0;
        double sum;
        double median;

        for (Grade grade : s.getGrades()) {
            grades[i] = grade.getGrade();
            i++;
        }
        if (i == 0) {
            median = 0;
        } else {
            Arrays.sort(grades);
            if ((grades.length % 2) == 0) {
                sum = grades[(grades.length) / 2] + grades[((grades.length) / 2) - 1];
                median = sum / 2;
            } else {
                median = grades[(grades.length - 1) / 2];
            }
        }
        return median;
    }
}
