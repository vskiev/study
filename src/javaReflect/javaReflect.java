package javaReflect;

/**
 * Created by vskie on 18.05.2016.
 */
public class javaReflect {
    public static void main(String[] args) {

        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());

        Class c = obj.getClass();
        System.out.println("class : "+c);
        System.out.println(c.hashCode());


    }

}
