package model;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private Float mediumScore;

    public Student() {
    }

    public Student(String id, String name, int age, String course, String address, Float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Student Information:");
        System.out.print("Code: ");
        this.id = scanner.next().trim();
        System.out.print("Name: ");
        this.name = scanner.next().trim();
        System.out.print("Age: ");
        this.age = scanner.nextInt();
        System.out.print("Course: ");
        this.course = scanner.next().trim();
        System.out.print("Address: ");
        this.address = scanner.next().trim();
        System.out.print("MediumScore: ");
        this.mediumScore = scanner.nextFloat();
    }

    public void printStudent() {
        System.out.println();
        System.out.println("Code: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Course: " + this.course);
        System.out.println("Address: " + this.address);
        System.out.println("MediumScore: " + this.mediumScore);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(Float mediumScore) {
        this.mediumScore = mediumScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
