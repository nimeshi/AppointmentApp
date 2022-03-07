package com.company.appointmentApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentApp {
    public static void main(String[] args) {
        AppointmentOperation aop = new AppointmentOperation();
        List<Appointment> appointments = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Filter");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    aop.createAppointment(appointments);
                    break;

                case 2:
                    aop.displayAppointment(appointments);
                    break;

                case 3:
                    aop.deleteAppointment(appointments);
                    break;

                case 4:
                    aop.searchAppointment(appointments);
                    break;

                case 5:
                    aop.filterAppointment(appointments);
                    break;

                default:
                    choice = 0;
            }
        } while (choice != 0);
    }
}

