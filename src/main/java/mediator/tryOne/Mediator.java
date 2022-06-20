package mediator.tryOne;

public class Mediator {

    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public void press(){
        if (Boolean.TRUE.equals(fan.isOn())){
            fan.turnOff(this);
        }else {
            fan.turnOn(this);
        }
    }

    public void start(){
        powerSupplier.turnOn();
    }

    public void stop(){
        powerSupplier.turnOff();
    }
}
