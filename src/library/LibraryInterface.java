package library;

/**
 * Интерфейс библиотек
 */
public interface LibraryInterface {
    /**
     *
     * @return
     */
    Product[] getProducts();

    /**
     *
     * @param index
     * @return
     */
    Product getProduct(int index);

    /**
     *
     * @param product
     */
    void setProduct(Product product);

    /**
     *
     * @param product
     */
    void setProducts(Product[] product);

    int getSize();
}
