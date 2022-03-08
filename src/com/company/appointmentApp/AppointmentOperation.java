package com.company.appointmentApp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppointmentOperation {
    Scanner sc = new Scanner(System.in);

    int id;
    String name;
    String address;
    String date;

    public void createAppointment(List<Appointment> appointments) {
        System.out.println("Enter ID number");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter Address");
        address = sc.nextLine();
        System.out.println("Enter Date "yyyy-mm-dd");
        date = sc.nextLine();
        appointments.add(new Appointment.AppointmentBuilder(id, name, date).setAddress(address).build());
    }

    public void displayAppointment(List<Appointment> appointments) {
        Iterator<Appointment> i = appointments.iterator();
        while (i.hasNext()) {
            Appointment appointment = i.next();
            System.out.println(appointment);
        }
    }

    public void deleteAppointment(List<Appointment> appointments) {
        boolean found = false;
        System.out.println("Enter the IdNumber to Delete: ");
        id = Integer.parseInt(sc.nextLine());
        Iterator<Appointment> itr = appointments.iterator();
        while (itr.hasNext()) {
            Appointment appointment = itr.next();
            if (appointment.getId() == id) {
                itr.remove();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record not found.");
        } else {
            System.out.println("Record is Deleted Successfully.");

        }
    }

    public void searchAppointment(List<Appointment> appointments) {
        boolean found = false;
        System.out.println("Enter the IdNumber to Search: ");
        id = Integer.parseInt(sc.nextLine());
        Iterator<Appointment> itr = appointments.iterator();
        while (itr.hasNext()) {
            Appointment appointment = itr.next();
            if (appointment.getId() == id) {
                System.out.println("Record found.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record not found.");
        }
    }

    public void filterAppointment(List<Appointment> appointments) {
        System.out.println("Enter the Name to Search: ");
        String input = sc.nextLine();

        Map<Integer, Appointment> appointmentMap = appointments.stream()
                .filter(appointment -> appointment.getName().equals(input) || appointment.getDate().equals(input))
                .collect(Collectors.toMap(
                        Appointment::getId,
                        Function.identity()
                ));
        appointmentMap.values().stream()
                .map(Appointment::toString)
                .forEach(System.out::println);
    }
}
