package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String university;
        String courseName;
        String courseID;
        int maxStudents;
        Course course;
        String studentName;
        String studentID;
        Student student;

        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Tervetuloa Gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        university = sc.nextLine();

        Gifu gifu = new Gifu(university);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                try {
                    i = Integer.parseInt(sc.nextLine());

                    switch (i) {
                        case 1:
                            System.out.println("Anna kurssin nimi:");
                            courseName = sc.nextLine();
                            System.out.println("Anna kurssin ID:");
                            courseID = sc.nextLine();
                            System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                            maxStudents = Integer.parseInt(sc.nextLine());
                            course = new Course(courseName, courseID, maxStudents);
                            gifu.addCourse(course);
                            break;
                        case 2:
                            System.out.println("Anna opiskelijan nimi:");
                            studentName = sc.nextLine();
                            System.out.println("Anna opiskelijan opiskelijanumero:");
                            studentID = sc.nextLine();
                            student = new Student(studentName, studentID);
                            gifu.addStudent(student);
                            break;
                        case 3:
                            gifu.listCourses();
                            break;
                        case 4:
                            gifu.listStudents();
                            break;
                        case 5:

                            break;
                        case 6:

                            break;
                        case 7:

                            break;
                        case 8:

                            break;
                        case 9:

                            break;
                        case 0:
                            System.out.println("Kiitos ohjelman käytöstä.");
                            exit = true;
                            break;
                        default:
                            System.out.println("Syöte oli väärä");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Syöte oli väärä");
                }
            }
        }
        sc.close();
    }
}
