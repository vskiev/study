package test.objectCloning;

/**
 * Created by vlad on 11.05.16.
 */
public class ConstructorOfcopy {


   static class myLibeObject
    {
        int age;
        String name;

        @Override
        public String toString() {
            return "myLibeObject{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        myLibeObject(int age, String name)
        {
           this.age=age;
            this.name=name;
        }

        myLibeObject(myLibeObject obj)
        {
            this(obj.age,obj.name);
        }



    }





    public static void main(String[] args) {


        myLibeObject cat = new myLibeObject(2,"vaska");
        System.out.println(cat.toString());

        myLibeObject cat_clone = new myLibeObject(cat);
        System.out.println(cat_clone.toString());

    }

}
