package catalog17;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String productName) {
        for(Observer observer : observers)
            observer.update(productName);
    }

    public void addProduct(String name, String description, double price) {
        Product product = new Product(name, description, price);
        products.add(product);
        notifyObservers(name);
    }

    public void viewCatalog() {
        for(Product product : products) {
            System.out.println(product);
        }
    }

    public Product selectProduct(int index) {
        return products.get(index);
    }
}
