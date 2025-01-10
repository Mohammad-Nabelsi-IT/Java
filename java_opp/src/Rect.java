public class Rect { // Rectangular مستطيل
    // properties , attributes ,class member variables
    double width; // العرض
    double length; // الطول
    String color ; // اللون

    // Constructor البنا
    Rect(){ //default constructor
        // Initialization
        System.out.println("Rect Created");
        width  = 5;
        length = 10;
        color ="white";
    }

    // polymorphism تعدد الأوجه
    // overloads
    Rect(double w){
        width = w;
        length=w;
        color="blue";
    }

    Rect(double w , double l ){
        width = w;
        length= l;
        color="blue";
    }
    Rect(double w , double l , String c){
        width = w;
        length= l;
        color=c;
    }


    // methods
    double area(){  // المساحة
        double a = width * length;
        return  a;
    }
}
