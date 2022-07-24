package core;

public class DeltaTimeTracker {
    private long lastTime = 0;
    private long deltaTime = 0;

    public void updateDeltaTime() {
        if (lastTime == 0) {
            lastTime = System.currentTimeMillis();
        } else {
            deltaTime = System.currentTimeMillis() - lastTime;
            lastTime = System.currentTimeMillis();
        }
    }

    public long getDeltaTime() {
        return deltaTime;
    }

    public double getDeltaTimeSecs() {
        return deltaTime / 1000.0;
    }
}