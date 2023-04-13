import java.util.*;
// Given an unsorted array A with non negative integers, find out a subarray which sums up to a number S and if there are multiple subarrays, return the first occurrence of subarray.


public class bhannu4 {
    public static void main(String[] args) {
        int a[]={1,2,3,7,5};
        int sum=12;
        int start=0;
        int end=0;
        ArrayList<Integer> ans=new ArrayList<>();
       
         for(int i=0;i<a.length;i++){
            int s=0;
               for(int j=i;j<a.length;j++){
                     s+=a[j];
                     if(s==sum){
                           start=i;
                           end=j;
                           break;
                     }
                     if(start!=0 && end!=0){break;}
               }
         }
         for(int i=start;i<=end;i++){
            ans.add(a[i]);
         }
         System.out.println(ans);

        }
}
