package _Hash_Map_;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class Gfg_Que_ {
    public static void main(String[] args) {

        //Problem link:-https://www.geeksforgeeks.org/problems/max-distance-between-same-elements/1?utm_source=youtube&utm_medium=collab_codein10_description&utm_campaign=max-distance-between-same-elements

         int a[]={1 ,1 ,2 ,2 ,2 ,1};
         int b[]={1};
        System.out.println(maxDistance(b));
    }



   public static int maxDistance(int a[])
    {
        // Your code here
        int ans[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            int t=a[i];
            //BackSearch
            ans[i]=backSearch(a,t,i);
        }
        System.out.println(Arrays.toString(ans));
        //Largest in ansArray:-
        int max=ans[0];
        for(int i=0;i<ans.length;i++){
            if(max<ans[i]){
                max=ans[i];
            }
        }
        System.out.println("Max:- "+max);
        return max;
    }

    //Backsearching:-
    public static int backSearch(int a[],int t,int t_ind){
        System.out.println("t :-  "+t);
        System.out.println("t_ind :-  "+t_ind);
        for(int i=a.length-1;i>=t_ind;i--){
            if(t==a[i]){
                System.out.println("MaxDis:-  "+(i-t_ind));
                return i-t_ind;
            }

        }
        return -1;
    }

}
