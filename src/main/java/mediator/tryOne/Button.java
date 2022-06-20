package mediator.tryOne;

public class Button {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press(Mediator mediator){
        setMediator(mediator);
        this.mediator.press();
    }
}
