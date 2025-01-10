public class ForEachDEmo2 {

    public static void main(String[] args) {
        String [] months = {"JAN" , "FEB" ,"March"};
        for (int i = 0; i < months.length ; i++) {
            System.out.println(months[i]);
        }

        for (String m : months){
            System.out.println(m);
        }

        int [] x ={10,20,50,80,70};
        for (int i : x) System.out.println(i);

    }
}
