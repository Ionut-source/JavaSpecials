package ro.java.ctrln;

import java.util.Random;

public interface Starship {

    public void warp();

    public void setStarshipDestination(String destination);

    public double computWarpSpeed(int warpFactor, int lightYearsToDestination);

    default Double productionID() {
        Random r = new Random();
        return 1 + (2 - r.nextDouble());
    }
}
