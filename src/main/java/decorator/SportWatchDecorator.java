package decorator;

public class SportWatchDecorator extends WatchDecorator{

    public SportWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("And more features with (sport watch): ");
        this.addFeature("* SleepMode ");
        this.addFeature("* Radio ");
    }

    public void addFeature(String feature){
        System.out.println(feature);
    }
}
