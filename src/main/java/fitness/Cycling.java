package fitness;

public class Cycling implements FitnessActivity {
    private final double distanceKm;
    private final int durationMinutes;
    private final double averageSpeedKmh;

    public Cycling(double distanceKm, int durationMinutes, double averageSpeedKmh) {
        this.distanceKm = distanceKm;
        this.durationMinutes = durationMinutes;
        this.averageSpeedKmh = averageSpeedKmh;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double getAverageSpeedKmh() {
        return averageSpeedKmh;
    }

    @Override
    public void accept(FitnessVisitor visitor) {
        visitor.visit(this);
    }
}