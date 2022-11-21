import java.util.*;
 
public class atilias_fav_problem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int test=sc.nextInt();
            while(test --> 0){
                int length = sc.nextInt();
                String str1 = sc.next();
                char[] ch = new char[length];
  
            
             for (int i = 0; i < length; i++) {
                ch[i] = str1.charAt(i);
 
             }
             
             int arr[] = new int [str1.length()];
             for (int j = 0; j < arr.length; j++) 
             {
                 arr[j]= (int) ch[j] - 96 ; 
                
             }
      
             int maxx=0;
             for (int k = 0; k < arr.length; k++) {
                 if(maxx<arr[k]){
                     maxx=arr[k];
                 }
 
                
             }
             System.out.println(maxx);
 
            }
        }
    }
}
