package ui;

import java.util.Scanner;

public class UIMenu {
    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Select to option");

        int response = 0;

        do {
            System.out.println("1- Doctor");
            System.out.println("2- Patient");
            System.out.println("0- Exit");

            Scanner sc = new Scanner((System.in));
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                default:
                    response = 0;
                    System.out.println("Thank you for you visit");
                    break;
            }
        } while (response != 0);
    }

    static void showPatientMenu() {
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointmens");
            System.out.println("0. Return");

            Scanner sc = new Scanner((System.in));
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                default:
                    response = 0;
                    break;
            }
        } while (response != 0);

        showMenu();
    }
}