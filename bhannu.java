// Given a list of integers, arrange the first half of the elements of the list in ascending order and the remaining half in descending. For example a list A [2,39, 12, 2009, 243, 21, 42]
//  should result in [2, 12, 39, 2009, 243, 42, 21]
import java.util.*;
class bhannu{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          ArrayList<Integer> list1=new ArrayList<>();
          ArrayList<Integer> list2=new ArrayList<>();
          int arr[]={2,39, 12, 2009, 243, 21, 42};
          for(int i=0;i<Math.abs(arr.length/2);i++){
                 list1.add(arr[i]);
          }
          Collections.sort(list1);
          for(int i=Math.abs(arr.length/2);i<arr.length;i++){
                    list2.add(arr[i]);
          }
          Collections.sort(list2,Collections.reverseOrder());
          list1.addAll(list2);
            System.out.println(list1);
          

    }
}