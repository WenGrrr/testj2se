package library;

public class LibraryGenerics<T> implements LibraryInterface{

    private T typeProduct;
    private Product[] products;
    private Product[] buf;

    public LibraryGenerics(int n, T typeProduct) {
        this.typeProduct = typeProduct;
        products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = (Product) typeProduct;
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
    public void setProducts(Product[] product) {
        this.products = products;
    }

    @Override
    public int getSize() {
        return this.products.length;
    }
}
