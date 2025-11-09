package fitness;

import java.util.List;

public class FitnessApp {
    public static void main(String[] args) {
        List<FitnessActivity> activities = List.of(
                new Running(5.2, 30),
                new Cycling(15.0, 45, 20.0),
                new Swimming(20, 25)
        );

        // Calculate total calories
        CalorieCalculator calorieCalculator = new CalorieCalculator();
        for (FitnessActivity activity : activities) {
            activity.accept(calorieCalculator);
        }
        System.out.printf("🔥 Total calories burned: %.2f%n%n", calorieCalculator.getTotalCalories());

        // Generate activity summary
        SummaryReporter reporter = new SummaryReporter();
        for (FitnessActivity activity : activities) {
            activity.accept(reporter);
        }
        System.out.println("📋 Weekly Summary:");
        System.out.print(reporter.getSummary());
    }
}