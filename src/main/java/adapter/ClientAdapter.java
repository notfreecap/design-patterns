package adapter;

public class ClientAdapter {
    public static void main(String[] args) {

        Movable bugatti = new BugattiVeyron();
        MovableAdapter bugattiAdapter = new MovableAdapterImpl(bugatti);

        System.out.println("WITHOUT ADAPTER");
        System.out.println(bugatti.getSpeed());
        System.out.println("USING ADAPTER");
        System.out.println(bugattiAdapter.getSpeed());

    }
}
