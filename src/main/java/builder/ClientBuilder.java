package builder;

import builder.builder.CarBuilder;
import builder.builder.CarManualBuilder;
import builder.car.Car;
import builder.car.Manual;
import builder.director.Director;

public class ClientBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nManual:\n" + manual.print());
    }
}
