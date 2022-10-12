package com.vti;

import com.vti.polymorphism.Person;
import com.vti.polymorphism.Student;
import com.vti.polymorphism.Teacher;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[10];

//        Student[] students = new Student[5];
        people[0] = new Student("Student 1", 15, 100f);
        people[1] = new Student("Student 2", 16, 200f);
        people[2] = new Student("Student 3", 17, 300f);
        people[3] = new Student("Student 4", 18, 400f);
        people[4] = new Student("Student 5", 19, 500f);


//        Teacher[] teachers = new Teacher[5];
        people[5] = new Teacher("Teacher 1", 25);
        people[6] = new Teacher("Teacher 2", 26);
        people[7] = new Teacher("Teacher 3", 27);
        people[8] = new Teacher("Teacher 4", 28);
        people[9] = new Teacher("Teacher 5", 29);

        for(Person p : people){
            if(p instanceof Student){
                // thực hiện hàm đặc thù của student => doHomework
                Student tempStudent = (Student) p;
                tempStudent.doHomework();
            } else if(p instanceof Teacher){
                // thực hiện hàm đặc thù của teacher => teach
                Teacher tempTeacher = (Teacher) p;
                tempTeacher.teach();
            }
        }
    }
}
