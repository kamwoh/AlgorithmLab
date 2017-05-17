
package atur;

import java.util.Scanner;


public class Q8 {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       long n = read.nextLong();
       long m = read.nextLong();
       long top = 0;
       long bird = 1;
       top += n;
       while (top > 0) {
           if (top < n) {
               top += m;
               if (top > n) {
                   top = n;
               }
           }
           top -= bird;
           bird++;
       }
        System.out.println(bird-1);
    }
}
