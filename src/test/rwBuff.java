package test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.*;
import java.util.Arrays;


/**
 * Created by vlad on 25.02.16.
 */
public class rwBuff {

    final static String s = new String("Обвал дома в центре Киева: один из пострадавших" +
            "находится под четырехметровым завалом," +
            "судьба еще двух - неизвестна. Сегодня около 9 утра" +
            "в органы полиции поступило сообщение о том, что на" +
            " одном из городских кладбищ обнаружено тело мужчины" +
            " с огнестрельным ранением головы. Факт данного происшествия" +
            " внесен в Единый реестр досудебных расследований по признакам состава преступления," +
            " предусмотренного ч.1 ст. 115 (умышленное убийство) Уголовного кодекса Украины. " +
            "Источник: http://censor.net.ua/. Сейчас осмотр места происшествия продолжается." +
            " Устанавливаются и опрашиваются свидетели, проводится работа по сбору" +
            " вещественных доказательств.Санкция уголовной статьи предусматривает" +
            " наказание в виде лишения свободы на срок от 7 до" +
            " 15 лет. Источник: http://censor.net.ua/n376386");


    public static void bufferedRead(InputStream src/*, OutputStream dst*/) throws IOException {
        final int DEFAULT_SIZE = 1024;
        byte[] buff = new byte[DEFAULT_SIZE];

        int counter = 0;
        int aviable = src.available();
        int totalReadedBytes = 0;
        System.out.println("aviable bytes: " + aviable);


        if ((counter = (src.read(buff))) != -1) {
            //dst.write(buff,0,counter);
            System.out.println("actualy readed bytes: " + counter);
            totalReadedBytes = aviable - counter;
        }
        //System.out.print(Arrays.toString(buff));
        System.out.println("need to read " + totalReadedBytes);

    }


}

//    public static void readwithBuff(InputStream src) throws IOException {
//        int DEFAULT_BUFFER_SIZE=10;
//        OutputStream dst;
//        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
//        int count=0;
//                 while (((count=(src.read(buffer))))!=-1) {
//                     System.out.println("actual bytes read: " + count);
//                     if (count == buffer.length) {
//                         System.out.println(Arrays.toString(buffer));
//                         //put there some destination to write
//
//                     } else {
//                         for (int i = 0; i <count ; i++) {
//                             System.out.println(buffer[i]);
//                         }
//
//                     }
//                 }





              /*
              * count - count of actualy read
              * pos - position of from read
              * buffer.len - man number of read to buffer
              * */


   // }






//    public static void main(String[] args) throws IOException {
//        String superString = s+s+s+s+s+s+s+s+s+s+s+s;
//
//        byte [] arr = superString.getBytes();
//
//
//        char [] chars = s.toCharArray();
//        byte [] bytes = s.getBytes();
////        System.out.println(arr.length);
////        System.out.println(chars.length);
//
//        InputStream in = new ByteArrayInputStream(bytes);
//
//       // bufferedRead(in);
//
//
//        readwithBuff(in);
//


//
//      FileInputStream fileInputStream = new FileInputStream(new File("/tmp/bigfile.txt"));
//      DataInputStream dataInput = new DataInputStream(fileInputStream);
//
//        for (int a = 0; a <1000 ; a++) {
//           int data =  dataInput.readInt();
//            System.out.println(data);
//        }




//        FileOutputStream fos = new FileOutputStream(new File("/tmp/bigfile.txt"));
//        DataOutputStream dos = new DataOutputStream(fos);
//
//        for (int j = 0; j <1000 ; j++) {
//            dos.writeInt(j);
//        }
//        dos.flush();
//        dos.close();
//        fos.close();



//
//    }
//
//
//
//}
