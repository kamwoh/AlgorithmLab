package atur;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        String s;
        int t = read.nextInt();
        ArrayList<Integer[]> jobs = new ArrayList<Integer[]>();
        for (int c = 0; c < t; c++) {
            while ((s = readString.nextLine()).equals("")) {
            }
            int n = Integer.parseInt(s);
            int totalTime = 0;
            for (int i = 1; i <= n; i++) {
                String[] input = readString.nextLine().split(" ");
                int completionTime = Integer.parseInt(input[0]);
                int fine = Integer.parseInt(input[1]);
                totalTime += completionTime;
                jobs.add(new Integer[]{completionTime, fine});
            }
            
            
            System.out.println("");
        }
    }
}
