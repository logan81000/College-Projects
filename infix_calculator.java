package CSC400_work;

import java.util.Stack;

public class infix_calculator {
	
	public static final String ANSI_RED = "\u001B[31m";
	
    public static final String ANSI_RESET = "\u001B[0m"; 
	
	public static double infix(String expression) {
		

		char[] tok = expression.toCharArray();
		
		Stack<Double> nums = new Stack<>();
		Stack<Character> ops = new Stack<>();
		
		for (int i = 0; i < tok.length; i++) {
			if (tok[i] == ' ') {
				continue;
			}
			if ((tok[i] >= '0' && tok[i] <= '9') || tok[i] == '.') {
				StringBuilder builder = new StringBuilder();
				while (i < tok.length && (Character.isDigit(tok[i]) || tok[i] == '.')) {
					builder.append(tok[i]);
					i++;
				}
				nums.push(Double.parseDouble(builder.toString()));
				i--;
			}
			else if(tok[i] == '(') {
				ops.push(tok[i]);
			}
			else if(tok[i] == ')') {
				while (ops.peek() != '(') {
					nums.push(applyOp(ops.pop(), nums.pop(), nums.pop()));
				}
				ops.pop();
			}
			else if (tok[i] == '+' || tok[i] == '-' || tok[i] == '*' || tok[i] == '/') {
				while (!ops.isEmpty() && precedence(tok[i], ops.peek())) {
					nums.push(applyOp(ops.pop(), nums.pop(), nums.pop()));
				}
				ops.push(tok[i]);
				
			}
		}
		
		while (!ops.isEmpty()) {
			nums.push(applyOp(ops.pop(), nums.pop(), nums.pop()));
		}
		
		return nums.pop();
		
	}
	
	private static boolean precedence(char op1, char op2) {
		if (op2 == '(' || op2 == ')') {
			return false;
		}
		return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
	}
	
	private static double applyOp(char op, double b, double a) {
		switch (op) {
		case '+': return a+b;
		case '-': return a-b;
		case '*': return a*b;
		case '/': 
			if (b == 0) {
				throw new ArithmeticException("Can't divide by 0");
			}
			return a / b;
		case '%':
			
		}
		return 0;
	}

	public static void main(String[] args) {
		
		try {
			String ex1 = "5 + 20 * 2";
			String ex2 = "15 * (50 / 2)";
			String ex3 = "20 * 3 / 2";
			System.out.println("Result 1: " + infix(ex1));
			System.out.println("Result 2: " + infix(ex2));
			System.out.println("Result 1: " + infix(ex3));
		}
		catch (Exception EmptyStackException) {
		System.out.println(ANSI_RED +"Error: invalid characters imputed." + ANSI_RESET);
		}
		
		
		
		

	
	}

}
