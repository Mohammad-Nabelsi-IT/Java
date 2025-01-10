public class SwapDemo {

    public static void main(String[] args) {
        int x  = 10;
        int y = 20 ;
        swap(x , y); // swap(10,20) // pass by value

        System.out.println("x " + x);
        System.out.println("y " + y);
    }

    static  void swap(int a , int b){
        //a =10 , b = 20 value
//        System.out.println("a " + a);  // a = 10
//        System.out.println("b " + b); // b = 20
        int temp = b; // temp =20
        b = a; // b=10
        a = temp; // a = 20
        //System.out.println("a " + a);  // a = 20
        //System.out.println("b " + b); // b =10
    }
}
