package oct.oct8.map;

import java.util.*;

public class AutomationExMaster {

    public static void main(String[] args) {

        Student stu1 = new Student(1, "Pramod", "Test@gamil.com", 987654321);
        Student stu2 = new Student(2, "Dutta", "TestDutta@gmail.com", 99999999);
        Student stu3 = new Student(3, "Lucky", "TestLucky@gmail.com", 99999999);
        Student stu4 = new Student(4, "AJIM", "TestAjim@gmail.com", 99999999);
        Student stu5 = new Student(5, "AJU", "TestAJU@gmail.com", 99999999);

        List<Student> stuList1 = new ArrayList();   // B1

        stuList1.add(stu1);
        stuList1.add(stu2);
        stuList1.add(stu3);

        List<Student> stuList2 = new ArrayList<Student>(); //B2
        stuList2.add(stu4);
        stuList2.add(stu5);

        Map<String, List<Student>> ttaATBatches1 = new TreeMap<>();
        ttaATBatches1.put("ATB1", stuList1);
        ttaATBatches1.put("ATB2", stuList2);

        // ATB1 -> 3
        // ATB2 -> 2


        // MTB1 -> 3
        // MTB2 -> 2

        Map<String, List<Student>> ttaMTBBatches2 = new TreeMap<String, List<Student>>();
        ttaMTBBatches2.put("MTB1", stuList1); // 3
        ttaMTBBatches2.put("MTB2", stuList2); //2


        Map<String, Map<String, List<Student>>> TTACourses = new HashMap<>();

        TTACourses.put("Automation", ttaATBatches1);
        TTACourses.put("Manual", ttaMTBBatches2);


        Set<String> courseNames = TTACourses.keySet();
        System.out.println(courseNames);


        char ch = 'A';
        for (String cname : courseNames) {
            System.out.println(ch++ + ") Course: " + cname);
            Map<String, List<Student>> batchMap = TTACourses.get(cname);
            Set<String> batchIds = batchMap.keySet();
            for(String batchId : batchIds){
                List<Student> stuList = batchMap.get(batchId);
                System.out.println();
                System.out.println("Students of " +  batchId + "Total : " +stuList.size());
                System.out.println(" =======================");
                int count = 1;
                for(Student mystu : stuList){
                    System.out.println(count++ + ". " + mystu);
                }
            }


        }


    }


}

class Student {
    private Integer sid;
    private String sname;
    private String email;
    private long phone;

    Student() {
        System.out.println("Default C");
    }

    public Student(Integer sid, String sname, String email, long phone) {
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {

        Integer local_var = 10;
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
