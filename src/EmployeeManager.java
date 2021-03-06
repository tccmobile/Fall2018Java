
public class EmployeeManager extends EmployeePerson {

    private int numManaged;    // Number of staff managed

    // ***********************************************************************

    // Default constructor
    public EmployeeManager() {
        numManaged = 0;
    }

    // ***********************************************************************

    // Constructor with parameters
    public EmployeeManager(int nManaged) {
        numManaged = nManaged;
    }

    // ***********************************************************************

    // Get the number of people managed
    public int getNumManaged() {
        return numManaged;
    }

    // ***********************************************************************

    // FIXME: Override the EmployeePerson class' printInfo method with a
    // FIXME: printInfo method to print all manager fields here.


    @Override
    public void printInfo() {
        System.out.print("Name: " + fullName + ", Department: " +
                departmentCode + ", Birthday: " + birthday +
                ", Salary: " + annualSalary);
        System.out.println(", Manages: "+numManaged);
    }

    @Override
    public String toString(){
        return super.toString()+", Manages: "+numManaged;
    }
}
