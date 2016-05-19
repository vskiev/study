package test.threadUtils;

/**
 * Created by vlad on 14.04.16.
 */
public class ProduserConsumerMy {



//    public static void main(String[] args) {
//
//        holder t = new holder();
//        produser p = new produser(t,1);
//        consumer c = new consumer(t,1);
//
//        p.start();
//        c.start();
//
//
//
//    }



}


class holder
{
    private int contens;
    private boolean aviable = false;

    public synchronized void put(int value)
    {
        while (aviable == true) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

        contens = value;
        System.out.println("contens put :"+contens);
        aviable = true;
        notifyAll();
    }


    public synchronized int get()
    {
        while (aviable == false)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        aviable = false;
        System.out.println("contens get :"+ contens);
        notifyAll();
        return contens;


    }



}


class produser extends Thread
{

    holder tmp;
    int num;

    @Override
    public void run()
    {
        for (int i = 0; i <10 ; i++) {

            tmp.put(i);
            System.out.println("produser put :"+ this.num);
        }

    }



    produser(holder h, int number)
    {
        this.tmp = h;
        this.num = number;
    }



}

class consumer extends Thread
{
    holder tmp;
    int value;


    public void run()
    {
        for (int i = 0; i <10 ; i++) {
            value = tmp.get();
            System.out.println("consumer get:"+ value);
        }
    }



    consumer(holder h, int number)
    {
        this.tmp=h;
        value =number;

    }
}
