public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(150);

        cart.checkout(new CreditCardStrategy("1234-5678-9876"));
        cart.checkout(new PayPalStrategy("email@example.com"));
    }
}
