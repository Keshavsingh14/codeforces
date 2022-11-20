import java.util.*;
public class ban_ban
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int i = 1;
                int j = 3*n-1;
                System.out.println((n+1)/2);
                while(i<j){
                    System.out.println(i+" "+j);
                    i = i+3;
                    j= j-3;
                }
            }
        }
	}
}
