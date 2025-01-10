public class CastingDemo {

    public static void main(String[] args) {

        /*
            byte kb Mb GB TB
            kb = 1024 byte
            Mb = 1024 KB
            GB = 1024 MB
            TB = 1024 GB

            byte        1 byte = 8 bit , -2^7 , 2^7-1 , -128 , 127 , 0 ,255
            short       2 byte = 16 bit
            int         4 byte = 32 bit
            long        8 byte = 64 bit

         */
        byte b1 = 10 ;  // 00001010
        b1 =8; // 00000000
        int i = b1; // 10

        i = 255; // 00000000 00000000 00000000 11111111


        // casting or conversion
        byte b2 = (byte) i; // 11111111  -128 +64+32+16+8+4+2+1  == -1

        System.out.println(b2);

        short s = (short) i; // 00000000 11111111

        System.out.println(s);

        int z = b2; // implicit casting
        System.out.println(z);

        byte b3 = (byte) z;

        // implicit casting
        //                  char
        // byte => short => int => long
        //                         float => double


        float f = z;

        System.out.println(f);


        int v = (int) f;

        double d = v;

        v = (int) d;

        char c ='A';
        byte s2 = (byte) c;
        System.out.println(s2);

        int ii = 10;
        long l = ii;
        int i4 = (int) l;
        // 5


//        b1 = -129;




    }
}
