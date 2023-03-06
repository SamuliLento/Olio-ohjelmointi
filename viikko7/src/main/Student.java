package main;

public class Student implements PrintInfo {
    private String name;
    private String id;

    public Student (String n, String i) {
        name = n;
        id = i;
    }

    public String getInformation () {
        return(id + " " + name);
    }
}
