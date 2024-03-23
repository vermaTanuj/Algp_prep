package _String_;

import java.util.Scanner;

public class Algo_Prep_11 {
    public static void main(String[] args) {

        char c='b';
        System.out.println(c);
        System.out.println((int)c);

        char a='b';
        char h=(int)'b';
        System.out.println(a);
        System.out.println(h);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string to toggle:-" );
        String s=sc.nextLine();
        System.out.println("Toggled String :-  "+toggle(s));
        System.out.println("reverse the String :-  "+rev(s));


    }


    //Capital to Small:-
    public static String toggle(String s){
       char[] c=s.toCharArray();
       for(int i=0;i<c.length;i++){
           if(c[i]>=65 && c[i]<=90){
               c[i]=(char)(c[i]+32);
           }
           else if(c[i]>=97 && c[i]<=122){
               c[i]=(char)(c[i]-32);
           }
       }
       return String.valueOf(c);
    }

    //reverse the String:-
    public static String rev(String s){
        char []c=s.toCharArray();
        int st=0;
        int end=c.length-1;
        while(st<end){
         char t=c[st];
         c[st]=c[end];
         c[end]=t;
         st++;
         end--;
        }
        return String.valueOf(c);
    }

}
