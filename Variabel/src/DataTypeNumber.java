public class DataTypeNumber {

    public static void main(String[] args) {

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("int min value : " + minValue);
        System.out.println("int max value : " + maxValue);


        // overflow
        System.out.println(maxValue + 1);// -214784364
        // underflow
        System.out.println(minValue - 1);// 2147483647

        System.out.println("range integer ( " + minValue + "to " + maxValue + " ");
        // readable number
        // don't used _ first or end
        System.out.println(2_147_483_647);
        System.out.println(-2_147_483_648);


        int gradMai = 90;
        int gradMohammed = 80;

        System.out.println(" max number : " + Integer.max(gradMohammed, gradMai));
        System.out.println(" min number : " + Integer.min(500, 10));

        // byt 8 bit ( -128 to 127 )
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(" range byte : ( " + minByte + "to" + maxByte + ")");
        byte x1 = 127;
        System.out.println(x1);


        // short 16 bit (-32768 to 32767)
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("range short : ( " + minShort + "to" + maxShort + ")");
        short x2 = 32766;
        System.out.println(x2);

        // long 64 bit

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println(" range long : (" + minLong + "to" + maxLong + ")");

        // fix it l or L -> best practice (L)

        long longNumber = 2147483690L;
        System.out.println(longNumber);


    }

}
