public class StudentGrades {
    private int[] grades;
    private int count = 0;

    public StudentGrades() {
        grades = new int[100];
        count = 0;

    }

    public void addGrade(int grade) {
        grades[count] = grade;
        count++;
    }

    public double CalculateAverage() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        return (double) sum / count;
    }

    public int findHighestGrade() {
        int hightes = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] > hightes) {
                hightes = grades[i];
            }

        }
        return hightes;
    }

    public int findLowestGrade() {
        int lowest = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }

        }
        return lowest;
    }
}
