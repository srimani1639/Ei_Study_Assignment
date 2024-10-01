public class Stock extends Subject {
    private float price;

    public void setPrice(float price) {
        this.price = price;
        notifyObservers(price);
    }
}
