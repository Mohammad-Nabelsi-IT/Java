public class ArrayDemo {
    public static void main(String[] args) {
//        String student1 = "Ahmed";
//        String student2 = "Mona";
//        String student3 = "Ali";
//        String student4 = "Sara";
//        String student5 = "Dina";
//
//        System.out.println("Hello " + student1);
//        System.out.println("Hello " + student2);


        String names [] = new String[5]; // Declaration + initilaization
        int degrees [] = new int[5];

        names[0] = "Ahmed";
        names[1] = "Mona";
        names[2] = "Ali";
        names[3] = "Sara";
        names[4] = "Dina";
//        names[5] = "Dina";

        degrees[0] = 100;

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + names[i]);
        }

        String students [] = {"Ali" , "Dina" ,"Sara"};

    }
}
