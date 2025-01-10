public class ArrayTwo {
    public static void main(String[] args) {
        int number []= {11,22,33,44,55,66,77,88,99,1000};
        int sum =0;
        for (int i = 0; i <number.length; i++) {
            sum+= number[i];

        }
        System.out.println(sum);
    }
}
