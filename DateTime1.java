public class DateTime1 {
    public static void main(String[] args) {

        System.out.println("Milliseconds passed : " + System.currentTimeMillis());

        System.out.println("Seconds passed : " + System.currentTimeMillis() / 1000);

        System.out.println("Minutes passed : " + System.currentTimeMillis() / 1000 / 60);

        System.out.println("Hours passed : " + System.currentTimeMillis() / 1000 / 3600);

        System.out.println("Days passed : " + System.currentTimeMillis() / 1000 / 3600 / 24);

        System.out.println("Years passed : " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
    }
}

/*
 * "NOTE" :-
 * Date in Java is stored in the form of a long number. This long number holds
 * the number of milliseconds passed since 1 January,1970 .
 */