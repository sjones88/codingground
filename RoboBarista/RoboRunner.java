import java.util.*;

public class RoboRunner {
    public static void main(String[] args) {
        RoboBarista robo = new RoboBarista();
        System.out.println(robo.inventoryUnits.get("coffee"));
    }
}