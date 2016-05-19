package ioplay;

import java.io.*;

/**
 * Created by vlad on 22.02.16.
 */
public class EntityDataOutput implements EntityOutput {

    private final DataOutput output;


   public EntityDataOutput(DataOutput outputStream)
    {
        this.output = outputStream;
    }

   public void writePersone(Person persone)
    {
        try {
            output.writeUTF(persone.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            output.writeInt(persone.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            output.writeInt(persone.getSex().length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Person.Sex sex : persone.getSex())
        {
            try {
                output.writeBoolean(sex == Person.Sex.F);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
