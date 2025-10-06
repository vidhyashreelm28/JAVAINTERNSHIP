import com.yourname.assignment.employees.*;
import com.yourname.assignment.utilities.*;

//Main class for demonstrating the use of Java packages and access modifiers.
public class AssignmentMain {
    public static void main(String[] args) {
        // Creating instances of Manager and Developer
        Manager manager = new Manager("Alice", 101, 75000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Creating utility object
        EmployeeUtilities utils = new EmployeeUtilities();

        // Performing operations
        utils.showEmployeeDetails(manager);
        utils.showEmployeeDetails(developer);

        // Increasing salary
        utils.increaseSalary(manager, 10);
        utils.increaseSalary(developer, 15);

        // Displaying updated info
        System.out.println("\nAfter Salary Increment:");
        utils.showEmployeeDetails(manager);
        utils.showEmployeeDetails(developer);
    }
}
