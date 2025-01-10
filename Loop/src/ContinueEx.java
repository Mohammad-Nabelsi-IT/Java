public class ContinueEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3 || i == 5) {
                continue;
            }
            System.out.printf("number : %d %n", i);
        }

        int i = 1;
        while (i <= 5) {
            i++;
            if (i == 4) {
                continue;
            }
            System.out.printf("number i : %d %n", i);
        }
    }
}
