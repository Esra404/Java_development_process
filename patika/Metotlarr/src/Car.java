public class Car {
    //özellikleri buraya yazıyoru
    String type;
    String model;
    String color;
    int speed;
    int speedLimit=100;

    Car(String type,String model,String color){
        this.type=type;
        this.model=model;
        this.color=color;
        this.speed=0;
    }

    void increaseSpeed(int increment){
        if((speed+increment)<speedLimit){
            speed += increment;
        }
    }
    void decreaseSpeed(int decrease){
        if(speed>0){
            speed -=decrease;
        }
    }
    void printSpeed(){
        System.out.println(model+"   hızınız   "+speed);

        //nesneler sınıfları oluşturan şablonlardı
    }
    void printInfo(){
        System.out.println("--------------");
        System.out.println("model: "+this.model);
        System.out.println("color: "+this.color);
        System.out.println("type: "+this.type);
        System.out.println("speed: "+this.speed);
    }



}
