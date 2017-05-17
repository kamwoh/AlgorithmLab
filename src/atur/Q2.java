package atur;

import java.util.Scanner;
import java.util.Stack;

public class Q2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        Stack<Character> stack = new Stack<Character>();
        int consequenceCount = 0;
        boolean skip = false;
        boolean isEO = false;
        boolean isAIUY = false;
        stack.push(s.charAt(0));
        char peekChar;
        for (int i = 1; i < s.length(); i++) {
            peekChar = stack.peek();
            char charAt = s.charAt(i);
            peekChar = Character.toLowerCase(peekChar);
            charAt = Character.toLowerCase(charAt);
            if (charAt == peekChar) {
                consequenceCount++;
                stack.push(s.charAt(i));
                if (consequenceCount >= 1) {
                    if (peekChar == 'e' || peekChar == 'o')
                        isEO = true;
                    if (peekChar == 'a' || peekChar == 'i' || peekChar == 'u' || peekChar == 'y')
                        isAIUY = true;
                    skip = true;
                }
            } else {
                if (skip) {
                    if (isEO || isAIUY) {
                        for (int count = consequenceCount; count > 0; count--) {
                            stack.pop();
                        }
                        if (consequenceCount == 1 && isEO) {
                            stack.push(stack.peek());
                        }
                    }
                }
                consequenceCount = 0;
                isAIUY = false;
                isEO = false;
                skip = false;
                stack.push(s.charAt(i));
            }
        }
        if (skip) {
            if (isEO || isAIUY) {
                for (int count = consequenceCount; count > 0; count--) {
                    stack.pop();
                }
                if (consequenceCount == 1 && isEO) {
                    stack.push(stack.peek());
                }
            }
        }
        Stack<Character> print = new Stack<Character>();
        while (!stack.isEmpty()) {
            print.push(stack.pop());
        }
        while (!print.isEmpty()) {
            System.out.print(print.pop());
        }
        System.out.print("\n");
    }
}
