import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("insert number more than 10");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("input :"+input);
        System.out.printf("num=%d%n", num);
    }
}
