class Employee {
    int id;
    String name;

    public Employee() {// Constructor with No Arguments
        id = 0;
        name = "Jack";
    }

    public Employee(String n) {// Constructor with Single Argument
        id = 1;
        name = n;
    }

    public Employee(int i, String n) {// Constructor with Two Arguments
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Constructor1 {
    public static void main(String[] args) {

        Employee obj1 = new Employee();
        Employee obj2 = new Employee("Harry");
        Employee obj3 = new Employee(111, "Amit");

        System.out.println("For Object 1 :-");
        System.out.println("ID : " + obj1.getId());
        System.out.println("Name : " + obj1.getName());

        System.out.println("\nFor Object 2 :-");
        System.out.println("ID : " + obj2.getId());
        System.out.println("Name : " + obj2.getName());

        System.out.println("\nFor Object 3 :-");
        System.out.println("ID : " + obj3.getId());
        System.out.println("Name : " + obj3.getName());
    }

}
