package main;

public class Calculator {

    public void listGrades(Student s) {
        for (Grade grade : s.getGrades()) {
            System.out.println(grade.getCourse() + ": " + grade.getGrade());
        }
    }
    
    public double getAverageGrade (Student s) {
        double average = 0;

        return average;
    }

    public double getMedianGrade (Student s) {
        double median = 0;

        return median;
    }
}
