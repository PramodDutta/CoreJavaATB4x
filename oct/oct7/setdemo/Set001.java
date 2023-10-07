package oct.oct7.setdemo;


import oct.oct7.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set; // No Duplicate
import java.util.HashSet;

public class Set001 {
    public static void main(String[] args) {
//        List l = new ArrayList();
//        l.add("Pramod");
//        l.add("Pramod");
//        System.out.println(l);
//
        Set s = new HashSet();
        s.add("Pramod");
        s.add("Pramod");
        s.add("Pramod");
        System.out.println(s);

        // List of Students who wants to take part in Event
        // It contains duplicate, some students have done
        // Registeration twice or thrice, How we will remove the
        // Duplicate
        //  Set or List

        Student s1 = new Student("Pramod",34,1);
        Student s4 = new Student("Pramod",34,1);

        // s1 == s4 but How set will know?
        // id s1 == id s4 - then it is duplicate set will remove

        Student s2 = new Student("Lucky",43,2);
        Student s3 = s1;

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        System.out.println(studentsList);
        System.out.println(studentsList.size());

        if(s1.equals(s3)){
            System.out.println("True");
            // Set will not add the Element or Item
            // s3 will not be printed!!
        }


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        System.out.println(studentSet);
        System.out.println(studentSet.size());




    }
}
