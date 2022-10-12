package com.vti.polymorphism;

public class Student extends Person implements IStudy{
    public String className;
    public float fee;

    public Student(String name, int age, float fee) {
        super(name, age);
        this.fee = fee;
    }

    @Override
    public void rollUp() {
        System.out.println("Student đang điểm danh ...");
    }

    @Override
    public void copyHomework() {
        System.out.println("Student chép bài của bạn !");
    }

    @Override
    public void doHomework() {
        System.out.println("Student "+ name +" tự giác làm bài tập về nhà !");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", fee=" + fee +
                '}';
    }
}
