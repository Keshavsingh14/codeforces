import java.util.*;
public class watermelon {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            if(test>2){
                if(test % 2 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
