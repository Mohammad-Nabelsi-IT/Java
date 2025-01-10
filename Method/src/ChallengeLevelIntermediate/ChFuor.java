package ChallengeLevelIntermediate;

public class ChFuor {
    //  We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
    //
    //  Write a method `shouldWakeUp` that has 2 parameters.
    //
    //  1st parameter should be of type boolean and be named `barking` it represents if our dog is currently barking.
    //  2nd parameter represents the hour of the day and is of type int with the name `hourOfDay` and has a valid range of 0-23.
    //  23, 00, 1 , 2, 3, 4, 5, 6, 7 return true

    //  We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

    //  In all other cases return false.
    //
    //  If the hourOfDay parameter is less than 0 or greater than 23 return false.
    //
    //  Examples of input/output:
    //
    //    * shouldWakeUp (true, 1); → should return true
    //
    //    * shouldWakeUp (false, 2); → should return false since the dog is not barking.
    //
    //    * shouldWakeUp (true, 8); → should return false, since it's not before 8.
    //
    //    * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
    public static void main(String[] args) {
        System.out.println(shouldwakeUp(true, 1));
        System.out.println(shouldwakeUp(false, 2));
        System.out.println(shouldwakeUp(true, 8));
        System.out.println(shouldwakeUp(true, -1));
        System.out.println(shouldwakeUp(true, 24));
    }//main

    public static boolean shouldwakeUp(boolean braking, int hourofDay) {
        // !false = true // barking == false
        if (!braking || hourofDay < 0 || hourofDay > 23) {
            // if a dog not barking
            return false;
        } else if (hourofDay < 8 || hourofDay > 22) {
            return true;
        } else {
            return false;
        }
    }

}
