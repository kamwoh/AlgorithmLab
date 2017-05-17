package lab3;

public class L3Q3 {
    public static void main(String[] args){   
        int n = 12;
        System.out.println("The " + n + "th term of fibo is " + fib(n));
    }
    public static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
