public class TestMethods {
    static  void welcome(){
        System.out.println("Welcome");
    }

    static  void  hello(){
        System.out.println("Hello");
    }

    static  String sayHello(){
        return "Hello";
    }
    public static void main(String[] args) {
          hello();
          String rslt =  sayHello();
          System.out.println(rslt);
          System.out.println(sayHello());
    }

}
