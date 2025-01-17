public class MethodOverloading {

    static void greet() {
        System.out.println("Hello World!!");
    }

    static void greet(String name) {
        System.out.println("\nGood Morning " + name + "!! ");
    }

    static void greet(String name1, String name2) {
        System.out.println("\nGood Evening " + name1 + "!! ");
        System.out.println("Good Evening " + name2 + "!! ");
    }

    public static void main(String[] args) {

        String str = "Arnav";
        String n1 = "Harsh";
        String n2 = "Varun";

        greet();
        greet(str);
        greet(n1, n2);
    }
}
// "NOTE" :- Method Overloading cannot be achieved by changing the 'return' type of the Methods.