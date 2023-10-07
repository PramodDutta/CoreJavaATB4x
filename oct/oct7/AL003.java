package oct.oct7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AL003 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();

        // Student 1
        Student s1 = new Student("Lucky",45, 1);
        students.add(s1);

        // Student 2
        students.add(new Student("Pramod",34, 2));


        System.out.println(students.size());

        for (Student s: students){
            System.out.println(s.getName());
        }

        Iterator iterator = students.iterator();


        while(iterator.hasNext()){
            Student temp = (Student)iterator.next();
            System.out.println(temp.getName());
            System.out.println(temp.getAge());
        }


        ListIterator listIterator = students.listIterator();
        while (listIterator.hasNext()){
            Student temp = (Student)listIterator.next();
            System.out.println(temp.getName());
            System.out.println(temp.getAge());
        }






    }
}
