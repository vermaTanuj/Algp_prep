package _Arrays_;

public class Unique_in_Array_ {
    public static void main(String[] args) {
        int []a={2,99,100,101,100,99,2,101,6,6,3,3,7,1,7,7,7,4,4};
        int b[]={6,8,8,7,7,10,6};
        int c[]={2,3,2,9,9,10};
        System.out.println("unique:-  "+unique(c));


        System.out.println(findPower(9,2));

/*
        for(int i=0;i<10;i++){
            int y=45<<i;
            System.out.println("45<<  "+i+" :-  "+y);
        }
        for(int i=0;i<10;i++){
            int y=45>>i;
            System.out.println("45>>  "+i+" :-  "+y);
        }

 */

    }
    public static int unique(int a[]){
        int ans=0;
        for(int i=0;i<a.length;i++){
            ans=ans^a[i];
        }
        return ans;
        // Exor oprater works only on 1 unique element finding
    }

    //We will give you no and power find the value:-
    public static int findPower(int a,int p){
        if(p==0){
            return 1;
        }

        return a<<p;
    }
}
