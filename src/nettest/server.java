package nettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by vlad on 08.02.16.
 */
public class server {



public server()
{
    try {
        ServerSocket s = new ServerSocket(8082);
        Socket client =  s.accept();

        PrintWriter writer =new PrintWriter(client.getOutputStream(),true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String str;
        while ((str = reader.readLine())!=null)
        {
            writer.write(str);
        }



    } catch (IOException e) {
        e.printStackTrace();
    }
}



}
