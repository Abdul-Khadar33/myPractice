// A simple record class
/*public record Record_class(String name, int age) {
}

public class Record_class {
    public static void main(String[] args) {
        Person p1 = new Person("Ravi", 25);
        Person p2 = new Person("Ravi", 25);

        // toString() auto-generated
        System.out.println(p1);

        // equals() auto-generated
        System.out.println(p1.equals(p2)); // true

        // Getters (no get prefix!)
        System.out.println("Name: " + p1.name());
        System.out.println("Age: " + p1.age());
    }
}*/



 /*public record Circle(double radius) {
    // Compact constructor to validate values
    public Circle {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
    }

    // Custom method
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Record_class {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
        System.out.println("Area: " + c1.area());
    }
}
*/
 

 /*// Record to store employee details
public record Employee(int id, String name, double salary) {
    // Compact constructor for validation
    public Employee {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }

    // Custom method
    public String details() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

// Record for Department
public record Department(int deptId, String deptName) { }

// Record for Project
public record Project(int projectId, String projectName, Department department) { }

// Main class
import java.util.List;

public class RecordDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ravi", 60000);
        Employee e2 = new Employee(102, "Anil", 50000);
        Employee e3 = new Employee(103, "Kiran", 75000);

        Department d1 = new Department(1, "IT");
        Department d2 = new Department(2, "HR");

        Project p1 = new Project(201, "Banking System", d1);
        Project p2 = new Project(202, "Recruitment Portal", d2);

        // Display employees
        List<Employee> employees = List.of(e1, e2, e3);
        employees.forEach(e -> System.out.println(e.details()));

        System.out.println("------------");

        // Display projects with department
        List<Project> projects = List.of(p1, p2);
        projects.forEach(p -> {
            System.out.println("Project: " + p.projectName() +
                               ", Department: " + p.department().deptName());
        });
    }
}
*/