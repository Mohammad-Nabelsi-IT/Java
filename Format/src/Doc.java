public class Doc {
    public static void main(String[] args) {

    }
    /**
     * this function work gives information on personal
     *
     * @param fName first name
     * @param lName last name
     * @param age   age personal
     * @return full name type (String)
     */
    public static String myInfo(String fName, String lName, int age) {

        System.out.printf("first name : %s, last name : %s, age : %d %n", fName, lName, age);
        return fName + " " + lName;

    }
}
