public class MethodDemo {


    public static void main(String[] args) {
       int  l = (int) returnLong();
       printInt(l);
    }

    static long returnLong (){
        return 10;
    }

    static  void printInt(int i){
        System.out.println(i);
    }
}
