public class Player {
    private int health;
    private int damage;
    private int money;
    private String name;
    private  String charName;

    public  Player(String name){
        this.name=name;

    }
public void selectChar(){
        GameChar [] charList={new Samuray(),new Knight(),new Archer()};

    for (GameChar gameChar: charList
         ) {
        System.out.println("Karakter : "+gameChar.getName()+
                " \t Hasar : "+gameChar.getDamage()+
                " \t Sağlık : "+gameChar.getHealth()+
                " \t Para : " +gameChar.getMoney());

    }
}
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getCharName() {
        return charName;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }


}
