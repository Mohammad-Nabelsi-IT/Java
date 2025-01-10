import javax.swing.*;

public class StatementsIf {
    public static void main(String[] args) {

        // 1
        boolean gameOver = true;

        if (gameOver == true) {
            System.out.println("Good Luck!");
        } else {
            System.out.println("Excellent");
        }

        // 2
        String fName = "Mai";
        if (fName == "Mai") {
            System.out.println("👍");
        } else {
            System.out.println("😢");
        }

        // 3 what is the output
        int n1 = 10, n2 = 33;
        String result;
        if (n1 >= n2) {
            result = "greater";
        } else {
            result = "less";
        }
        System.out.println("result = ( n1 >= n2)" + result);

        // 4 what is the Output ?
        double x1 = 34.55, x2 = 35.66, x3 = 23.45;
        double max;
        if (x1 > x2 && x1 > x3) {
            max = x1;
        } else {
            max = 0;
        }
        System.out.println("Max number = " + max);

        // if & else if & else
        String name = "Mai";
        if (name == "Mohammad") {
            System.out.println(" name : " + name);
        } else if (name == "Mai") {
            System.out.println("name : " + name);

        } else {
            System.out.println(" not found name 😢 ");
        }

        // grade
        String grade = "w";
        if (grade == "A") {
            System.out.println("Excellent");
        } else if (grade == "B") {
            System.out.println("Good");
        } else if (grade == "C") {
            System.out.println("Fair");
        } else if (grade == "D") {
            System.out.println("Poor");
        } else {
            System.out.println("Invalid Choice :" + grade);

        }
        // nested if
        int age = 9;
        if (age >= 18) {
            if (age >= 25) {
                System.out.println("first chair 🪑");
            } else {
                System.out.println("last chair 🪑");
            }
        } else {
            System.out.println("can't play 🥲");
        }



    }

}

