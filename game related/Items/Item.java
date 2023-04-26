public class Item {
    private final int itemID;
    private final boolean consumable;
    //skin
    public Item(){
        itemID = 0;
        consumable = false;
    }
    public Item(int itemID, boolean consumable){
        this.itemID = itemID;
        this.consumable = consumable;
    }
    public int getID(){
        return itemID;
    }
}