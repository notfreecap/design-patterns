package abstractFactory;

public class ClientAbstractFactory {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal duck;
        duck = animalFactory.create("Duck");
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound());
    }
}
