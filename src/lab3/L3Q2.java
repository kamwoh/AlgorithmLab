package lab3;

public class L3Q2 {

    public static void main(String[] args)
    {
        int a = 3;
        int b = 4;
        int result = power(a, b);
        System.out.println(a + " pow " + b + " = " + result);
    }

    public static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }
}
