package arraysInterviewCoding;

import java.util.Stack;

public class ValidParenhtesis_leetcode {

	public static boolean validParenthesis(String input) {

		char ch[] = input.toCharArray();

		Stack<Character> stack = new Stack<>();

		for (char current : ch) {

			if (current == '(') {
				stack.push(current);

			}

			else if (current == ')') {
				
					if (stack.isEmpty()) {
						return false; // no opening bracker
					} 
					
					 
						char pop = stack.pop();
						if (pop != '(') {
							return false;
						}
						
						
						
						
						

					}
				}
			

		
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		String input = "(())";

		 System.out.println(validParenthesis(input));
		// check if the given string is valid parenthesis or not

	}

}
