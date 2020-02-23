import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide a string: ");
        String s1 = input.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            for (int j = s1.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) == s1.charAt(s1.length() - i - 1)) {
                    continue;
                }
                else
                    System.out.println("This is not a palindrome"); System.exit(1);
            }
        }
        System.out.println("The string " + s1 + " is a simple palindrome");

        input.close();
    }

}
