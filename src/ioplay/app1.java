package ioplay;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

/**
 * Created by vlad on 11.02.16.
 */
public class app1 {

  private static void copy(InputStream src, OutputStream dst) throws IOException
    {
       while (true)
       {
           int element = src.read();
             if(element !=-1)
             {
                 dst.write(element);
             }else
             {
                 break;
             }
       }


    }

//    public static void main(String[] args) throws MalformedURLException,IOException {
//        URL url = new URL("http://www.google.com/");
//        InputStream inputStream =  url.openStream();
//        ByteArrayOutputStream buff = new ByteArrayOutputStream();
//
//
//        copy(inputStream, buff);
//
//
//
//        byte [] rawdate = buff.toByteArray();
//        String html = new String(rawdate,"ascii");
//        System.out.println(html);
//    }

}
