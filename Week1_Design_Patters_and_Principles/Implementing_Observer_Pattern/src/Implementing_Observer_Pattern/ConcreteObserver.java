package Implementing_Observer_Pattern;

class MobileApp implements Observer {
    @Override
    public void update(int stockPrice) {
        System.out.println("MobileApp: Stock price updated to " + stockPrice);
    }
}

class WebApp implements Observer {
    @Override
    public void update(int stockPrice) {
        System.out.println("WebApp: Stock price updated to " + stockPrice);
    }
}
