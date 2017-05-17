
package atur;

import java.util.Scanner;


public class Q12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for(int i=0;i<t;i++){
            int n = read.nextInt();
            System.out.println(getAnswer(n));
        }
    }
    
    public static int getAnswer(int n) {
        int total = 0;
        for(int i=1;i<=n;i++){
            String binary = Integer.toBinaryString(i).replaceAll("0", "");
            total += binary.length();
        }
        return total;
    }
    
}
