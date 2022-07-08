package library;

public abstract class Product implements Products {
    String name;
    String author;

    @Override
    public abstract String getName();

    @Override
    public abstract void setName(String name);

    @Override
    public abstract String getAuthor();

    @Override
    public abstract void setAuthor(String author);
}
