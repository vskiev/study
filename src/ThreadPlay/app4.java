package ThreadPlay;

/**
 * Created by vlad on 06.04.16.
 */
public class app4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();

        Object ref0 = new Object();
        Object ref1 = new Object();

        synchronized (ref0)
        {
            synchronized (ref1)
            {
              ref0.notify();
              ref1.notify();
            }

        }



    }


}
