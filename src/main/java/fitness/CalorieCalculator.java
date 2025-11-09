package fitness;

public class CalorieCalculator implements FitnessVisitor {
    private double totalCalories = 0.0;

    // Approximate MET values: Running=10, Cycling=8, Swimming=7 (moderate intensity)
    @Override
    public void visit(Running running) {
        // Calories = MET * weight(kg) * duration(hrs)
        // Assuming average weight = 70kg
        double calories = 10.0 * 70 * (running.getDurationMinutes() / 60.0);
        totalCalories += calories;
    }

    @Override
    public void visit(Cycling cycling) {
        double calories = 8.0 * 70 * (cycling.getDurationMinutes() / 60.0);
        totalCalories += calories;
    }

    @Override
    public void visit(Swimming swimming) {
        double calories = 7.0 * 70 * (swimming.getDurationMinutes() / 60.0);
        totalCalories += calories;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void reset() {
        totalCalories = 0.0;
    }
}