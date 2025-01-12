class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {

        System.out.println("\nMy name is : " + name);
        System.out.print("My id is : " + id);
    }

    public int getSalary() {
        return salary;
    }

}

public class OOPS1 {
    public static void main(String[] args) {

        System.out.println("This is our custom class.");

        Employee a = new Employee(); // Creating a new Employee Object
        Employee b = new Employee(); // Creating a new Employee Object

        // Setting the Attributes
        a.id = 100;
        a.name = "Harry";
        a.salary = 32000;

        b.id = 200;
        b.name = "John";
        b.salary = 54000;

        // Printing the Attributes
        a.printDetails();
        int x = a.getSalary();
        System.out.println("\nSalary : " + x);

        b.printDetails();
        int y = b.getSalary();
        System.out.println("\nSalary : " + y);

        // System.out.println(a.id);
        // System.out.println(b.name);
    }

}
