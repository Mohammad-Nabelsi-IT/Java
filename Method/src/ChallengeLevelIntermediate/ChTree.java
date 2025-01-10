package ChallengeLevelIntermediate;

public class ChTree {
    public static void main(String[] args) {
        printMegaBytesAndKiloByte(2500);
        printMegaBytesAndKiloByte(-2500);
    }

    /**
     * this function give kiloBytes to covert MegaBytes
     *
     * @param kiloBytes number kilo bytes
     * @return void
     */
    public static void printMegaBytesAndKiloByte(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int result = kiloBytes % 1024;
        //System.out.println(kiloBytes + " KB =" + megaBytes + "MB and " + result + "KB");
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            System.out.printf("%d KB = %d  MB and %d  KB %n", kiloBytes, megaBytes, myRemainder);
        } else {

        }
    }

}
