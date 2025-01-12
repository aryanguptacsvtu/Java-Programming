class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class OOPS2 {
    public static void main(String[] args) {

        Employee a = new Employee();

        a.salary = 23000;
        a.setName("John");

        System.out.println("Name : " + a.getName());
        System.out.println("Salary : " + a.getSalary());

    }

}
