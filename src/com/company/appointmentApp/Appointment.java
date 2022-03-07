package com.company.appointmentApp;

public class Appointment {
    private  int id;
    private  String name;
    private  String address;

    public Appointment(int id,String name,String address){
        this.id = id;
        this.name=name;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address;
    }
}