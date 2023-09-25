
public class SmartHomeControl {
    public static void main(String[] args) {
        Observable observable = new Observable();

        observable.setOb(new Tv("Tv Living room", 10,10));
        observable.setOb(new TvDiningRoom("Tv Dining room", 10, 155));
        observable.setOb(new Speaker("Speaker living room", 10,300));
        observable.setOb(new Window("Window Living room", 10,445));

        new MainSwitch(observable).setVisible(true);
    }
}