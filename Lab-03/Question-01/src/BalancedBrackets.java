import java.util.HashMap;
import java.util.Stack;
import java.util.Scanner;



class BalancedBrackets {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        // Map opening brackets to their corresponding closing brackets
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (map.containsValue(c)) {
                // Check if the closing bracket matches the top element in the stack
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        // After processing all characters, the stack should be empty if the brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with brackets: ");
        String str = scanner.nextLine();

        if (isBalanced(str)) {
            System.out.println("The string has balanced brackets.");
        } else {
            System.out.println("The string has unbalanced brackets.");
        }
    }
}
