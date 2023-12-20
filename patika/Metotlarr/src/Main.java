public class Main {
    public static void main(String[] args) {
        Car audi=new Car();
        audi.model="audi";
        audi.speed=10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();
        Car bmw=new Car();
        bmw.model="bmw";
        bmw.speed=20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(120);
        bmw.printSpeed();
        System.out.println("fd");
        Car mercedes=new Car();
        mercedes.model="mercedes";
        mercedes.speed=30;
        mercedes.printSpeed();

    }
}
