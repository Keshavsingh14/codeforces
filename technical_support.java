import java.util.Scanner;
public class technical_support
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while(test-->0){
                int n = sc.nextInt();
                char ch[] = sc.next().toCharArray();
                int q = 0;
                for(int i =0; i<n; i++){
                    if(ch[i] == 'Q')q++;
                    else q = Math.max(0, q-1);
                }
                if(q == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
            }
        }
	}
}
