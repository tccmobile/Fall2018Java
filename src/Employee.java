public class Employee {

    private String name;
    private String title;
    private String department;

    public Employee() {
        name = "none";
        title = "none";
        department = "none";
    }

    public Employee(String name, String title, String department) {
        this.name = name;
        this.title = title;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }
}
