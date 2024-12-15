package sid;
import java.util.Stack;
public class BalanceParenthesis {

	public static boolean areParenthesesBalanced(String expression) {
		 Stack<Character> stack = new Stack<>();
		 
		 for (int i = 0; i < expression.length(); i++) {
		 char ch = expression.charAt(i);
		 
		 if (ch == '(' || ch == '[' || ch == '{') {
		 stack.push(ch);
		 } 
		 else if (ch == ')' || ch == ']' || ch == '}') {
		 if (stack.isEmpty()) {
		 return false;
		 }
		 
		 char top = stack.pop();
		 if ((ch == ')' && top != '(') || 
		 (ch == ']' && top != '[') || 
		 (ch == '}' && top != '{')) {
		 return false;
		 }
		 }
		 }
		 
		 return stack.isEmpty();
		 }
		 public static void main(String[] args) {
		 String expression1 = "{[()]}"; 
		 String expression2 = "{[(])}"; 
		 String expression3 = "{[("; 
		 System.out.println("Expression 1: " + expression1 + " - " + 
		(areParenthesesBalanced(expression1) ? "Balanced" : "Unbalanced"));
		 System.out.println("Expression 2: " + expression2 + " - " + 
		(areParenthesesBalanced(expression2) ? "Balanced" : "Unbalanced"));
		 System.out.println("Expression 3: " + expression3 + " - " + 
		(areParenthesesBalanced(expression3) ? "Balanced" : "Unbalanced"));
		 }}
