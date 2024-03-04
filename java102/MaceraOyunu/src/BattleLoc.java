public abstract class BattleLoc extends  Location{
    Obstacle obstacle;
    BattleLoc(Obstacle o){
        this.obstacle=o;
    }


    public void combat(){

    }

    @Override
    public boolean onLocation() {
        return false;
    }

}
