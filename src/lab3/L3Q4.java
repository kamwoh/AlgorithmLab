
package lab3;

public class L3Q4 {
    public static void main(String[] args) {
        int a[][] = { {1, 1, 1, 1},
                    {2, 2, 2, 2},
                    {3, 3, 3, 3},
                    {4, 4, 4, 4}};
 
        int b[][] = { {1, 1, 1, 1},
                    {2, 2, 2, 2},
                    {3, 3, 3, 3},
                    {4, 4, 4, 4}};
        
        int c[][] = new int [a.length][a[0].length];
        multiply(a,b,c);
        System.out.println("Matrix A  : ");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix B  : ");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix A x Matrix B : ");
        
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void multiply(int a[][], int b[][], int c[][]){
        int n = a[0].length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++){
                c[i][j] = 0;
                for (int k = 0; k < n; k++)
                    c[i][j] += a[i][k]*b[k][j];
            }
    }
}
