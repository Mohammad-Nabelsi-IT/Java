public class DataTypeStringChar {
    public static void main(String[] args) {

        // 16 bit
        char answer = 'Y';
        System.out.println("Do you want to play" + answer);
        answer = 'N';
        System.out.println("Do you want to play " + answer);

        // unicode
        // should four number  start( \ u )
        char uniCode = '\u2049';
        System.out.println("unicode " + uniCode);

        // Decimal
        // should  number four
        char decimal = 9925;
        System.out.println("decimal : " + decimal);

        // Tools emoji String
        String test = "🐦";
        System.out.println(test);

        // emoji for String
        String unicodestring = "\uD83E\uDD20";
        System.out.println(unicodestring);

        // string immutable
        String name = "Mohammad";
        name = "ali";
        System.out.println("55" + "66"); // 5566
        System.out.println(40 + "40"); // 4040


    }
}
