package ThreadPlay;

/**
 * Created by vskie on 16.03.2016.
 */
public class app2 {

    static int number =0;
    static volatile boolean ready =false;


//    public static void main(String[] args) {
//
//        Thread cur = Thread.currentThread();
//        Thread t1 =  new Thread(new Th1());
//        Thread t2 =  new Thread(new Th2());
//        t1.start();
//        t2.start();
//
//        System.out.println("thread 1 is alive: "+t1.isAlive());
//        System.out.println("thread 1 is alive: "+t2.isAlive());
//        System.out.println("main thread is alive "+cur.isAlive());

//        t1.interrupt();
//        t2.interrupt();
    }

//   static class Th1 implements Runnable
//    {
//        @Override
//        public void run() {
//
//                try{
//                Thread.sleep(1000);
//
//                }catch (InterruptedException e )
//                {
//                    e.getCause();
//                }
//            number =1;
//            ready  = true;
//
//            }
//
//        }


//  static class Th2 implements Runnable
//    {
//        @Override
//        public void run() {
//           while (!ready)
//           {
//               System.out.println(number);
//           }
//
//            }
//        }

//}


