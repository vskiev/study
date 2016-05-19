package test.threadUtils;

/**
 * Created by vlad on 07.04.16.
 */
public class ProduserConsumer {


//private static class Queue_lifo<T>
// {
//  private static int counter=0;
//
//  private int qDefaultSize = 1024;
//
//     private  T [] array;
//
//     private  T [] getArray() throws ClassCastException
//      {
//        return (T[]) new Object[qDefaultSize];
//
//        }
//
//     private  T [] getArray(int size) throws ClassCastException
//     {
//
//         return (T[]) new Object[size];
//
//     }
//
//
//     Queue_lifo(int size)
//     {
//       array = getArray(size);
//     }
//
//
//     Queue_lifo()
//     {
//      array = getArray();
//     }
//
//
//     public void put(T item)
//     {
//
//         array[counter++] = item;
//     }
//
////     public void put(T [] items)
////     {
////
////     }
//
//
//     public T get()
//     {
//
//        T item = array[counter-1];
//         counter--;
//         return item;
//
//     }
//
//
//
// }
//
//
//
//private static class Queue_FiFo<T>
//{
//  T type;
//
//   Queue_FiFo()
//   {
//
//   }
//
//}
//



//    public static void main(String[] args) {
//
//        Queue_lifo<Integer> item = new Queue_lifo<>();
//
//        item.put(1);
//        item.put(2);
//        item.put(3);
//
//        System.out.println(item.get());
//        System.out.println(item.get());
//        System.out.println(item.get());
//
//    }


//    public static void main(String[] args) {
//        SingleElementBuffer buffer = new SingleElementBuffer();
//        new Thread(new Consumer(buffer)).start();
//        new Thread(new Consumer(buffer)).start();
//
//        new Thread(new Produser(1,100,buffer)).start();
//        new Thread(new Produser(100,100,buffer)).start();
//    }
//

}


class SingleElementBuffer
{

    private Integer element=null;

    public synchronized void put(Integer element) throws InterruptedException {
        while (this.element!=null) {
            this.wait();
        }
        this.element =element;
        this.notifyAll();

    }


    public synchronized int get() throws InterruptedException
    {
        while(element==null)
        {
            this.wait();
        }

        Integer result = this.element;
        this.element = null;
        this.notifyAll();
        return result;
    }

};

class Produser implements Runnable
{
  private int startValue;
  private  int period;
  private SingleElementBuffer buffer;


    Produser(int StartValue, int Period, SingleElementBuffer buffer)
    {
      this.startValue = startValue;
      this.period= Period;
      this.buffer=buffer;

    }

    @Override
    public void run() {

        while (true) {

            try {
                System.out.println("produced value : " + startValue);
                buffer.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                e.printStackTrace();
              break;
            }
        }

    }

};


class Consumer implements Runnable
{
    private final SingleElementBuffer buffer;

    Consumer(SingleElementBuffer buffer)
    {
        this.buffer=buffer;
    }

    @Override
    public void run() {


        while (true)
        {

            Integer value = null;
            try {
                value = buffer.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("element consumed : "+value);

        }

    }
};

