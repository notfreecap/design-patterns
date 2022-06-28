package builder.component;

import lombok.Getter;

@Getter
public class Engine {
    private final Double volume;
    private Double mileage;
    private Boolean started;

    public Engine(Double volume, Double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on(){
        this.started = true;
    }

    public void off(){
        this.started = false;
    }

    public boolean isStarted(){
        return this.started;
    }

    public void go(double mileage){
        if (started) {
            this.mileage += mileage;
        }else {
            System.err.println("Cannot go, you must start engine fist");
        }
    }
}
