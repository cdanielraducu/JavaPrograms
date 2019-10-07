package com.Dani;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {

    StockItem temp = new StockItem("bread" ,8, 100);
    stockList.addStock(temp);

    temp = new StockItem("cake",10,7);
    stockList.addStock(temp);

    temp = new StockItem("car",5000,1);
    stockList.addStock(temp);

    temp = new StockItem("desks",100,11);
    stockList.addStock(temp);

    temp = new StockItem("pens",1,1000);
    stockList.addStock(temp);

    temp = new StockItem("pens",0.8,100);
    stockList.addStock(temp);

    System.out.println(stockList);

    for(String s: stockList.Items().keySet()){
        System.out.println(s);

    Basket timsBasket = new Basket("Tim");
    sellItem(timsBasket, "car",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"pens",1000);
        System.out.println(timsBasket);

        sellItem(timsBasket,"cars",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"wheel",1);
        System.out.println(timsBasket);
    }


    }
    public static int sellItem(Basket basket, String item, int quantity){
        //retrieve the item for stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " +item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}
