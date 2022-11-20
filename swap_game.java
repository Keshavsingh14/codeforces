import java.util.*;
public class swap_game
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = sc.nextInt();
                }
                int min = Integer.MAX_VALUE;
                for(int i=0;i<n;i++){
                    if(arr[i]<min){
                        min = arr[i];
                    }
                }
                    if(arr[0]==min){
                        System.out.println("Bob");
                    }
                    else{
                        System.out.println("Alice");
                    }
                }
        }
		}
	}
