package decorator;

public class BasicWatch implements Watch{

    @Override
    public void createFunctionality() {
        System.out.println("Basic watch with: ");
        this.addTimer();
    }

    public void addTimer(){
        System.out.println("* Timer");
    }
}
