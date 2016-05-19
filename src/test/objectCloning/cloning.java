package test.objectCloning;

/**
 * Created by vlad on 11.05.16.
 */
public class cloning {
// TODO клонирование по средством переопределения метода родительского класса OBJECT
// обьект реализует интерфейс Clonable и переопределяет метод Clone c модификатором доступа public

   static class myobject implements Cloneable
    {
        String somesting;

        myobject(String sting)
        {
            somesting = sting;
        }

        @Override
        public String toString() {
            return "myobject{" +
                    "somesting='" + somesting + '\'' +
                    '}';
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }


    }





//    public static void main(String[] args) throws CloneNotSupportedException {
//
//
////        String myarray[] = new String[10];
////
////        String  [] anotherArray = myarray.clone();
//
//
//        myobject myobj = new myobject("test1");
//        System.out.println(myobj.toString());
//
//
//        myobject myobj1 =   (myobject)myobj.clone();
//        System.out.println(myobj1.toString());
//
//
//        myobj.somesting = "test2";
//        System.out.println(myobj.toString());
//
//        System.out.println(myobj1.toString());
//
//
//
//
//
//    }
}
