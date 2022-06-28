package builder.component;

import lombok.Getter;

@Getter
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }
}
