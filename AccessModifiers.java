class C1 {
    public int x = 12;
    protected int y = 45;
    int z = 87;  // Default(NO Modifier)
    private final int a = 100;

    public void meth() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

}

public class AccessModifiers {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.meth();
    }
}

/*"Access Modifiers" determine whether other classes can use a particular field or invoke a particular method.
 * 
 * MODIFIER         CLASS       PACKAGE         SUBCLASS        WORLD
 * 
 * Public            Y             Y                Y             Y
 * Protected         Y             Y                Y             N
 * Default           Y             Y                N             N
 * Private           Y             N                N             N
 */