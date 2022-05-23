import java.util.ArrayList;
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public int currentWeight() {
        int currentWeight = 0;
        for (Item thing: items) {
            currentWeight += thing.getWeight();
        }
        return currentWeight;
    }

    @Override
    public void add(Item item) {
        if (this.currentWeight() + item.getWeight() <= capacity){
            items.add(item);
        } else {
            System.out.println("Sorry, this box is full.");
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item thing : items) {
            if(thing.equals(item)){
                return true;
            }
        }
        return false;
    }
}
