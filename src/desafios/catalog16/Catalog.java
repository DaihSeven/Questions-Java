package catalog16;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();

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

    public void addProduct(String name, String description, double price, String subscribeChoice) {
        if (subscribeChoice.equals("S"))
            notifyObservers(name);
        else
            System.out.println("Programa Encerrado.");
    }
}

