package ioplay;

import java.io.*;
import java.util.Arrays;
import java.util.Date;


/**
 * Created by vskie on 10.03.2016.
 */
//public class app9 {
//


//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//        ByteArrayOutputStream buff = new ByteArrayOutputStream();
//        ObjectOutput oos =new ObjectOutputStream(buff);
//        oos.writeObject(new test());
//
//
//
// //raw data plased to heap
//      byte [] rawData = buff.toByteArray();
//
//      ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(rawData));
//      test s = (test) in.readObject();
//        System.out.println(s.name);
//
//
//     }
//}
//
//class test implements Serializable
//{
//    String name = "some Name";
//}
//
//
//
//class Persons implements Serializable
//{
//    private String Name;
//    private String SecondName;
//    private int age;
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getSecondName() {
//        return SecondName;
//    }
//
//    public void setSecondName(String secondName) {
//        SecondName = secondName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    Persons (String name, String SecondName, int age)
//    {
//        this.Name = name;
//        this.SecondName = SecondName;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "Name='" + Name + '\'' +
//                ", SecondName='" + SecondName + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
