class Cylinder {
    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class OOPS7 {
    public static void main(String[] args) {

        Cylinder obj = new Cylinder();

        obj.setHeight(12);
        obj.setRadius(9);

        System.out.println("Height of Cylinder : " + obj.getHeight());
        System.out.println("Radius of Cylinder : " + obj.getRadius());

        System.out.println("\nSurface Area of Cylinder : " + obj.surfaceArea());
        System.out.println("Volume of Cylinder : " + obj.volume());
    }

}
