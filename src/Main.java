import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the diamond height: ");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = 1;
        int b=h-1;
        int c=2;
        for (int i = 0; i < h; i++) {
            while (b>0) {
                System.out.print(" ");
                b--;
            }
            b=h-1;
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            while (b>0) {
                System.out.print(" ");
                b--;
            }
            b=h-c;
            c++;
            System.out.println("");
            a = a + 2;
        }
    }
}