package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String name;
        String id;
        int maxNumberOfStudents;
        Course course;
        Student student;
        int j;
        ArrayList<Course> courses;
        ArrayList<Enrollment> enrollments;
        int grade;

        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Tervetuloa Gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        name = sc.nextLine();

        Gifu gifu = new Gifu(name);

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                try {
                    i = Integer.parseInt(sc.nextLine());

                    switch (i) {
                        case 1:
                            System.out.println("Anna kurssin nimi:");
                            name = sc.nextLine();
                            System.out.println("Anna kurssin ID:");
                            id = sc.nextLine();
                            System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                            maxNumberOfStudents = Integer.parseInt(sc.nextLine());
                            course = new Course(name, id, maxNumberOfStudents);
                            gifu.addCourse(course);
                            break;
                        case 2:
                            System.out.println("Anna opiskelijan nimi:");
                            name = sc.nextLine();
                            System.out.println("Anna opiskelijan opiskelijanumero:");
                            id = sc.nextLine();
                            student = new Student(name, id);
                            gifu.addStudent(student);
                            break;
                        case 3:
                            gifu.listCourses();
                            break;
                        case 4:
                            gifu.listStudents();
                            break;
                        case 5:
                            gifu.listCourses();
                            System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                            j = Integer.parseInt(sc.nextLine());
                            course = gifu.getCourse(j);
                            gifu.listStudents();
                            System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                            j = Integer.parseInt(sc.nextLine());
                            student = gifu.getStudent(j);
                            gifu.enrollStudent(student, course);
                            break;
                        case 6:
                            gifu.listCourses();
                            System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                            j = Integer.parseInt(sc.nextLine());
                            course = gifu.getCourse(j);
                            enrollments = gifu.getEnrollments(course);
                            for(Enrollment enrollment : enrollments) {
                                System.out.println("Anna arvosana opiskelijalle " + enrollment.getStudent().getInformation());
                                grade = Integer.parseInt(sc.nextLine());
                                enrollment.gradeCourse(grade);
                            }
                            break;
                        case 7:
                            gifu.listCourses();
                            System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:");
                            j = Integer.parseInt(sc.nextLine());
                            course = gifu.getCourse(j);
                            enrollments = gifu.getEnrollments(course);
                            for(Enrollment enrollment : enrollments) {
                                System.out.println(enrollment.getStudent().getInformation() + ", arvosana: " + enrollment.getGrade());
                            }
                            break;
                        case 8:
                            gifu.listStudents();
                            System.out.println("Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:");
                            j = Integer.parseInt(sc.nextLine());
                            student = gifu.getStudent(j);
                            System.out.println("Opiskelijan " + student.getInformation() + " arvosanat:");
                            enrollments = gifu.getEnrollments(student);
                            for(Enrollment enrollment : enrollments) {
                                System.out.println(enrollment.getCourse().getInformation() + ", arvosana: " + enrollment.getGrade());
                            }
                            break;
                        case 9:
                            courses = gifu.getCourses();
                            for(Course c : courses) {
                                System.out.println(c.getInformation());
                                enrollments = gifu.getEnrollments(c);
                                for(Enrollment enrollment : enrollments) {
                                    System.out.println(enrollment.getStudent().getInformation() + ", arvosana: " + enrollment.getGrade());
                                }
                            }
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
