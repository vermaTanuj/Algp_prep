package _Hash_Map_;

import java.util.HashSet;

public class _HashSet_ {
    public static void main(String[] args) {

        // HashSet :-  Only key part of hash map;
        HashSet<Integer>hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(10);

        System.out.println(hs);

        /////////////////////////////  Contains Keys  ///////////////////
        System.out.println(   hs.contains(10));
        System.out.println(   hs.contains(90));
        ////////////////////////////////////////////////////////////////
        //Size:-
        System.out.println(hs.size());
        ///////////////////////////////////////////////////


        ////////  Find distinct element in array:- //////////////////////////////
        int a[]={4,6,7,6,5};
        System.out.println( findDistinctElement(a) );

    }

    public static int findDistinctElement(int[]a){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        return hs.size();
    }

}
