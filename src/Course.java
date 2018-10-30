import java.util.ArrayList;

public class Course {
    private String title;

    private ArrayList<Student> students;

    public Course() {
        title = "Unknown Course";
        students = new ArrayList<Student>();
    }

    public Course(String title, ArrayList<Student> students) {
        this.title = title;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
