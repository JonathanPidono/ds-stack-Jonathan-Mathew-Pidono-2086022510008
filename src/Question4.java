import java.util.Scanner;
import java.util.Stack;

public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        String input = scanner.nextLine();

        int[] ordered = orderSyncProtocol(input);
        Stack<Integer> stack = stackingFormationInjection(ordered);
        displaySecretCode(stack);

        scanner.close();
    }

    static int[] orderSyncProtocol(String input) {
        String[] tokens = input.trim().split("\\s+");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        return numbers;
    }

    static void insertSorted(Stack<Integer> sortedStack, Stack<Integer> tempBuffer, int value) {
        while (!sortedStack.isEmpty() && sortedStack.peek() > value) {
            tempBuffer.push(sortedStack.pop());
        }
        sortedStack.push(value);
        while (!tempBuffer.isEmpty()) {
            sortedStack.push(tempBuffer.pop());
        }
    }

    static Stack<Integer> stackingFormationInjection(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int num : numbers) stack.push(num);

        int n = numbers.length;
        int takeCount = 1;

        while (takeCount <= n) {
            int actualTake = Math.min(takeCount, stack.size());

            Stack<Integer> tempPop = new Stack<>();
            for (int i = 0; i < actualTake; i++) {
                tempPop.push(stack.pop());
            }

            Stack<Integer> sortedStack = new Stack<>();
            Stack<Integer> tempBuffer = new Stack<>();
            while (!tempPop.isEmpty()) {
                insertSorted(sortedStack, tempBuffer, tempPop.pop());
            }

            Stack<Integer> flipBuffer = new Stack<>();
            while (!sortedStack.isEmpty()) flipBuffer.push(sortedStack.pop());
            while (!flipBuffer.isEmpty()) stack.push(flipBuffer.pop());

            takeCount++;
        }

        return stack;
    }

    static void displaySecretCode(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) temp.push(stack.pop());

        StringBuilder sb = new StringBuilder();
        while (!temp.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(temp.pop());
        }
        System.out.println("Kode rahasia: " + sb.toString());
    }
}