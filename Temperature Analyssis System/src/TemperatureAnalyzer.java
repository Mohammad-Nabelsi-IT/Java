public class TemperatureAnalyzer {
    private double[] temperatures;
    private int[] days;
    int count = 0;

    public TemperatureAnalyzer() {
        days = new int[7];
        count = 0;

    }

    public void addTemperatures(double temperature) {
        temperatures[count] = temperature;
        count++;
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += temperatures[i];
        }
        return (double) sum / count;
    }

    public double highestTemperature() {
        double hightes = temperatures[0];
        for (int i = 1; i < count; i++) {
            if (temperatures[i] > hightes) {
                hightes = temperatures[i];
            }

        }
        return hightes;
    }

    public double lowestTemperature() {
        double lowest = temperatures[0];
        for (int i = 1; i < count; i++) {
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }

        }
        return lowest;
    }
}
