public class ProductWarehouse extends Warehouse{
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName(){
        return productName;
    }

    public double getBalance() {
        return super.getBalance();
    }

    public void setName(String newName){
        productName = newName;
    }

    @Override
    public String toString() {
        return productName+ ": " + super.toString();
    }
}
