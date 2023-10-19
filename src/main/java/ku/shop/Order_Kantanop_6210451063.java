package ku.shop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order_Kantanop_6210451063 {
    private List<OrderItem> items;
    private LocalDateTime date;

    public Order_Kantanop_6210451063() {
        this.items = new ArrayList<>();
        this.date = LocalDateTime.now();
    }

    public void addItem(Product prod, int quantity) {
        items.add(new OrderItem(prod, quantity));
        prod.cutStock(quantity);
    }

    public double getTotal() {
        double total = 0;
        for (OrderItem item : items)
            total += item.getSubtotal();
        return total;
    }

    public int getAmountleft() {
        int amount = 0;
        for (OrderItem item : items)
            amount = item.getQuantity();
        return amount;
    }
}
