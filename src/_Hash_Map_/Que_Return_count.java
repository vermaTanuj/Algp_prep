package _Hash_Map_;

import java.util.Arrays;
import java.util.HashMap;

public class Que_Return_count {
    public static void main(String[] args) {

        //////////////////////////////////////////////////////////////////
        {
            // Find count of b in a
            int a[] = {2, 3, 6, 8, 2, 8, 2, 3, 8, 10, 6};
            int b[] = {2, 8, 3, 5};
            int c[] = {};

            //Broot force aproch:-
            printCount(a, b);

            //Frequency array  Aproch:-
         //   printCount_Frequency_Aproch(a,b);

            //Optimised Aproch:-
            printCount_HashMap_Aproch(a,b);

        }
      ////////////////////////////////////////////////////////////////////////////
    }
/////////////////////////////////////////////////////////////////////////////////////////////////
    //Print count:-
    public static void printCount(int []a,int []b){
        if(a.length!=0 && b.length !=0) {
            for (int i = 0; i < b.length; i++) {
                int t = b[i];
                System.out.println(t + " is present in array :-  " + returnCount(a, t));
            }
        }
        else {
            System.out.println("Empty array");
        }
    }

    public static int returnCount(int a[],int t){
       int c=0;
       for(int i=0;i<a.length;i++){
           if(a[i]==t){
               c++;
           }
       }
       return c;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////  Frequency Array Aproch:- ////////////////////////
    public static void printCount_Frequency_Aproch(int []a,int []b){
        Arrays.sort(a);
        int max=a[a.length-1];
        int length=a.length;

        //Making frequency array:-
        int freq[];
        if(max>length){
             freq=new int [max+5];
        }
        else{
             freq=new int [length+5];
        }
//Filling frequency array:-
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }

        //Searching in frequency array:-
        for (int i=0;i< b.length;i++){
            int v=freq[b[i]];
            System.out.println(b[i] +" is present :-  "+v);
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////// Hash Map Aproach:- //////////////////////////////////
    public static void  printCount_HashMap_Aproch(int []a,int []b){

        HashMap<Integer,Integer> hm=new HashMap<>();

        //Filling hash map with values:-
        for(int i=0;i<a.length;i++){
            if( hm.containsKey(a[i])==true ){
              int temp=hm.get(a[i]);
               hm.put(a[i],temp+1);
            }
            else{
                hm.put(a[i],1);
            }
        }

        //Checking in hash map for values:-
        for (int i=0;i< b.length;i++){
            if(hm.containsKey(a[i])==true){
                System.out.println(b[i]+"  is present in array:- "+ hm.get(b[i]));
            }
            else {
                System.out.println( b[i]+" is present in array:- "+" 0");
            }
        }

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
