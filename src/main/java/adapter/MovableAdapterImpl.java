package adapter;

public class MovableAdapterImpl implements MovableAdapter{

    private Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHToKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHToKMPH(double mph){
        return mph * 1.60934;
    }
}
