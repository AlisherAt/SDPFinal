package fitness;

public class SummaryReporter implements FitnessVisitor {
    private final StringBuilder summary = new StringBuilder();

    @Override
    public void visit(Running running) {
        summary.append(String.format("🏃 Ran %.2f km in %d min%n",
                running.getDistanceKm(), running.getDurationMinutes()));
    }

    @Override
    public void visit(Cycling cycling) {
        summary.append(String.format("🚴 Cycled %.2f km (%.1f km/h) in %d min%n",
                cycling.getDistanceKm(), cycling.getAverageSpeedKmh(), cycling.getDurationMinutes()));
    }

    @Override
    public void visit(Swimming swimming) {
        summary.append(String.format("🏊 Swam %d laps (%.2f km) in %d min%n",
                swimming.getLaps(), swimming.getDistanceKm(), swimming.getDurationMinutes()));
    }

    public String getSummary() {
        return summary.toString();
    }

    public void reset() {
        summary.setLength(0);
    }
}