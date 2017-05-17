
package lab10;

import java.math.BigInteger;
import java.util.HashMap;


public class L10Q1 {

    public static void main(String[] args) {
        System.out.println("number");
        HashMap<Integer, BigInteger> memoized = new HashMap<>();
        long before1 = System.currentTimeMillis();
        System.out.println(fibonacci(220, memoized));
        long after1 = System.currentTimeMillis()-before1;
        long before2 = System.currentTimeMillis();
        System.out.println(fibonacci(500, memoized));
        long after2 = System.currentTimeMillis()-before2;
        long before3 = System.currentTimeMillis();
        System.out.println(fibonacci(1000, memoized));
        long after3 = System.currentTimeMillis()-before3;
        System.out.println("Time taken for fib(220): "+after1);
        System.out.println("Time taken for fib(500): "+after2);
        System.out.println("Time taken for fib(1000): "+after3);
    }
    
    public static BigInteger fibonacci(int n, HashMap<Integer, BigInteger> memoized) {
        if(memoized.containsKey(n)) {
            return memoized.get(n);
        }
        if (n <= 0) {
            return BigInteger.ZERO;
        }
        if (n <= 2) {
            return BigInteger.ONE;
        } else {
            BigInteger fib = fibonacci(n-1, memoized).add(fibonacci(n-2, memoized));
//            System.out.println("Fibonacci "+fib);
            memoized.put(n, fib);
            return fib;
        }
    }
    
}
