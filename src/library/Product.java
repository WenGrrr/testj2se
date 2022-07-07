package library;

public class Product {
    String name;
    InfoType type;

    public Product(String _name, InfoType _type) {
        this.setName(_name);
        this.setType(_type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InfoType getType() {
        return type;
    }

    public void setType(InfoType type) {
        this.type = type;
    }
}
