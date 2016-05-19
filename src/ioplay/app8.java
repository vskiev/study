package ioplay;

import java.io.*;

/**
 * Created by vlad on 23.02.16.
 */
public class app8 {

    public static void main(String[] args) throws IOException {


        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(buff);

        oos.writeObject("hello world");
        oos.flush();
        oos.close();




        byte [] rawData = buff.toByteArray();

        ByteArrayInputStream buff2 = new ByteArrayInputStream(rawData);
        ObjectInputStream ois = new ObjectInputStream(buff2);
        try {
            String s = (String) ois.readObject();
            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
