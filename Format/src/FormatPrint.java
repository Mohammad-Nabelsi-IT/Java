public class FormatPrint {
    public static void main(String[] args) {

        int age = 30;
        String fName ="Mohamed";
        String lName = "Elsayed";

        System.out.println("First Name : "+fName + " last Name : "+lName + " age : "+age);
        System.out.printf("First Name : %s Last Name : %s age : %d  \n",fName,lName,age);


        double salary  = 20000;
        char answer = 'y';
        System.out.printf("Salary : %.3f , Is this enough for you ? %c 10%%  %n",salary,answer);



    }
}
