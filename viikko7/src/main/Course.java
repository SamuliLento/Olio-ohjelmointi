package main;

public class Course implements PrintInfo {
    private String name;
    private String id;
    private int maxNumberOfStudents;

    public Course (String n, String i, int m) {
        name = n;
        id = i;
        maxNumberOfStudents = m;
    }

    public String getInformation () {
        return(id + " " + name);
    }
}
