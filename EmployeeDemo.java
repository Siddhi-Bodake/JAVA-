import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];
        double maxSalary = Double.MIN_VALUE;
        String empName = "";

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of employee " + (i + 1) + ":");
            System.out.print("Enter employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter employee name: ");
            String empNameInput = scanner.nextLine();
            System.out.print("Enter employee salary: ");
            double empSalary = scanner.nextDouble();

            employees[i] = new Employee(empId, empNameInput, empSalary);

            if (empSalary > maxSalary) {
                maxSalary = empSalary;
                empName = empNameInput;
            }
        }

        System.out.println("\nEmployee with maximum salary:");
        System.out.println("Name: " + empName + ", Salary: " + maxSalary);

        scanner.close();
    }
}
