package _Hash_Map_;

import java.util.HashMap;

public class Lec_14__Algoprep {
    public static void main(String[] args) {

        HashMap<Integer,Integer>hm=new HashMap<>();

        //to add:-
        hm.put(10,50);
        hm.put(20,60);
        hm.put(30,60);

        //To get the values:-
        System.out.println(hm.get(10));
        System.out.println(hm.get(40));

        //Contaning in HashMap:-
        System.out.println(hm.containsKey(20));
        System.out.println(hm.containsKey(40));

        // Remove from HashMap:-
        hm.remove(10);
        System.out.println(hm.get(10));   //:-null

/////////////////////////  Iterating in Hash map:-  ////////////////


        System.out.println("Itterating in hash map:- ");
        HashMap<Integer,Integer>aa=new HashMap<>();
        for(int i=0;i<100;i++){
            aa.put(i,i);
        }
        for(int i=0;i<100;i++){
            System.out.print( aa.get(i)+" ");
        }
        System.out.println();
////////////////////////    To print hash map:- /////////////////////////
        System.out.println(aa);
        System.out.println(hm);
/////////////////////////////////////Itterating using keyset:- //////////////////
        for(int val:aa.keySet()){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println(aa);



        ///////////////////////////////////////////////////////////////////////////
        hm.size(); //  :- Gives the size of the HashMap;
    }
}
