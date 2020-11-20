package POP;

public class ObserverImpl2 implements Observer {
    private int counter;
    @Override
    public void update(Observable observable) {
        int state =((ObservableImpl) observable).getState();
        if (state%2==0) ++counter;
        System.out.println("*********** POP.Observer 2 ***********");
        System.out.println("New update : State="+state);
        System.out.println("result : "+((state%2)==0?"pair":"impair"));
        System.out.println("Counter = "+counter);
        System.out.println("********************************");

    }
}
