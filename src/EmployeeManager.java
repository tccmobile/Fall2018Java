import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeManager {
    static Scanner scnr = new Scanner(System.in);

    public static void main(String [] args) {
        final int MAX_ELEMENTS = 10;
        final char EXIT_CODE = 'X';
        final String PROMPT_ACTION = "Add, Delete, List or eXit (a,d,l,x): ";
        LinkedList<Employee> employees       = new LinkedList<Employee>();

        char userAction;

        // Loop until the user enters the exit code.
        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            if(userAction == 'A') {
                addEmployee(employees);
            }
            else if(userAction == 'D') {
                deleteEmployee(employees);
            }
            else if(userAction == 'L') {
                listEmployees(employees);
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    // Add an employee
    public static void addEmployee(LinkedList<Employee> employees) {
        String theName;
        String theDept;
        String theTitle;

        System.out.println("\nEnter the name to add: ");
        theName = scnr.nextLine();
        System.out.println("Enter " + theName + "'s department: ");
        theDept = scnr.nextLine();
        System.out.println("Enter " + theName + "'s title: ");
        theTitle = scnr.nextLine();

        Employee temp = new Employee(theName,theTitle,theDept);
        employees.add(temp);


        System.out.println(theName + "'s information has been added.");
    }

    // Delete an employee
    public static void deleteEmployee(LinkedList<Employee> employees) {
        System.out.println("FIXME: Delete employee");
        // FIXME: Ask the user for the employee # to delete, then delete that employee
        String empToDelete;
        System.out.println("Enter the name of the employee to delete: ");
        empToDelete = scnr.nextLine();

        boolean found = false;

        for (int i = 0; i < employees.size() ; i++) {
            if (employees.get(i).getName().equalsIgnoreCase(empToDelete)){
                employees.remove(i);
                found = true;
            }

            if (found){
                break;
            }
        }

    }

    // List all employees
    public static void listEmployees(LinkedList<Employee> employees) {
        int nElements;
        int i;

        nElements = employees.size();
        if (nElements > 0) {
            System.out.println();
            for (i = 0; i < nElements; ++i) {
                System.out.println(i + ") Name: "   + employees.get(i).getName() +
                        ",\tDepartment: " + employees.get(i).getDepartment() +
                        ",\tTitle: " + employees.get(i).getTitle());
            }
        }
        else {
            System.out.println("\nThere are no employees to list.");
        }
    }

    // Get the action the user wants to perform
    public static char getAction(String prompt) {
        String answer;
        char firstChar;

        System.out.println();
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";   // Ensure >= 1 character
        firstChar = answer.charAt(0);

        return firstChar;
    }
}