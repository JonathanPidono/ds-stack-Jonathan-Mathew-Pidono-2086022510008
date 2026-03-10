import java.util.Scanner;
import java.util.Stack;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter bracket string: ");
        String input = scanner.nextLine();

        boolean result = is_balanced(input);
        System.out.println("Balanced: " + result);

        scanner.close();
    }

    public static boolean is_balanced(String s) {

        if (s.isEmpty()) {
            return true;
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        int half = s.length() / 2;
        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < half; i++) {
            stack1.push(s.charAt(i));
        }

        for (int i = half; i < s.length(); i++) {
            if (stack1.isEmpty()) return false;

            char open = stack1.pop();
            char close = s.charAt(i);

            if (open == '(' && close == ')') continue;
            if (open == '{' && close == '}') continue;
            if (open == '[' && close == ']') continue;

            return false;
        }

        return stack1.isEmpty();
    }
}