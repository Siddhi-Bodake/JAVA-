import java.util.Scanner;
 class Employee
 {
 int id;
 String name;
 double sal;
 Employee(){}
 Employee(int id,String name,double sal)
 {
 this.id = id;
 this.name= name;
 this.sal = sal;
 }
 }
 class Employee_details {
 public static void main(String[] args) {
 Employee p[] = new Employee[5];
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the details of 5 Employees:- ");
 for (int i=0;i<5;i++)
 {
 System.out.println("Enter Details of Employee "+(i+1));
 System.out.println("Enter id:- ");
 int id = s.nextInt();
 System.out.println("Enter name:- ");
 s.nextLine();
 String name = s.nextLine();
 System.out.println("Enter salary:- ");
 double sal = s.nextDouble();
 p[i] = new Employee(id,name,sal);
 }
 System.out.println("The Product having minimum price:- ");
 max(p);
 }
 public static void max(Employee p[])
 {
 double max = p[0].sal;
 for (int i=1;i<5;i++)
 {
 if (max<p[i].sal)
 {
 max=p[i].sal;
 }
 }
 for (int i=0;i<5;i++)
 {
 if (p[i].sal==max)
 {
 System.out.println(p[i].name);
 break;
 }
 }
 }
 }