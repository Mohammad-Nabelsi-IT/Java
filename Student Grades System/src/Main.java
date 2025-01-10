public class Main {
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        studentGrades.addGrade(100);
        studentGrades.addGrade(50);
        studentGrades.addGrade(30);
        System.out.println("Average Grades Student" + studentGrades.CalculateAverage());
        System.out.println("Highest Grades Student" + studentGrades.findHighestGrade());
        System.out.println("Lowest Grades Student" + studentGrades.findLowestGrade());
    }
}
