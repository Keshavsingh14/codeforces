import java.util.*;
public class yes_yes {
	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while(test-->0){
                String str1 = sc.next();
                String strr2 = "";
                for(int i=0;i<21;i++){
                    strr2 = strr2+"Yes";
                }
                if(strr2.contains(str1)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
	}
}

