package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String name;
        int id;
        Student student;
        int j;
        String course;
        int grade;
        double average;
        double median;

        Scanner sc = new Scanner(System.in);
        University university = new University();
        Calculator calculator = new Calculator();

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                i = Integer.parseInt(sc.nextLine());

                switch (i) {
                    case 1:
                        System.out.println("Anna opiskelijan nimi?");
                        name = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        id = Integer.parseInt(sc.nextLine());
                        student = new Student(name, id);
                        university.addStudent(student);
                        break;
                    case 2:
                        university.listStudents();
                        break;
                    case 3:
                        university.chooseStudent();
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        j = Integer.parseInt(sc.nextLine());
                        student = university.getStudent(j);
                        System.out.println("Mille kurssille suorite lisätään?");
                        course = sc.nextLine();
                        System.out.println("Mikä arvosana kurssille lisätään?");
                        grade = Integer.parseInt(sc.nextLine());
                        student.addGrade(course, grade);
                        break;
                    case 4:
                        university.chooseStudent();
                        System.out.println("Minkä opiskelijan suoritteet listataan?");
                        j = Integer.parseInt(sc.nextLine());
                        student = university.getStudent(j);
                        calculator.listGrades(student);
                        break;
                    case 5:
                        university.chooseStudent();
                        System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                        j = Integer.parseInt(sc.nextLine());
                        student = university.getStudent(j);
                        average = calculator.getAverageGrade(student);
                        System.out.println("Keskiarvo on " + average);
                        break;
                    case 6:
                        university.chooseStudent();
                        System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                        j = Integer.parseInt(sc.nextLine());
                        student = university.getStudent(j);
                        median = calculator.getMedianGrade(student);
                        System.out.println("Mediaani on " + median);
                        break;
                    case 7:
                        university.saveStudents();
                        break;
                    case 8:
                        university.loadStudents();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        sc.close();
    }
}
