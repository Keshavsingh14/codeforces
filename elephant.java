import java.util.Scanner;
public class elephant {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();
            System.out.println((x + 4) / 5);
        }
    }
}