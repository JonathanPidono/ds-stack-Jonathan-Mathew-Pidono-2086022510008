import java.util.Scanner;
import java.util.Stack;

public class Question2 {
    
    public static int evaluate_rpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push((int)(a / (double)b)); break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
    
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan ekspresi RPN: ");
        String input = scanner.nextLine().trim();
        String[] tokens = input.split("\\s+");
        
        System.out.println(evaluate_rpn(tokens));
        
        scanner.close();
    }
}