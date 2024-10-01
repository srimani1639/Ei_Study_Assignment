public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Investor alice = new Investor("Alice");
        Investor bob = new Investor("Bob");

        stock.addObserver(alice);
        stock.addObserver(bob);

        System.out.println("Updating stock price to $100...");
        stock.setPrice(100.0f);

        System.out.println("Updating stock price to $105...");
        stock.setPrice(105.0f);
    }
}
