package scanerPlay;

import java.util.Scanner;

/**
 * Created by vlad on 14.01.16.
 */
public class chetNechet {



//    public static void main(String [] args)
//    {
//
////  m = 2k; чет
////  m = 2l+1;   не чет
//
//        Scanner scanner = new Scanner(System.in);
//        int tmp = Integer.parseInt(scanner.next());
//        System.out.println( isChet(tmp));
//
//
//
//    }


    private static boolean isChet(int number)
    {
        double num = number%2;
        if(num==0)
           {
               return true;
           }
          else
        {
            return false;
        }



    }
}
