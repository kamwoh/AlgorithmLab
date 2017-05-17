
package lab4;

import java.math.BigInteger;
import java.util.Random;
public class L4Q1 {
    public static void main(String args[])
        {
            BigInteger n = new BigInteger(16, new Random(){});
            BigInteger m = new BigInteger("65535");//2^16

            for(int i=0; i<5; i++)
            {
                System.out.print(n+", ");
                BigInteger a = new BigInteger(16, new Random(){});
                BigInteger b = new BigInteger(16, new Random(){});
                n = ((n.multiply(a)).add(b)).mod(m);
            }
            System.out.println("... ");
        }
}
