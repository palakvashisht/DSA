package StriversAtoZDSACourse.Arrays;

public class PascalsTriangle {
    public static int findElement(int row, int column){
        int r = row-1;
        int c = column-1;
        int element = 1;

        for(int i = 0 ; i < c ; i++){
            element = element * (r - i);
            element = element/(i + 1);
        }
        return element;
    }

    public static void printTheRow(int n){
        for(int c = 1; c <= n; c++){
            System.out.println(findElement(n,c));
        }
    }

    public static void printTheRowOptimised(int n){
        int ans = 1;
        System.out.print(ans);
        for(int i = 1; i < n; i++){
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(ans);
        }
    }

    public static void printThePascalTriangle(int n){
        for(int i = 1; i < n ; i++) {
            printTheRowOptimised(i);
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
     //   System.out.println("Element is : "+findElement(5,3));
     //   printTheRowOptimised(6);
        printThePascalTriangle(6);
    }
}
