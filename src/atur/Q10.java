package atur;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int q = read.nextInt();
        for (int i = 0; i < q; i++) {
            int a = read.nextInt();
            int b = read.nextInt();
            System.out.println(getAnswer(a, b));
        }
    }
    
    public static String getAnswer(int _a, int _b) {
        int a = Math.min(_a, _b);
        int b = Math.max(_a, _b);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (a%2==1) {
            list.add(a+1);
            list.add(a+2);
        } else {
            list.add(a+2);
        }
        for(int nextB: list) {
            if (nextB==b) {
                return "YES";
            }
        }
        return "NO";
    }
}
