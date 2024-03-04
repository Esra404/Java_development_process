public class Player {
    private int damage;
    private int healtly;
    private int money;
    private String name;

    public Inventory i̇nventory;

    public Player (int damage,int healtly,int money,String name){
        this.damage=damage;
        this.healtly=healtly;
        this.money=money;
        this.name=name;

    }

    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }
    public int getHealtly(){
        return healtly;
    }
    public void setHealtly(int healtly){
        this.healtly=healtly;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void selectChar(){
        System.out.println(this.damage+"lütfen bir karakter seç");
    }
}
