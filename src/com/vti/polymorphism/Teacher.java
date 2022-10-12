package com.vti.polymorphism;

public class Teacher extends Person{
    public String className;
    public float salary;

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void rollUp() {
        System.out.println("Teacher đang điểm danh ... ");
    }

    public void teach(){
        System.out.println("Teacher " + name + " đang giảng bài !!!");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", salary=" + salary +
                '}';
    }
}
