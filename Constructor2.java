class Rectangle {

    int length;
    int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}

public class Constructor2 {
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(15, 10);

        System.out.println("For object 1 :- ");
        System.out.println("Length : " + obj1.getLength());
        System.out.println("Breadth : " + obj1.getBreadth());

        System.out.println("\nFor object 2 :- ");
        System.out.println("Length : " + obj2.getLength());
        System.out.println("Breadth : " + obj2.getBreadth());

    }
}
