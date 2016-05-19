package ioplay;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by vlad on 22.02.16.
 */
public class EntityDataInput implements EntityInput{

    private final DataInput input;

     EntityDataInput(DataInput input)
     {
         this.input= input;
     }


    @Override
    public Person ReadPerson() throws IOException {
        String name = input.readUTF();
        int age = input.readInt();
        Person.Sex [] SexArray = new Person.Sex[input.readInt()];
        for (int i = 0; i <SexArray.length ; i++) {
            SexArray[i]= input.readBoolean() ? Person.Sex.F : Person.Sex.M;
        }


        return new Person(name,age,SexArray);
    }
}
