package lab10;

import java.math.BigInteger;
import java.util.HashMap;

public class L10Q2 {

    public static void main(String[] args) {
        System.out.println("number");
        HashMap<Integer, BigInteger> tabular = new HashMap<>();
        tabular.put(0, BigInteger.ZERO);
        tabular.put(1, BigInteger.ONE);
        long before1 = System.currentTimeMillis();
        System.out.println(fib(220, tabular));
        long after1 = System.currentTimeMillis()-before1;
        long before2 = System.currentTimeMillis();
        System.out.println(fib(500, tabular));
        long after2 = System.currentTimeMillis()-before2;
        long before3 = System.currentTimeMillis();
        System.out.println(fib(1000, tabular));
        long after3 = System.currentTimeMillis()-before3;
        System.out.println("Time taken for fib(220): "+after1);
        System.out.println("Time taken for fib(500): "+after2);
        System.out.println("Time taken for fib(1000): "+after3);
    }

    public static BigInteger fib(int n, HashMap<Integer, BigInteger> tabular) {
        if (tabular.containsKey(n))
            return tabular.get(n);
        
        for (int k = 2; k < n + 1; k++) {
            BigInteger f = fib(k - 1, tabular).add(fib(k - 2, tabular));
            tabular.put(k, f);
        }
        
        return tabular.get(n);
    }

    public static BigInteger fibDP(int x) {
        BigInteger fib[] = new BigInteger[x + 1];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        for (int i = 2; i < x + 1; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        return fib[x];
    }
}
