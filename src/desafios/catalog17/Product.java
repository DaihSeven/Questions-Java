package catalog17;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Descricao: " + description + ", Preco: " + price;
    }
}

