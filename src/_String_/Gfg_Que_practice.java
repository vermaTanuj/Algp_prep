package _String_;

import java.util.Arrays;

public class Gfg_Que_practice {
    public static void main(String[] args) {
        int [][] a = {{1, 2, 3, 4},
                      {5, 6, 0, 7},
                      {8, 9, 4, 6},
                      {8, 4, 5, 2}};
        int[][] m = {{0, 17, 9, 9, 13},
                {18, 1, 15, 2, 3},
                {4, 10, 19, 6, 0}};
        print2D(m);
        System.out.println("modify:-");
        MakeZeros(m);

    }
    public static void  MakeZeros(int[][] a)
    {
        int temp[][]=new int[a.length][a[0].length];
        for (int i=0;i< a.length;i++){
            for(int j=0;j<a[0].length;j++){
                temp[i][j]=a[i][j];
            }
        }
        // code here
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(temp[i][j]==0){
                    //elenent zero encountered:-

                    int sum=0;
                    if(i+1<a.length){
                        sum=sum+a[i+1][j];
                        a[i+1][j]=0;
                    }
                    if(i-1>=0){
                        sum=sum+a[i-1][j];
                        a[i-1][j]=0;
                    }
                    if(j+1<a[0].length){
                        sum=sum+a[i][j+1];
                        a[i][j+1]=0;
                    }
                    if(j-1>=0){
                        sum=sum+a[i][j-1];
                        a[i][j-1]=0;
                    }
                    System.out.println("sum:- "+sum);
                    a[i][j]=sum;

                }
            }
        }

        print2D(a);
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
