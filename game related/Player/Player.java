import java.util.*;
public class Player {
    //skin
    
    //hp cannot go above maxHP
    private int maxHP;
    private int hp;
    //food cannot go above MAX_FOOD, if drops to 0 reduces health
    private final int MAX_FOOD = 10;
    private int food;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private Item[] hotbar = new Item[10];
    private Item inUse;
    private double posX;
    private double posY;
    private double posZ;
    private double moveSPD;
    private int amount;

    public Player(){
        maxHP = 100;
        hp = 100;
        //inUse
        posX = 0;
        posY = 0;
        posZ = 0;
        food = 10;
    }

    //getter methods
    public int getMaxHP(){
        return maxHP;
    }
    public int getHP(){
        return hp;
    }
    public int getFood(){
        return food;
    }
    public double getX(){
        return posX;
    }
    public double getY(){
        return posY;
    }
    public double getZ(){
        return posZ;
    }
    public double getMoveSPD(){
        return moveSPD;
    }

    //setterMethods
    public void raiseMaxHP(int raise){
        maxHP+=raise;
    }
    public void setMaxHP(int newMaxHP){
        maxHP = newMaxHP;
    }
    public void reduceFood(){
        food--;
        if(food<0){
            hp-=10;
        }
    }
    public void setFood(int foodLevel){
        food = foodLevel;
    }
    public void setCord(double x, double y, double z){
        posX = x;
        posY = y;
        posZ = z;
    }
    public void setX(double x){
        posX = x;
    }
    public void setY(double y){
        posY = y;
    }
    public void setZ(double z){
        posZ = z;
    }
    public void setMoveSPD(double spd){
        moveSPD = spd;
    }


    public void useItem(Item inUse){
        //implementation not shown
        getMaxHP();
    }
    public void eat(Item food){
        //increases food by set amount, consumes the food

        //amount = amount of food that the item restores
        amount = 0;//temporary, until food items are added
        food+=amount;
        //deletes the food item
    }


}