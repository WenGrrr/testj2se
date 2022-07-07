package library;

import java.util.List;

public class Library {
    Product[] products;

    public Library(int n) {
        products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = new Product("Ведьмак "+i, InfoType.books);
        }
    }



    public Product[] getProduct() {
        return products;
    }

    public void setProduct(Product[] product) {
        this.products = product;
    }



}
