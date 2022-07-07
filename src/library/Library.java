package library;

public class Library {
    Product[] products;
    Product[] buf;
    public Library(Product product) {
    if(products != null){
        for (int i = 0; i < products.length; i++) {
            buf[i] = products[i];
        }
         buf[products.length + 1] = product;
        this.products = buf;
        }
        this.products = new Product[]{product};
    }


    public Library(int n) {
        products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = new Product("Ведьмак "+i, InfoType.books);
        }
    }



    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }



}
