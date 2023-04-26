public class Weapon extends Item {
    int dmg;
    int swingTime;
    int range;
    // atkAnimation

    public Weapon(int itemID){
        super(itemID,false);
    }
    public int getDMG(){
        return dmg;
    }
    public int getSwingTime(){
        return swingTime;
    }
    public int getRange(){
        return range;
    }
}