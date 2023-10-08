package oct.oct8;

public class ATBStudent implements Comparable<ATBStudent> {

    private Integer id;
    private String name;
    private String courseName;

    public ATBStudent(Integer id, String name, String courseName) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "ATBStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public int compareTo(ATBStudent o) {
        return Integer.compare(this.id,o.id);
    }
}
