package decorator;

public class LuxuryWatchDecorator extends WatchDecorator{
    public LuxuryWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.println("And more features with (luxury watch): ");
        this.addFeature("* GPS ");
        this.addFeature("* FastCharge ");
        this.addFeature("* NFC ");
    }

    public void addFeature(String feature){
        System.out.println(feature);
    }
}
