package ThreadPlay;

/**
 * Created by vskie on 22.03.2016.
 */
public class threadPlaypriority {
    private static volatile boolean stop = false;



//    public static void main(String[] args) {
//
// Thread [] threads = new Thread[64];
//
//        for (int i = 0; i <threads.length ; i++) {
//
//            threads[i] = new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                        for (long j = 0; j < 100_000_000_000_000_000L; j++) {
//                            if(stop) {
//                            System.out.println("ticking counter ---> "+j);
//                                break;
//                        }
//                       }
//                    }
//            });
//
//        }
//
////        for (int i = 0; i <threads.length ; i++) {
////
////           int priority = threads[i].getPriority();
////            if(priority>5) {threads[i].setPriority(Thread.MAX_PRIORITY);}
////               else
////            {
////                threads[i].setPriority(1);
////            }
////
////
////        }
//
//
//        for (int i = 0; i <threads.length ; i++) {
//            threads[i].start();
//        }
//
//
//        try {
//            Thread.sleep(1000);
//            stop=true;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }

}
