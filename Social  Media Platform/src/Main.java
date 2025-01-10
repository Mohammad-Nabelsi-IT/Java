public class Main {
    public static void main(String[] args) {

        RegularUser ru = new RegularUser("Mohammad", "mkjli@gmaol", "465321");
        Post p = ru.post("hello im Mohammad");
        System.out.println(p);
        RegularUser r1 = new RegularUser("ALi", "kjh@gmaiil.om", "987654");
        Post.Comment c = p.new Comment("Hi", r1);
        System.out.println(c);
        Post p2= r1.post("hi im Ali");
        System.out.println(p2);
        Post.Comment c1=p2.new Comment("Good",ru);
        System.out.println(c1);


    }
}
