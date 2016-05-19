package ioplay;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


/**
 * Created by vlad on 15.02.16.
 */
public class app4 {

    // from charArray to file
    //
    // from file to CharArray
    //




    public static void CharArrayToFile(char [] chars, String fileName ) throws IOException
    {

        Reader reader = new CharArrayReader(chars);
        FileWriter writer = new FileWriter(fileName);
        int ch;
//        while((ch = reader.read())!=-1)
//        {
//            //System.out.print((char)ch);
//            //writer.write((char)ch);
//            writer.write(ch);
//        }

        writer.write(chars);
        writer.flush();
        writer.close();
    }



    public static char[] FromFileToCharArray(String name) throws IOException
    {
         Reader reader = new FileReader(name);
         CharArrayWriter arrayWriter = new CharArrayWriter();


        int ch;
        while ((ch = reader.read())!=-1)
        {
            arrayWriter.write(ch);
        }
     reader.close();

        return arrayWriter.toCharArray();

    }








//
//    public static void main(String[] args) throws IOException {
//        char [] Chars = new char[] {'H','e','l','l','o',' ', 'W','o','r','l','d'};
//        //   CharArrayToFile(Chars,"/tmp/test1.txt");
//
//        System.out.println(FromFileToCharArray("/tmp/test1.txt"));
//
//
//    }


//    public static void main(String[] args) throws IOException {
//
//        DataOutputStream outputStream = new DataOutputStream(
//                new GZIPOutputStream(
//                        new BufferedOutputStream(
//                                new FileOutputStream(
//                                        new File("/tmp/test3.txt")))));
//
//        for (int i=0; i<10000; i++ )
//        {
//            outputStream.writeDouble(129.931D);
//        }
//     outputStream.flush();
//        outputStream.close();
//
//
//
//       DataInputStream inputStream= new DataInputStream(
//                                        new GZIPInputStream(
//                                                new BufferedInputStream(
//                                                        new FileInputStream(
//                                                                new File("/tmp/test3.txt"))), 256));
//        double d ;
//        for (int i=0; i<10000; i++)
//           {
//               d=  inputStream.readDouble();
//               System.out.println(d);
//
//           }
//



//    }


}
