public class ForEach {
    public static void main(String[] args) {

        int [] salries = { 5000,6000,7000,4000,6500} ;

        int sum =0;
        for(int salary : salries){
            sum += salary;
            System.out.println(salary);
        }
        System.out.println("Total :  " + sum);
        String names [] ={"Ali" ,"Ahmed" ,"Sara"};
        for (String name : names)
            System.out.println(name);
    }
}
