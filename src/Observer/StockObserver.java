package Observer;

public class StockObserver implements Observer{
    int stock1price;
    int stock2price;
    int stock3price;
    int idx;
    public StockObserver(StockUpdater updater,int idx){
        updater.register(this);
        this.idx = idx;
        System.out.println("Prices of stocks for idx "+idx+" are : "+stock1price +" , "+stock2price+" , "+stock3price);
    }
    @Override
    public void update(int price1, int price2, int price3) {
        stock1price = price1;
        stock2price = price2;
        stock3price = price3;
        System.out.println("Prices of stocks for idx "+idx+" are : "+stock1price +" , "+stock2price+" , "+stock3price);
    }
}
