import java.util.Scanner;
import java.util.Stack;

public class Questian5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(input);
        while(input > 1){
            input = input/2;
            stack1.push(input);
        }

        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop());
            if (!stack1.isEmpty()) System.out.print(" ");
        }

        scanner.close();
    }
}
