package ku.shop;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Order_Kantanop_6210451063 orderKantanop6210451063;

    private Map<String, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }

    public void addProduct(String name, double price, int stock) {
        products.put(name, new Product(name, price, stock));
    }

    public Product getProduct(String name) {
        return products.get(name);
    }
}
