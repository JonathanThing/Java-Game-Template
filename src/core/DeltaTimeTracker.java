package core;

/**
 * Code to calculate the delta time (the time of an interval)
 */
public class DeltaTimeTracker {
    private long lastTime = 0; // Time of the last update
    private long deltaTime = 0; // The delta time from last update

    /**
     * Calculates the delta time from the last update
     */
    public void updateDeltaTime() {
        if (lastTime == 0) {
            lastTime = System.currentTimeMillis();
        } else {
            deltaTime = System.currentTimeMillis() - lastTime;
            lastTime = System.currentTimeMillis();
        }
    }

    /**
     * getDeltaTime
     * 
     * returns delta time in miliseconds
     */
    public long getDeltaTime() {
        return deltaTime;
    }

    /**
     * getDeltaTimeSecs
     * 
     * returns delta time in seconds
     */
    public double getDeltaTimeSecs() {
        return deltaTime / 1000.0;
    }
}