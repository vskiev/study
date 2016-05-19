package collection.hashCode;

/**
 * Created by vskie on 17.05.2016.
 */
public class Hash {

    public static void main(String[] args) {

        Object object = new Object();
        int hashout = object.hashCode();
        System.out.println(hashout);

        Object object1 = new Object();
        int hashout2 = object1.hashCode();
        System.out.println(hashout2);


        System.out.println("by equals : "+object.equals(object1));
        System.out.println("by hashcode : " + (object.hashCode() == object1.hashCode()));

    }


}
