public class EmployeePerson {
    protected String fullName;       // Format: last name, first name
    protected String departmentCode;
    protected String birthday;
    protected int    annualSalary;

    // ***********************************************************************

    // Default constructor. Set protected variables to the empty string or 0
    public EmployeePerson() {
        fullName       = "";
        departmentCode = "";
        birthday       = "";
        annualSalary   = 0;
    }

    // ***********************************************************************

    // Constructor with parameters to set the private variables
    public EmployeePerson(String empFullName, String empDepartmentCode,
                          String empBirthday, int empAnnualSalary) {
        setData(empFullName, empDepartmentCode, empBirthday, empAnnualSalary);
    }

    // ***********************************************************************

    public void setData(String empFullName, String empDepartmentCode,
                        String empBirthday, int empAnnualSalary) {
        fullName       = empFullName;
        departmentCode = empDepartmentCode;
        birthday       = empBirthday;
        annualSalary   = empAnnualSalary;
    }

    // ***********************************************************************

    public void printInfo() {
        System.out.println("Name: " + fullName + ", Department: " +
                departmentCode + ", Birthday: " + birthday +
                ", Salary: " + annualSalary);
    }

    @Override
    public String toString(){
        return "Name: " + fullName + ", Department: " +
                departmentCode + ", Birthday: " + birthday +
                ", Salary: " + annualSalary;

    }
}
