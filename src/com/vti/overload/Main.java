package com.vti.overload;

public class Main {
    public static void main(String[] args) {
        ToanHoc toanHoc = new ToanHoc();
        toanHoc.tongHaiSo(4, 5);
        toanHoc.tongHaiSo(4, 5.1f);
        toanHoc.tongHaiSo(5.1f, 4 );
        toanHoc.tongHaiSo(1, 2, 3);
    }
}
