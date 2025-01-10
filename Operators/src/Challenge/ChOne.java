package Challenge;

public class ChOne {
    public static void main(String[] args) {

        boolean isSelected = (5 <= 10 && 10 > 30 || 33 > 12);
        // F && F || T
        // F || T
        // (T)
        System.out.println(isSelected);

        boolean isSelected2 = (5 <= 332 && 44 > 100 || 33 > 12) || !(99 >= 10 && 45 <= 77 && 99 > 23);
        // ( F && T || T) || !( F && F && T)
        // ( F || T ) || !( F && F )
        // ( T ) || !( T )
        // ( T )
        System.out.println(isSelected2);

    }
}
