package ChallengLevelOne;

public class ChTwo {
    public static void main(String[] args) {
        int sum = getTotal(22, 33, 66);
        System.out.println(sum);

        int sum1 = getTotal(200, 499, 100);
        System.out.println(sum1);

        int sum2 = getTotal(44, 55, 88);
        System.out.println(sum2);
        
    }//main

    // sum number
    public static int getTotal(int n1, int n2, int n3) {

        int sum = n1 + n2 + n3;
        return sum;
    }
}//class
