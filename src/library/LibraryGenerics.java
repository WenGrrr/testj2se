package library;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class LibraryGenerics {
    List<Product> products;

    public LibraryGenerics(int n) {
        products = new ArrayList<Product>();

        for (int i = 1; i < n; i++) {
            products.add(new Product("Ведьмак "+i, InfoType.videos));
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }




}
