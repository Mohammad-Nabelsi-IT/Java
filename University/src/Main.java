public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Mohammad", 33, "m7.lkj@gmail.com" );
//        System.out.println(p);
        Student s1 = new Student("Mohammad", 33, "mmllilm@gmail.com", "321654");
        System.out.println(s1);
        Student s2 = new Student("Mai", 33, "mkj@gmail.com", "132465");
        Student [] studentsArr = {s1,s2};

        Course c1=new Course("123","java",p,studentsArr);
        Course c2=new Course("456","CSS",p,studentsArr);
        Course c3 =new Course("789","PHP",p,studentsArr);
        Course [] coursesArr = {c1 , c2 ,c3};

        p.setCourses(coursesArr);
        System.out.println(c2);
    }
}
