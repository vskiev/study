package static_play;

/**
 * Created by vlad on 21.01.16.
 */
public class StaticRunner {




//
//    public static void main(String [] args) {
//
//        vehicle v = new car();
//        v.someMethod(10);
//        System.out.println();
//    }



}

class vehicle
{
    public static void someMethod(int i)
    {
        System.out.println("root method");
    }
}

class car extends vehicle
{
    public static void someMethod(int i)
    {
        System.out.println("sub method");
    }
}