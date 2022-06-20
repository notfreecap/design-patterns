package mediator.tryOne;

public class ClientMediator {
    public static void main(String[] args) {
        Button button = new Button();
        Fan fan = new Fan();

        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);

        mediator.press();

        System.out.println("IS ON?");
        System.out.println(fan.isOn());
    }
}
