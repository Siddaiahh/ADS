package sid;
import java.util.Stack;

public class InfixToPosfix {
	private static int precedence(char ch) {
		 if (ch == '+' || ch == '-') {
		 return 1;
		 } else if (ch == '*' || ch == '/') {
		 return 2;
		 } else if (ch == '^') {
		 return 3; 
		 }
		 return -1;
		 }
		 public static String infixToPostfix(String expression) {
		 Stack<Character> stack = new Stack<>(); 
		 StringBuilder result = new StringBuilder();
		 
		 for (int i = 0; i < expression.length(); i++) {
		 char ch = expression.charAt(i);
		 
		 if (Character.isLetterOrDigit(ch)) {
		 result.append(ch);
		 } 
		 
		 else if (ch == '(') {
		 stack.push(ch);
		 } 
		 else if (ch == ')') {
		 while (!stack.isEmpty() && stack.peek() != '(') {
		 result.append(stack.pop());
		 }
		 stack.pop(); 
		 } 
		 else {
		 while (!stack.isEmpty() && precedence(ch) <= 
		precedence(stack.peek()) && ch != '^') {
		 result.append(stack.pop());
		 }
		 stack.push(ch);
		 }
		 }
		 while (!stack.isEmpty()) {
		 result.append(stack.pop());
		 }
		 
		 return result.toString();
		 }
		 public static void main(String[] args) {
		 String infixExpression = "A+B*(C^D-E)^(F+G*H)-I";
		 System.out.println("Infix Expression: " + infixExpression);
		 System.out.println("Postfix Expression: " + infixToPostfix(infixExpression));
		 }
		}
