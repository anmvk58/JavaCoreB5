package com.vti.overload;

public class ToanHoc {
    //thuộc tính

    //Phương thức
    public void tongHaiSo(int a, int b){
        int c = a+b;
        System.out.println("Phương án 1: " + c);
    }

    public void tongHaiSo(int a, float b){
        float c = a + b;
        System.out.println("Phương án 2: " + c);
    }

    public void tongHaiSo(float a, int b){
        float c = a + b;
        System.out.println("Phương án 4: " + c);
    }

    public void tongHaiSo(int a, int b, int c){
        System.out.println("Phương án 3: " + (a+b+c));
    }
}
