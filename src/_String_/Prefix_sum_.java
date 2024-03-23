package _String_;

import java.util.Arrays;


public class Prefix_sum_ {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(prefixSum(a)));
        System.out.println(Arrays.toString(prefixSumInPlace(a)));
        int y[] = {-2, 0, 3, -5, 2, -1};
        System.out.println(prefixSum__Que(y, 0, 2));

        int[][] k = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
       // print2D(k);
        //preFixSum2D(k);
        preFixSum2DArray(k);
    }

    //prefix sum:-
    public static int[] prefixSum(int[] a) {
        int b[] = new int[a.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            b[i] = sum;
        }
        return b;
    }

    //prefix sum in place:-
    public static int[] prefixSumInPlace(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            a[i] = sum;
        }
        return a;
    }

    //Chat Gpt Aproch:_
    public static int prefixSum__Que(int[] a, int l, int r) {
        int rr = 0;
        int sum = 0;
        int pre[] = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            pre[i + 1] = sum;
        }
        System.out.println(Arrays.toString(a));
        rr = a[r + 1] - a[l];
        return rr;

    }

    //Algo prep Aproch:-
    public static int prefixSum__Que__(int[] a, int l, int r) {

        int sum = 0;
        int pre[] = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            pre[i + 1] = sum;
        }
        System.out.println(Arrays.toString(a));
        if (l <= 0) {
            //0 sa 4 tak ka sum p[4] he hoga
            return pre[r];
        } else {
            //normal case :- jo nhi chiya woo hatta do
            return pre[r] - pre[l - 1];
        }
    }


    //Print 2D array:-
    public static void print2D(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //inplace Prefix Sum 2DArray:-
    public static void preFixSum2D(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
                a[i][j] = sum;
            }
            System.out.println();
        }
        print2D(a);
    }


   // prefix sum 2D Aproch:-
    //  1> Row wise prefix sum of individual 1D array of  2D
    //  2> Collumn wise prefix sum individual 1D array of  2D
    //  3> Both in place;

    //Collumn wise predix sum:-

    public static void preSumOnColumn_(int a[][]) {
        for (int j = 0; j < a[0].length; j++) { // Iterate over columns
            int sum = 0;
            for (int i = 0; i < a.length; i++) { // Iterate over rows
                sum += a[i][j];
                a[i][j] = sum;
            }
        }}


    public static void preFixSum2DArray(int a[][]){
       // int pre[][]=new int [a.length][a[0].length];
        System.out.println("preFixSum2DArray:-");
        print2D(a);

        //1> Row wise prefix sum of individual 1D array of  2D
        for(int i=0;i<a.length;i++){
            prefixSumInPlace(a[i]);
        }
        System.out.println("Row wise:-");
        print2D(a);


        //2> column wise prefix sum of individual 1D array of  2D
        preSumOnColumn_(a);
        System.out.println("collumn wise:-");
        print2D(a);


    }





}