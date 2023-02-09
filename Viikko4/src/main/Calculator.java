package main;

public class Calculator {

    public void listGrades(Student s) {
        for (Grade grade : s.getGrades()) {
            System.out.println(grade.getCourse() + ": " + grade.getGrade());
        }
    }
    
    public double getAverageGrade (Student s) {
        double sum = 0;
        int i = 0;
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
        double median = 0;

        return median;
    }
}
