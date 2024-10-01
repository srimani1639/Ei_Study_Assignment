import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> items = new ArrayList<>();

    public void addItem(int price) {
        items.add(price);
    }

    public void checkout(PaymentStrategy strategy) {
        int total = items.stream().mapToInt(Integer::intValue).sum();
        strategy.pay(total);
    }
}
