public class Demo {

    public static void main(String[] args) {

//        for(int i = 1; i <= 10  ; i++) {
//            if (i % 2 == 0)
//                System.out.println(i);
//        }

        for(int i = 1; i <= 10  ; i++) {
            if (i % 2 != 0)  continue;
            System.out.println(i);
        }

        int x =10;
        while (x <=20 ) {
            if(x ==15 || x ==19 ) {
                x++;
                continue;
            }
            System.out.println(x++);
        }
    }
}


/*
    *********
    ********
    *******
    *****
    ***
    *
 */