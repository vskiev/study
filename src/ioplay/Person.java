package ioplay;

import java.util.Arrays;

/**
 * Created by vlad on 22.02.16.
 */
public class Person {


  public enum Sex
   {
       F, M
   }

   private String Name;
   private int Age;
   protected Sex [] sex;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Sex [] getSex() {
        return sex;
    }

    public void setSex(Sex [] sex) {
        this.sex = sex;
    }

    public Person(String name, int age, Sex [] sex) {
        Name = name;
        Age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", sex=" + Arrays.toString(sex) +
                '}';
    }
}




