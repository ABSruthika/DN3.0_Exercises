package Implementing_Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

class StockMarket implements Stock {
    private List<Observer> observers;
    private int stockPrice;

    public StockMarket() {
        observers = new ArrayList<>();
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}
