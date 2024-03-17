package Observer;

import java.util.ArrayList;
import java.util.List;

public class StockUpdater implements Publisher{

    List<Observer> observers;
    int stock1price;

    public void setStock1price(int stock1price) {
        this.stock1price = stock1price;
        notifyObservers();
    }

    public void setStock2price(int stock2price) {
        this.stock2price = stock2price;
        notifyObservers();
    }

    public void setStock3price(int stock3price) {
        this.stock3price = stock3price;
        notifyObservers();
    }

    int stock2price;
    int stock3price;

    public StockUpdater(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index = this.observers.indexOf(o);
        this.observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(stock1price,stock2price,stock3price);
        }
    }

}
