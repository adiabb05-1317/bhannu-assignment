import java.util.*;
// Given a list of integers, arrange the unique numbers by order of recurrence(times it repeated) 
// and if two numbers have same 
public class bhannu3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={2,2,4,2,3,4,3,7};
        Set<Integer> set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:a){
            if(set.contains(num)){
                   ans.add(num);
                   set.remove(num);
            }
        }
        System.out.println(ans);
    }
}
