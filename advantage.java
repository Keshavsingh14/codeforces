import java.util.*;
public class advantage
{
	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while(test-->0){
                int no = sc.nextInt();
                int[] arr = new int[no];
                for(int i=0;i<no;i++){
                    arr[i] = sc.nextInt();
                }
                int[] anss = new int[no];
                for(int i=0;i<no;i++){
                    anss[i] = arr[i];
                }
                Arrays.sort(anss);
                for(int i=0;i<no;i++){
                    if(arr[i]!=anss[anss.length-1]){
                        System.out.println(arr[i]-anss[anss.length-1]);
                    }
                    else{
                        System.out.println(arr[i]-anss[anss.length-2]);
                    }
                }
                
            }
        }
	}
}
