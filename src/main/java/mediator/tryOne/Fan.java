package mediator.tryOne;

public class Fan {
    private Mediator mediator;
    private Boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Boolean isOn() {
        return isOn;
    }

    public void turnOn(Mediator mediator){
        this.setMediator(mediator);
        mediator.start();
        this.isOn = true;
    }

    public void turnOff(Mediator mediator){
        this.setMediator(mediator);
        this.isOn = false;
        mediator.stop();
    }
}
