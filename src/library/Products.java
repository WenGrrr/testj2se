package library;

/**
 * Интерфейс для продуктов
 */
public interface Products {
    /**
     * Получение имени
     * @return
     */
    String getName();

    /**
     * Установка имени
     * @param name
     */
    void setName(String name);

    /**
     * Получение автора
     * @return
     */
    String getAuthor();

    /**
     * Установка автора
     * @param name
     */
    void setAuthor(String name);
}
