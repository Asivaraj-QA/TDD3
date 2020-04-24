package com.qa.testdrivendevelopment;

import java.util.Arrays;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Write a function which takes 2 integers greater than 0, X,Y as input and generates a 2-dimensional array. 
	 * The element value in the i-th row and j-th column of the array should be i*j.  <br>
	 * Note: i=0,1.., X-1; j=0,1,¡­Y-1.  <br>
	 *   <br>
	 * For Example:  <br>
	 * multiply(3,2) → [[0,0,0],[0,1,2]]  <br>
	 * multiply(2,1) → [[0,0]]  <br>
	 * multiply(3,4) → [[0,0,0],[0,1,2],[0,2,4],[0,3,6]]
	 */
	public int[][] multiply(int arrayLength, int numOfArrays){
		int X = arrayLength;
		int Y = numOfArrays;
		int[][] gen = new int [Y][X];
		for (int row = 0; row < Y; row++) {
			for (int col = 0; col < X; col++) {
				int mult = ((row)*(col))-1;
				gen[row][col] = mult;
				gen[row][col]++;
			}
		}
//		System.out.println(Arrays.deepToString(gen)); //to see what is being sent to output
		return gen;
	}
	
	/**
	 * Write a function that accepts a comma separated sequence of words as input and prints the words in a comma-separated
	 * sequence after sorting them alphabetically.
	 * 
	 * For Example:
	 * sortAlphabetically({"bag","car","dog"}) → {"bag","car","dog"}
	 * sortAlphabetically({"dog","car","bag"}) → {"bag","car","dog"}
	 * sortAlphabetically({"car","bark","bag","dog"}) → {"bag","bark","car","dog"}
	 */
	public String[] sortAlphabetically(String[] wordSequence) {
		boolean sort = false;
		do {
			sort = false;
			for(int i = 0; i < wordSequence.length - 1; i++) {
				if(wordSequence[i].compareTo(wordSequence[i+1]) > 0) {
					String temp = wordSequence[i+1];
					wordSequence[i+1] = wordSequence[i];
					wordSequence[i] = temp;
					sort = true;
				}
			}
		}while((sort));
		return wordSequence;
	}

	/**
	 * Write a function which takes an input, a, and returns the sum a+aa+aaa+aaaa.
	 * So if 2 was the input, the function should return 2+22+222+2222 which is 2468.
	 * 
	 * For Example:
	 * aPlus(5) → 6170
	 * aPlus(9) → 11106
	 */
	public int aPlus(int num) {
		int first = num;
		int second = (first*10) + first;
		int third = (first*100) + second;
		int fourth = (first*1000) + third;
		int sum = first +second + third + fourth;
		return sum;
	}

	/**
	 * Write a function which takes a string of numbers, separated by commas, and returns all the odd numbers as a string, separated by commas.
	 * If there are no odd numbers then the function should return "null".
	 * 
	 * Inputs will always be given in ascending order, eg "3,4,5". Outputs should also be given in ascending order.
	 * 
	 * For Example:
	 * oddNum("1,2,3,4,5") → "1,3,5"
	 * oddNum("2,4,6,8") → "null"
	 * oddNum("23,48,52,57") → "23,57"
	 */
	public String oddNum(String allNums) {
		StringBuilder oddnum = new StringBuilder();
		String out = null;
		for (int index = 0; index < allNums.length(); index++) {
			if (allNums.charAt(index) % 2 == 1) {
				oddnum.append(allNums.charAt(index) + ",");
			}else {
				continue;
			}
			out = oddnum.substring(0,oddnum.length()-1);
		}
		System.out.println(out);
		return out;
	}

	/**
	 * Define a function that can accept two strings as input and returns the string of largest length 
	 * 
	 * If two strings have the same length, then the function should return both strings separated by a single space.
	 * In this case, the strings should be returned in the same order in which they were given.
	 * 
	 * For Example:
	 * longString("hi","hello") → "hello"
	 * longString("three", "two") → "three"
	 * longString("three", "hello") → "three hello"
	 */
	public String longString(String input1, String input2) {
		if (input1.length() > input2.length()) {
			return input1;
		}else if (input2.length() > input1.length()) {
			return input2;
		}else if (input1.length() == input2.length()) {
			return input1 + " " + input2;
		}else {
		return "";
		}
	}

	
	/**
	 * Given an email address person@company.com, and a parameter "person" or "company",
	 * write a function which returns the corresponding piece of information.
	 * Your function should ignore case.
	 * 
	 * For Example:
	 * email("john@google.com", "person") → "john"
	 * email("jane@Microsoft.com", "company") → "microsoft"
	 * email("Dave@amazon.com", "person") → "dave"
	 */
	public String email(String email, String parameter) {
		String e = email.toLowerCase();
		String p = parameter.toLowerCase();
		StringBuilder out = new StringBuilder();
		if (p == "person") {
			out.append(e.substring(0, e.indexOf("@")));
		} else if (p == "company") {
			out.append(e.substring(e.indexOf("@") + 1, e.indexOf(".")));
		}
		return out.toString();
	}

	/**
	 * 	The fibonacci sequence is the sum of the last two numbers, 
	 * 	with index 0 and 1 having a value of 0 and 1 respectively
	 * 
	 * So fibonacci(5) is the sum of fibonacci(4) + fibonacci(3)
	 * 
	 * For Example:
	 * fibbonaci(0) → 0
	 * fibbonaci(1) → 1
	 * fibbonaci(2) → 1
	 * fibbonaci(3) → 2
	 * fibbonaci(4) → 3
	 * fibbonaci(5) → 5
	 * fibbonaci(8) → 21
	 */
	public int fibonacci(int num) {
		int a = 0;
		int b = 1;
		int n = 1;
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			for (int i = 2; i <= num; i++) {
				n = a + b;
				a = b;
				b = n;
			}
			return n;
		}
	}


	/**
	 * Write a function which, given a string input, returns a string which contains only the characters with odd indexes.
	 * 
	 * For Example:
	 * oddLetters("Sponge") → "pne"
	 * oddLetters("hi") → "i"
	 * oddLetters("0H1e2l3l4o5w6o7r8l9d") → "Helloworld"
	 */
	public String oddLetters(String input) {
		StringBuilder odds = new StringBuilder();
		for (int index = 0; index < input.length(); index++) {
			if (index % 2 == 1) {
				odds.append(input.charAt(index));
			}
		}
		return odds.toString();
	}


	/**
	 * Write a function which solves the following puzzle.
	 * A farm has chickens and rabbits, and scanners are able to detect the number of heads and legs.
	 * How many chickens do we have, if we know the number of heads and legs?
	 * The values for 'heads' and 'legs' will be inputs.
	 * If there are no solutions to the puzzle, return null
	 * 
	 * For Example:
	 * chickenAndRabbits(35, 94) → 23
	 * chickenAndRabbits(2, 6) → 1
	 * chickenAndRabbits(12,63) → null
	 */
	public Integer chickenAndRabbits(int heads, int legs) {
		int chicken = legs/4;
		if (chicken < heads) {
			return chicken;
		}else {
			return null;
		}
	}


	/**
	 * Write a function which checks the validity of a credit card number.
	 * The function should return a boolean, True if the card is valid, or False if it is not.
	 * 
	 * A credit card has a valid number if it satisfies the following criteria.
	 * - it must start with a 4, 5 or 6.
	 * - it must contain exactly 16 digits.
	 * - each digit must be 0-9 inclusive.
	 * - it may contain hyphens ("-"), to separate groups of 4 digits only, but it cannot contain any other characters.
	 * - it must not have 4 or more consecutive repeated digits.
	 * 
	 * For Example:
	 * validCard("4012-3456-7890-1234") → True
	 * validCard("0123-4567-8901-2345") → False
	 * validCard("401234567890123") → False
	 * validCard("4012 3456 7890 1234") → False
	 * validCard("4444-0123-4567-8901") → False
	 * validCard("4012345678901234") → True
	 */
	public boolean validCard(String cardNumber) {
		String card = cardNumber;
		String pre1 = "4";
		String pre2 = "5";
		String pre3 = "6";
		if (card.startsWith(pre1) || card.startsWith(pre2) || card.startsWith(pre3)) {
			
			
		}
		return false;
	}
}