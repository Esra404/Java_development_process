 class Car {
    String model;
    String type;
    String color;
    int speed;
    int speedLimit=180;


Car (String model,int speed,String color){
    this.model=model;
    this.speed=speed;
    this.color=color;
    this.type="sedan";
    this.speedLimit=180;


}
Car (String model){
    this.model=model;
   // System.out.println("bu boş metottur");
}
  void increaseSpeed(int increment){
      if((this.speed+increment)<speedLimit){
          this.speed +=increment;
      }
  }

  void  decreaseSpeed(int decrease){
      if(this.speed>0){
          this.speed -=decrease;
      }
  }

  void printSpeed(){
      System.out.println(this.model+"hızınız: "+this.speed);
  }
  void printInfo(){
      System.out.println("model :"+this.model);
      System.out.println("color :"+this.color);
      System.out.println("type :"+this.type);
      System.out.println("speed :"+this.speed);
  }
  void printiki(){
      System.out.println("model :"+this.model);
  }

}
