
package lab1;


public class L1Q5 {
    public static void main (String[]args){
        int n1=0;
        int n2=1;
        int n=n1+n2;
        System.out.println("Terms are " + n2 + ", ");
        for(int i=2; i<10; i++){
            System.out.println(n + ", ");
            n1=n2;
            n2=n;
            n=n1+n2;
        }
        System.out.println("Recursion method");
        System.out.println("Series up to number 10");
        for(int i=1; i<10; i++){
            System.out.println(fibo(i)+ ", ");
        }
        
              
    }
    public static int fibo(int num){ 
        if(num==0){
            return 0;
        }
        if(num == 1 || num == 2){ 
            return 1;
        } 
        return fibo(num-1) + fibo(num -2); //tail recursion 
    }
}

