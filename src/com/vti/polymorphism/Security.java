package com.vti.polymorphism;

public class Security extends Person{
    public Security(String name, int age) {
        super(name, age);
    }

    @Override
    public void rollUp() {
        System.out.println("Security đang điểm danh !");
    }

    public void collectTicket(){
        System.out.println("Security soát vé !");
    }
}
