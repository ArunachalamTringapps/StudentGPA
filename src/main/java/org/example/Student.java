package org.example;

class Student {
    private final String name;
    private final int age;
    private final Double gpa;

    Student(String name, int age, Double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public Double getgpa() {
        return gpa;
    }

}
