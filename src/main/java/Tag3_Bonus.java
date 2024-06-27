import java.util.Scanner;

public class Tag3_Bonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your Text here: ");
        String input = scanner.nextLine();

        scanner.close();

        for (int i = 0; i < input.length(); i++) {
            char out = input.charAt(i);
            System.out.print(out + "\n");
        }
    }
}
