package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {
    final private String FILENAME;
    private ArrayList<Student> students;

    public University () {
        FILENAME = "students.data";
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
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadStudents () {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));

            studentReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
