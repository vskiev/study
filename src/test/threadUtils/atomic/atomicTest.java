package test.threadUtils.atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by vlad on 27.04.16.
 */
public class atomicTest {

//    public static void main(String[] args) {
//        Market market  = new Market(new AtomicLong(100));
//        market.start();
//
//        for (int i = 0; i <39 ; i++) {
//            new Broker(market).start();
//        }
//
////       while (true) {
////           System.out.println(market.getIndex());
////       }
//    }


}



class Market extends Thread
{
    AtomicLong index;

    public AtomicLong getIndex() {
        return index;
    }

    @Override
    public void run()
    {
        Random random = new Random();

        while (true)
        {
            index.addAndGet(random.nextInt(10));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            index.addAndGet(-1*random.nextInt(10));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public Market(AtomicLong index)
    {
        this.index = index;
    }
}


class Broker extends Thread
{
    Market market;

    public Broker(Market market)
    {
        this.market= market;


    }

    @Override
    public void run() {
        while (true)
            System.out.println("current index market: " + market.getIndex());

    }
    }



