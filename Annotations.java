@FunctionalInterface
interface myFuncInterface {

    void myMethod();
    // void myMethod2(); [INVALID]

}

public class Annotations {
    // @SuppressWarnings("deprecation")
    
    @Deprecated
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        int res = add(100, 90);
        System.out.println("The sum is : " + res);
    }
}
/* "NOTE" :-
 * Annotations are used to provide extra information about a program.
 * 
 * @Override :- Used to mark overriden elements in the child class.
 * @SuppressWarnings :- Used to suppress the generated warnings by the compiler.
 * 
 * @Deprecated :- Used to mark deprecated methods.
 * @FunctionalInterface :- Used to ensure an interface is a Functional Interface.
 * 
 * "Functional Interface" :- It is an interface that contains only a single abstract method.
 */