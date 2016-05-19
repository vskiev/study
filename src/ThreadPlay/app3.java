package ThreadPlay;

/**
 * Created by vskie on 22.03.2016.
 */
public class app3 {
    private static int N = 100_000_000;
    private static int counter = 0;

    private static synchronized void inc()
    {
        counter++;
    }


//    public static void main(String[] args) {
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                for (int i = 0; i <N ; i++) {
//                    inc();
//                }
//
//            }
//        }).start();



//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                for (int i = 0; i <N ; i++) {
//                    inc();
//                }
//
//            }
//        }).start();
//
//        System.out.println(counter);
//
//
//    }
//


}
