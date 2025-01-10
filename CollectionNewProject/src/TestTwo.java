public class TestTwo {
    public static void main(String[] args) {
        StringBuilder plus =new StringBuilder("Mohammad");
        plus.append(" Nabelsi");

        StringBuilder plus2 =new StringBuilder("Hello");

        //fName.reverse();
        //System.out.println(fName);
        System.out.println(plus);
      System.out.println(plus.compareTo(plus2));
        System.out.println(plus.delete(4,6));
       System.out.println(plus.deleteCharAt(0));
    }

}

