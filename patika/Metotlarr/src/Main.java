public class Main {
    public static void main(String[] args) {
        Car audi=new Car("suports","audi","red");

        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printInfo();


        Car bmw=new Car("suports","bmw","blue");

        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(120);
        bmw.printInfo();



        Car mercedes=new Car("corporate","mercedes","black");
        mercedes.printInfo();

    }
}
