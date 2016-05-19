package ioplay;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by vlad on 11.02.16.
 */
public class app3 {

  private static void copy(InputStream src, OutputStream dst) throws IOException {
      int count=0;

      byte [] buffer = new byte[1024];

      while ((count=(src.read(buffer)))!=-1)
      {
          dst.write(buffer,0,count);
      }





  }



    public static void main(String[] args) {





    }
}
