class MyGeneric<T1, T2> {
    int val;
    private final T1 t1;
    private final T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

}

public class Generics {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        MyGeneric<String, Integer> g1 = new MyGeneric(100, "Hello World", 55);

        String str = g1.getT1();
        Integer num = g1.getT2();
        Integer num2 = g1.getVal();

        System.out.println("The VAL is : " + num2);
        System.out.println("The string is : " + str);
        System.out.println("The NUM is : " + num);
    }

}
