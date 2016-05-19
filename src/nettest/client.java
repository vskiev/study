package nettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by vlad on 08.02.16.
 */
public class client {





  public client()
  {
      try {
          Socket clientSocket = new Socket("127.0.0.1", 8082);
          PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);
          BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
          BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        String str;
          while ((str =stdIn.readLine())!=null)
          {
           writer.println(str);
              System.out.println("echo" + reader.readLine());
          }


      } catch (IOException e) {
          e.printStackTrace();
      }
  }


//    public static void main(String[] args) {
//
//      new Thread(new Runnable() {
//          @Override
//          public void run() {
//                 new server();
//          }
//      }).start();
//
//      new client();
//    }



}
