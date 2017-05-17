
package atur;

import java.util.Scanner;


public class Q9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        int c = read.nextInt();
        int[] ithHoliday = new int[c];
        for(int i=0;i<c;i++){
            ithHoliday[i] = read.nextInt();
        }
        System.out.println(getAnswer(n,k,c,ithHoliday));
    }
    
    public static int getAnswer(int n, int k, int c, int[] ithHoliday) {
        int total = 0;
        int holidayCount = 0;
        int receivedDay = 1;
        for(int day=1;day<=n;day++) {
            if(holidayCount < c && day==ithHoliday[holidayCount]) {
                total += 1;
                receivedDay = day + k;
                holidayCount++;
            } else if(day==receivedDay) {
                total += 1;
                receivedDay = day + k;
            }
        }
        return total;
    }
    
}
