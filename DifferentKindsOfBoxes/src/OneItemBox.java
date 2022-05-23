public class OneItemBox extends Box{
    private Item item;

    public OneItemBox() {
        item = null;
    }

    @Override
    public void add(Item item) {
        if (this.item == null){
            this.item = item;
        } else {
            System.out.println("Sorry the box is full.");
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.item == null){
            return false;
        } else {
            return item.equals(this.item);
        }

    }
}
