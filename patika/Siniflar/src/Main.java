public class Main {
    public static void main(String[] args) {

        Car audi=new Car ();
        audi.model="audi";
        audi.speed=20;
        audi.increaseSpeed(10);
        audi.decreaseSpeed(5);
        audi.printSpeed();

        Car bmw=new Car();
        bmw.model="bmw";
        bmw.speed=50;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(40);
        bmw.increaseSpeed(180);
        bmw.decreaseSpeed(500);
        bmw.printSpeed();

        Car mercedes=new Car();
        mercedes.model="mercedes";
        mercedes.speed=90;
        mercedes.printSpeed();

















    }
}