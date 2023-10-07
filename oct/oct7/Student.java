package oct.oct7;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private Integer age;

    private Integer id;

    public Student(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }



    @Override
    public int compareTo(Student o)
    {  // s1.id  - s2.id => 0
     // s1.id  > s2.id => ASC
        // s1.id  > s2.id => DSC
        return this.id-o.id;
    }

//    @Override
//    public int compareTo(Student o)
//    {  // s1.id  - s2.id => 0
//     // s1.id  > s2.id => ASC
//        // s1.id  > s2.id => DSC
//        return this.name.compareTo(o.name);
//    }



}


class  SortById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId().compareTo(o2.getId());
    }
}


class SordByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}




