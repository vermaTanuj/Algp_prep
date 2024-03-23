package _Hash_Map_;

import java.util.HashMap;
import java.util.HashSet;

public class _2_Sum {
    public static void main(String[] args) {
        int a[]={8,9,1,-2,4,5,10,6,7,5};
        System.out.println(_2_Sum(a,11));
        int k[]={8,9,3,1,-2,4,5,11,-6,7,7};
        System.out.println(_2_Sum_Hash_set(k,11));
        System.out.println(_2_Sum_Hash_set(k,-4));
    }

    ///////  2 sum broot force ////////////////////////////////////////////
    public static boolean _2_Sum(int a[], int k){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
///////////////////////////////////////////////////////////////////////////////////////////////

    ///////////// Hash set /////////////////////////////
    public static boolean _2_Sum_Hash_set(int []a,int k){

        HashMap<Integer,Integer>hm=new HashMap<>();

        //Filling HashMap:-
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])==true){
              int temp=hm.get(a[i]);
              hm.put(a[i],temp+1);
            }else{
                hm.put(a[i],1);
            }
        }
        System.out.println(hm);

        //Checking:-
        for(int i=0;i<a.length;i++){
            int f=a[i];
            int b=k-f;

          if(f!=b && hm.containsKey(b)==true){
              return true;
          }
           if(f==b && hm.containsKey(b)==true && hm.get(b)>1){
              return true;
            }
        }

        return false;
    }

}
