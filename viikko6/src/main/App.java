package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String manufacturer;
        String model;
        int topSpeed;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        Storage storage = new Storage();

        boolean exit = false;
        while (!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot, 3) Aja autoja, 4) Lennä Lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                try {
                    i = Integer.parseInt(sc.nextLine());

                    switch (i) {
                        case 1:
                            System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                            i = Integer.parseInt(sc.nextLine());
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            manufacturer = sc.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            model = sc.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            topSpeed = Integer.parseInt(sc.nextLine());
                            switch (i) {
                                case 1:
                                    Car car = new Car(manufacturer, model, topSpeed);
                                    storage.addVehicle(car);
                                    break;
                                case 2:
                                    Plane plane = new Plane(manufacturer, model, topSpeed);
                                    storage.addVehicle(plane);
                                    break;
                                case 3:
                                    Ship ship = new Ship(manufacturer, model, topSpeed);
                                    storage.addVehicle(ship);
                                    break;
                                default:
                                    System.out.println("Syöte oli väärä");
                                    break;
                            }
                            break;
                        case 2:
                            storage.listVehicles();
                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

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
