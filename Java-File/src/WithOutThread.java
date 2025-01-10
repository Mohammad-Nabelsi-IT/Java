public class WithOutThread {

    public static void main(String[] args) {
        run("First");
        run("second");
    }

    public static void run(String name) {
        for (int i = 0; i < 400; i++) {
            System.out.println(name + " " + i);
        }
    }
}
