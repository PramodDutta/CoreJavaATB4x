package oct.oct7.setdemo;

import oct.oct7.Student;

import java.util.*;

public class TS001 {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet();
        Student s1 = new Student("Pramod",34,1);
        Student s2 = new Student("Dramod",34,1);
        Student s3 = new Student("Lucky",34,2);

        // Comparable -> id or name or age - > id and name ? Not possible
        // Comparator -> class for attribute  SortById, SortByName, SortByAge


        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);

        List studentList = studentSet.stream().toList();

        Collections.sort(studentList,new SordByName());


        // How I have to sort the S1 AND S2?
        // Ref id - Diff mecha
        // id or name? - Multipe diff
        System.out.println(studentSet);
        System.out.println(studentSet.size());
    }
}
