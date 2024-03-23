package _Hash_Map_;

import java.util.HashMap;

public class First_unique_element_in_array {
    public static void main(String[] args) {

////////////////////////////////////////////////////////////
   //     return the first non repeating element
        int a[]={1,2,3,1,2,5};
        int b[]={5,4,4,3,6,7,5,6};
        System.out.println(firstUnique(b));
/////////////////////////////////////////////////////////////////

    }

    //////////////////////////////////////////////////////////////////////////////////////
    public static int firstUnique(int []a){
        HashMap<Integer,Integer >hm=new HashMap<>();

        //Filling the hashMap:-
        for (int i=0;i< a.length;i++){
            if(hm.containsKey(a[i])==true){
               int t=hm.get(a[i]);
               hm.put(a[i],t+1);
            }
            else{
               hm.put(a[i],1);
            }
        }
        System.out.println(hm);

        //Checking the HashMap:-
        for(int i=0;i<a.length;i++){
            if(hm.get(a[i])==1){
                return a[i];
            }
        }
       return -1;
    }
//////////////////////////////////////////////////////////////////////////////////
}
