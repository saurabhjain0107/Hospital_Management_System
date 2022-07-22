package com.bridagelabz;

public class Patient {
    private String name;
    private String department;
    private String city;
    private String state;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Patient newEntry = new Patient();
        newEntry.setName("saurabh");
        newEntry.setDepartment("Cardiology");
        newEntry.setId("Patient123");
        newEntry.setCity("Bhopal");
        newEntry.setState("M.P");
        System.out.println("Patient name is :"+ newEntry.getName());
        System.out.println("Patient ID is :" + newEntry.getId());
        System.out.println("Patient Department is :" + newEntry.getDepartment());
        System.out.println("Patient City is :" + newEntry.getCity());
        System.out.println("Patient State is :" + newEntry.getState());
    }

    }

