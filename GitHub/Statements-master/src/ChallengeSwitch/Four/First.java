package ChallengeSwitch.Four;

public class First {
    public static void main(String[] args) {
        // what will the result be? Don’t test the code. Answer the question by reading it!
        int number = 50;
        String storage = "";
        switch (number) {
            case 30:
//                storage = storage  + "Zn";
                storage += "Zn";
                break;
            case 60 :
                storage += "ii";
                break;
            case 50:
                storage += "Mn";

            case 70:
                storage += "Ne";
            case 5:
                storage += "H";
                System.out.println(storage);
                break;
            default:
                storage += "He";
                System.out.println(storage);
        }
    }
}
