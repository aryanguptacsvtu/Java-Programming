class Cylinder {
    int height;
    int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class OOPS8 {
    public static void main(String[] args) {

        Cylinder obj = new Cylinder(12, 9);

        System.out.println("Height of Cylinder : " + obj.getHeight());
        System.out.println("Radius of Cylinder : " + obj.getRadius());

        System.out.format("\nSurface Area of Cylinder : %.3f", obj.surfaceArea());
        System.out.format("\nVolume of Cylinder : %.3f", obj.volume());
    }

}
