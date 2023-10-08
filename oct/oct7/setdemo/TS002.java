package oct.oct7.setdemo;

import java.util.Comparator;
import java.util.TreeSet;

// Student class with id, name, and age
class Student2 {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters for id, name, and age
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for better printing of objects
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Comparator class for sorting Students by ID
class SortById implements Comparator<Student2> {
    @Override
    public int compare(Student2 student21, Student2 student2) {
        return Integer.compare(student21.getId(), student2.getId());
    }
}

class SortByName implements Comparator<Student2> {
    @Override
    public int compare(Student2 student1, Student2 student2) {
        return student1.getName().compareTo(student2.getName());
    }
}


public class TS002 {
    public static void main(String[] args) {
        // Creating a TreeSet of Students using a custom Comparator (based on id)
        TreeSet<Student2> student2Set = new TreeSet<>(new SortById());
        //TreeSet<Student2> student2Set = new TreeSet<>(new SortByName());

        // Adding students to the TreeSet
        student2Set.add(new Student2(101, "Alice", 20));
        student2Set.add(new Student2(103, "Bob", 22));
        student2Set.add(new Student2(102, "Charlie", 21));

        // Printing the TreeSet
        System.out.println("Students (Sorted by Name):");
        for (Student2 student2 : student2Set) {
            System.out.println(student2);
        }
    }
}

