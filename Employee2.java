public class Employee2 {
 private int id;
 private String name;
 private String deptName;
 private double salary;
 private static int objectCount = 0;
 public Employee2() {
 objectCount++;
 }
 // Parameterized constructor
 public Employee2(int id, String name, String deptName, double salary) {
 super(); 
 this.id = id;
 this.name = name;
 this.deptName = deptName;
 this.salary = salary;
 }
 public void displayDetails() {
 System.out.println("Employee2 ID: " + id);
 System.out.println("Name: " + name);
 System.out.println("Department Name: " + deptName);
 System.out.println("Salary: " + salary);
 }
 public static void displayObjectCount() {
 System.out.println("Number of Employee2 objects created: " + 
objectCount);
 }
 public static void main(String[] args) {
 Employee2 emp1 = new Employee2(1, "John Doe", "HR", 50000.0);
 emp1.displayDetails();
 Employee2 emp2 = new Employee2(2, "Jane Smith", "IT", 60000.0);
 emp2.displayDetails();
 Employee2 emp3 = new Employee2(3, "Bob Johnson", "Finance", 55000.0);
 Employee2.displayObjectCount();
 emp3.displayDetails();
 }
}
