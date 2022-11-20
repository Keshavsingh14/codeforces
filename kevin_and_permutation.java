import java.util.*;
public class kevin_and_permutation
{
	public static void main(String[] args){
	    try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
   
               for(int x =0; x<test; x++){
                   int n = sc.nextInt();
                   int a = n/2+1;
                   int b = 1;
                   for(int i = 1; i<=n/2; i++){
                       System.out.print(a+" "+b+" ");
                       a++;
                       b++;
                   }
               
               if(n % 2 != 0){
               System.out.print(a);
               System.out.println();
               }
               }
        }
	    }
	}
