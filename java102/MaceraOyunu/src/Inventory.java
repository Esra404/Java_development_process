public class Inventory {

private boolean water;
private boolean food;
private  boolean fireword;
private String weaponName;
private String  armorName;
private int  weapenDamage;
private int armorDefence;

public  Inventory(boolean water,boolean food,boolean fireword,String weaponName,String armorName,int weapenDamage,int armorDefence){
    this.water=water;
    this.food=food;
    this.fireword=fireword;
    this.weaponName=weaponName;
    this.armorName=armorName;
    this.weapenDamage=weapenDamage;
    this.armorDefence=armorDefenece;

}
public boolean getWater(){
   return water;
}
public void setWater(boolean water){
    this.water=water;

}public boolean getFood(){
    return food;
    }
    public void setFood(boolean food){
    this.food=food;
    }
    public boolean getFireword(){
    return  fireword;
    }
    public void setFireword(boolean fireword){
    this.fireword=fireword;
    }
    public String getWeaponName(){
    return  weaponName;
    }
    public void setWeaponName(String weaponName){
    this.weaponName=weaponName;
    }
    public String getArmorName(){
    return armorName;
    }
    public void setArmorName(String armorName){
    this.armorName=armorName;
    }
    public int getWeapenDamage(){
    return weapenDamage;
    }
    public void  setWeapenDamage(int weapenDamage){
    this.weapenDamage=weapenDamage;
    }
    public int getArmorDefence(){
    return armorDefence;
    }
    public void setArmorDefence(int armorDefence){
    this.armorDefence=armorDefence;
    }
}
