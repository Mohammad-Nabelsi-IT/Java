public class DataTypeCasting {
    public static void main(String[] args) {
        // Doc
        // dataType name variable = (dataType) value;


        // -128 to 127 (150 - 128) = 22
        // -128 - 22 = -106
        // overflow -128
        byte numberByte = (byte) 150;
        System.out.println("number byte = " + numberByte);

        // short number
        short numberShort = (short) 327787 / 2;
        System.out.println(numberShort);
        
        int age = (int) 30.5;
        System.out.println("age : " + age);


    }
}
