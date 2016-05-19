package test.threadUtils.prodCons;

/**
 * Created by vlad on 22.04.16.
 */
public class ProduserConsumerMy2 {




//    public static void main(String[] args) {
//
//        SingleElementBuffer seb = new SingleElementBuffer();
//        new Consumer(seb).start();
//        new Consumer(seb).start();
//        new Consumer(seb).start();
//        new Producer(seb,1,100).start();
//        new Producer(seb,100,1000).start();
//        new Producer(seb,1000,10000).start();
//
//    }

}


class SingleElementBuffer
{

    private Integer value = null;


    public synchronized int get() throws InterruptedException {


        while (value == null) {
            this.wait();
            }

            Integer result = this.value;
            this.value =null;
            this.notifyAll();
            return result;



        }



    public synchronized void put(int number) throws InterruptedException {

        while(true)
        {
            if(value==null)
            {
                value = number;
                notifyAll();
                break;
            }else
            {
                this.wait();
            }

        }

    }

}

class Consumer extends Thread
{
    SingleElementBuffer tmp=null;

    @Override
    public void run() {

        try {
            while (true){

                System.out.println("consumed value:" + tmp.get());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    Consumer(SingleElementBuffer singleElementBuffer)
    {
        tmp=singleElementBuffer;
    }


};


class Producer extends Thread
{
    int startValue;
    int endValue;
    SingleElementBuffer tmp=null;

    @Override
    public void run() {
        for (int i = startValue; i <endValue ; i++) {
            try {
                System.out.println("produced value: "+ i);
                tmp.put(i);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    Producer(SingleElementBuffer singleElementBuffer, int startValue, int endValue)
    {
        tmp=singleElementBuffer;
        this.startValue =startValue;
        this.endValue = endValue;

    }

};
