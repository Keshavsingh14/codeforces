import java.util.*;
public class medium_number
{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while(test-->0){
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int number3 = sc.nextInt();
            if(number2>number1 && number1>number3 || number3>number1 && number1>number2){
                System.out.println(number1);
            }
            else if(number1>number2 && number2>number3 || number3>number2 && number2>number1){
                System.out.println(number2);
            }
            else if(number1>number3 && number3>number2 || number2>number3 && number3>number1){
                System.out.println(number3);
            }
            }
        }
	}
}
