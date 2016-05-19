package ioplay;

import javax.print.DocFlavor;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by vlad on 11.02.16.
 */
public class app2 {


    private static void copy(InputStream src, OutputStream dst) throws IOException {

        while (true)
        {
            int element = src.read();
              if(element!= -1)
            {
              dst.write(element);
            }else
              {
                  break;
              }

        }
    }



//    public static void main(String[] args) throws MalformedURLException,IOException {
//
//        URL url = new URL("http://www.google.com");
//        InputStream inputStream = url.openStream();
//        OutputStream outputStream = new FileOutputStream(new File("/tmp/google.html"));
//
//        copy(inputStream,outputStream);
//
//
//
//
//    }
}
