package ku.shop;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyStepdefs_Kantanop_6210451063 {

    private ProductCatalog catalog;
    private Order_Kantanop_6210451063 orderKantanop6210451063;

    @Given("the store is ready to service customers")
    public void the_store_is_ready_to_service_customers() {
        catalog = new ProductCatalog();
        orderKantanop6210451063 = new Order_Kantanop_6210451063();
    }

    @Given("a product {string} with price {float} and stock of {int} exists")
    public void a_product_exists(String name, double price, int stock) {
        catalog.addProduct(name, price, stock);
    }

    @When("I buy {string} with quantity {int}")
    public void i_buy_with_quantity(String name, int quantity) {
        Product prod = catalog.getProduct(name);
        orderKantanop6210451063.addItem(prod, quantity);
    }

    @Then("total should be {float}")
    public void total_should_be(double total) {
        assertEquals(total, orderKantanop6210451063.getTotal());
    }

    @Then("there are {int} {string} left")
    public void there_are_left(int stock, String name) {
        catalog.getProduct(name);
        assertEquals(stock, orderKantanop6210451063.getAmountleft());
    }
}