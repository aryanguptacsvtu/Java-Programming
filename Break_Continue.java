public class Break_Continue {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.println(" JAVA is Good!");
            if (i == 3) {
                System.out.println("Ending the loop...\n");
                break;
            }
        }

        for (i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Skip this iteration...");
                continue;
            }
            System.out.print(i);
            System.out.println(" JAVA is Nice!");
        }

        System.out.print("\n");
        j = 0;
        do {
            j++;
            if (j == 2) {
                System.out.println("Skip this iteration...");
                continue;
            }
            System.out.print(j);
            System.out.println(" JAVA is Great!");
        } while (j < 5);
    }
}
