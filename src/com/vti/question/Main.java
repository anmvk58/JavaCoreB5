package com.vti.question;

public class Main {
    public static void main(String[] args) {
        //Tạo 10 học sinh thành 3 nhóm:
        Student[] students = new Student[11];
        students[0] = new Student(0, "Hoàng Văn V", 1);
        students[1] = new Student(1, "Nguyễn Văn A", 1);
        students[2] = new Student(2, "Trần Văn D", 1);
        students[3] = new Student(3, "Đỗ Ngọc B", 1);

        students[4] = new Student(4, "Hà Anh T", 2);
        students[5] = new Student(5, "Trường G", 2);
        students[6] = new Student(6, "Đàm Vĩnh H", 2);

        students[7] = new Student(7, "Trấn T", 3);
        students[8] = new Student(8, "Ưng Hoàng P", 3);
        students[9] = new Student(9, "Tuấn H", 3);
        students[10] = new Student(10, "Duy M", 3);

        //b) kêu gọi cả lớp điểm danh:
        System.out.println("********** câu b ***********");
        for(Student s : students){
            s.diemDanh();
        }

        //c) gọi nhóm 1 đi học bài:
        System.out.println("\n********** câu c ***********");
        for(Student s : students){
            if(s.getGroup() == 1){
                s.hocBai();
            }
        }

        //d) gọi nhóm 2 đi dọn vệ sinh:
        System.out.println("\n********** câu d ***********");
        for(Student s : students){
            if(s.getGroup() == 2){
                s.diDonVeSinh();
            }
        }
    }
}
