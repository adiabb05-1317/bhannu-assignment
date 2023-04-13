import java.util.*;
// Consider string A as “abcadcadcabcadodfea”. Replace the second occurrence of “ca” in string A with bd. So for the input “abadcadhtcabcadodfea” the output
//  should be “abadcadhtbdbcadodfea”
public class bhannu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abadcadhtcabcadodfea";
        String str1="ca";
        String str2="bd";
        StringBuilder sb=new StringBuilder(str);
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='c' && str.charAt(i+1)=='a'){
                count++;
                if(count>1){
                    sb.replace(i,i+1,str2);
                }
            }
        }
        System.out.println(sb.toString());
        
    }
}
