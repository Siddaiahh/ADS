package sid;
import java.util.Stack;
public class PostfixEvaluation {
		 public static int evaluatePostfix(String expression) {
		 Stack<Integer> stack = new Stack<>();
		 
		 for (int i = 0; i < expression.length(); i++) {
		 char ch = expression.charAt(i);
		 
		 if (Character.isDigit(ch)) {
		 stack.push(ch - '0'); }
		 else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
		 int operand2 = stack.pop();
		 int operand1 = stack.pop();
		 
		 int result = 0;
		 if (ch == '+') {
		 result = operand1 + operand2;
		 } else if (ch == '-') {
		 result = operand1 - operand2;
		 } else if (ch == '*') {
		 result = operand1 * operand2;
		 } else if (ch == '/') {
		 result = operand1 / operand2;
		 }
		 stack.push(result);
		 }
		 }
		 
		 return stack.pop();
		 }
		 public static void main(String[] args) {
		 String postfixExpression = "23*5+";
		 System.out.println("Postfix Expression: " + postfixExpression);
		 System.out.println("Evaluation Result: " + 
		evaluatePostfix(postfixExpression));
		 }
	}

