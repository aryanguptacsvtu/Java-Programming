class Monkey {

    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {

    void speak() {
        System.out.println("I can speak!");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class Interface6 {
    public static void main(String[] args) {

        Human obj = new Human();

        obj.bite();
        obj.jump();
        obj.eat();
        obj.sleep();
        obj.speak();

        System.out.println("\nDemonstrating Polymorphism :-");

        Monkey m = new Human();
        m.bite();
        m.jump();

        /*
         * m.speak(); [INVALID]
         * m.eat();
         * m.sleep();
         */

        System.out.println();
        BasicAnimal b = new Human();
        b.eat();
        b.sleep();

        /*
         * b.bite(); [INVALID]
         * b.speak();
         * b.jump();
         */
    }
}
