public class MethodDemo2 {

    public static void main(String[] args) {

        String x ="Doaa";
        String y ="Mohamed";

        sayHello(x , y);
    }

    static void sayHello (String fName , String lNAme){
        String x = fName;

//        System.out.println(fName); //Doaa
//        System.out.println(x); // Doaa
//        System.out.println(lNAme); // Mohamed
//        System.out.println("---------------------------");

        fName = lNAme; // fName ="Mohamed"
//        System.out.println(fName); // MOhamed
//        System.out.println(x); // Doaa
//        System.out.println(lNAme); // Mohamed

        lNAme =x;

        System.out.println("Hello " + fName + " " + lNAme);
    }
}
