package test.loging;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by vlad on 21.04.16.
 */
public class logexample {

  private static Logger log = Logger.getLogger(logexample.class.getName());


    public void someMethod()
    {
      log.info("call for method");
    }


    public void someLogiingMethod()
    {
        try
        {
            throw new Exception();
        } catch (Exception e) {
            log.log(Level.SEVERE, "Exception e" + e);
        }finally {
            log.warning("some minor message");
        }


    }





//    public static void main(String[] args) {
//      new logexample().someMethod();
//
//      new logexample().someLogiingMethod();
//
//
//
//    }

}
