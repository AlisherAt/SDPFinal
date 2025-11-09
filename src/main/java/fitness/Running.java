package fitness;

public class Running implements FitnessActivity {
    private final double distanceKm; // distance in kilometers
    private final int durationMinutes;

    public Running(double distanceKm, int durationMinutes) {
        this.distanceKm = distanceKm;
        this.durationMinutes = durationMinutes;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public void accept(FitnessVisitor visitor) {
        visitor.visit(this);
    }
}