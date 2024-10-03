package swaglabs.steps;

import io.cucumber.java.en.When;
import swaglabs.base.base;
import swaglabs.pages.loginPage;
import swaglabs.pages.productPage;

public class productStep extends base {
    productPage ProductPage;

    @When("Klik produk detail {string}")
    public void klikProdukDetail(String product) {
        ProductPage = new productPage(driver);
        ProductPage.KlikProductDetail(product);
    }
}
