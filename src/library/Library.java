package library;

public class Library implements LibraryInterface{
    private Product[] products;
    private Product[] buf;

    public Library(int n) {
        products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = new Video("Ведьмак "+i,"Анджей Сапковский");
        }
    }

    @Override
    public Product[] getProducts() {
        return products;
    }

    @Override
    public Product getProduct(int index) {
        return products[index];
    }

    @Override
    public void setProduct(Product product) {
        buf = new Product[products.length+1];
        for (int i = 0; i < products.length; i++) {
            buf[i] = products[i];
        }
        buf[products.length+1]=product;
        products = buf;
    }

    @Override
    public void setProducts(Product[] products) {
        this.products = products;
    }
    @Override
    public int getSize() {
        return this.products.length;
    }
}
