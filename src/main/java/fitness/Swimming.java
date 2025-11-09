package fitness;

public class Swimming implements FitnessActivity {
    private final int laps; // one lap = 50 meters
    private final int durationMinutes;

    public Swimming(int laps, int durationMinutes) {
        this.laps = laps;
        this.durationMinutes = durationMinutes;
    }

    public int getLaps() {
        return laps;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getDistanceKm() {
        return laps * 0.05; // 50 meters per lap => 0.05 km
    }

    @Override
    public void accept(FitnessVisitor visitor) {
        visitor.visit(this);
    }
}