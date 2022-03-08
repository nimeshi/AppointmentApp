package com.company.appointmentApp;

public class Appointment {
    private final int id;
    private final String name;
    private final String address;
    private final String date;

    private Appointment(AppointmentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.date=builder.date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address+", date = " + this.date;
    }

    public static class AppointmentBuilder {
        private final int id;
        private final String name;
        private final String date;
        private String address;

        public AppointmentBuilder(int id, String name,String date) {
            this.id = id;
            this.name = name;
            this.date= date;
        }

        public AppointmentBuilder setAddress(String address) {
            this.address = address;
            return (this);
        }

        public Appointment build() {
            Appointment appointment = new Appointment(this);
            return appointment;
        }
    }
}
