package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String name;
        int id;

        Scanner sc = new Scanner(System.in);
        University university = new University();

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
                        Student student = new Student(name, id);
                        university.addStudent(student);
                        break;
                    case 2:
                        university.listStudents();
                        break;
                    case 3:
                        university.listStudents();
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
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
