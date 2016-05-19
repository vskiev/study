package ioplay;

import java.io.*;

/**
 * Created by vlad on 18.02.16.
 */
public class app5 {

static class Log extends OutputStream
{

  private final OutputStream out;


    Log(OutputStream out)
    {
        this.out = out;

    }


    @Override
    public void write(int b) throws IOException {
        out.write(b);
        System.out.println("log write 1");
    }

    @Override
    public void write(byte[] b) throws IOException {
        System.out.println("b length  "+ b.length);
        out.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        System.out.println("log " + len);
        out.write(b, off, len);
    }
}



//    public static void main(String[] args) throws IOException {
//
//
//        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new Log(new FileOutputStream(new File("/tmp/tmp.txt")))));
//
//        for (int i = 0; i <100 ; i++) {
//            dos.writeDouble(123.456D);
//        }
//
//
//        dos.flush();
//        dos.close();
//
//    }
}
