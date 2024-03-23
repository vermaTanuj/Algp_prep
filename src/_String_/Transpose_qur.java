package _String_;

import java.util.Arrays;

public class Transpose_qur {
    public static void main(String[] args) {


      int   ax[][] = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
print2D(ax);
      rotateby90(ax);
    }
    static void rotateby90(int a[][])
    {
        // code here
        tra(a);
        callRev(a);
        System.out.println("Final:-");
        print2D(a);
    }

    //Transpose of matrix:-
    public static void tra(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[i].length;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
        System.out.println("Transpose :-");
        print2D(a);
    }

    //Collumn reversal:-
    public static void callRev(int a[][]){
        for(int j=0;j<a[0].length;j++){
            int k[]=new int[a.length];
            for(int i=0;i<a.length;i++){
                k[i]=a[i][j];
            }
            revArr(k);
        }
        System.out.println("Coll Rev:-");
        print2D(a);
    }


    //Reverse the Array:-

    public static void revArr(int a[]){
        int st=0;
        int end=a.length-1;
        while(st<end){
            int t=a[st];
            a[st]=a[end];
            a[end]=t;
            st++;
            end--;
        }
        System.out.println("Arrays REV:- "+Arrays.toString(a));
    }

    public static void print2D(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
