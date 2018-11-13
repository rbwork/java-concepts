package javaConcepts;

import java.util.Arrays;

public class JavaConceptsOne {
	
	public static void main(String args[]) {
		reverseString("Hello");
		
		int array[] = {4, 3, 2, 1};
		sortArray(array);
		
		highestTwoProduct(array);
		
		meanArray(array);
		
		factorial(4);
		
		System.out.println(fact(4));
		
		palindrome("non");
		
		blank("");
		
		compareStrings("I like sports", "I like");
		
		fibonacci(10);
		
		String str = "I support Arsenal";
		str = str.replaceAll(" ", "");
		while(str.length() > 0) {
			char ch = str.charAt(0);
			System.out.println(ch + " " + countChar(str, ch));
			str = str.replace("" + ch, "");
		}
	}
	
	public static int countChar(String str, char ch) {
		int count = 0;
		while(str.indexOf(ch) != -1) {
			count++;
			str = str.substring((str.indexOf(ch) + 1));
		}
		return count;
	}
	
	public static void reverseString(String str) {
		System.out.println("String: " + str);
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed: " + reverse);
	}
	
	public static void sortArray(int array[]) {
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void highestTwoProduct(int array[]) {
		Arrays.sort(array);
		
		int maxOne = array[array.length - 1];
		int maxTwo = array[array.length - 2];
		
		int max = maxOne * maxTwo;
		System.out.println("Highest Two Values of Array Product: " + max);
	}
	
	public static void meanArray(int array[]) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double mean = sum / array.length;
		System.out.println("Mean Array: " + mean);
	}
	
	public static void factorial(int fact) {
		int num = 1;
		for(int i = 1; i <= fact; i++) {
			num = num * i;
		}
		System.out.println("Factorial of " + fact + ": " + num);
	}
	
	public static long fact(long n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
	
	public static void palindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		if(sb.reverse().toString().equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void blank(String str) {
		if(str.trim().length() == 0) {
			System.out.println("Blank");
		} else {
			System.out.println("Not Blank");
		}
	}
	
	public static void compareStrings(String strOne, String strTwo) {
		String wordsOne[] = strOne.split(" ");
		String wordsTwo[] = strTwo.split(" ");
		
		for(int i = 0; i < wordsOne.length; i++) {
			int same = 0;
			for(int j = 0; j < wordsTwo.length; j++) {
				if(wordsOne[i].equals(wordsTwo[j])) {
					same = 1;
					wordsTwo[j] = " ";
					break;
				}
			}
			if(same == 0) {
				System.out.println(wordsOne[i]);
			}
		}
	}
	
	public static void fibonacci(int num) {
		int n1 = 0, n2 = 1, n3;
		System.out.print("Fibonacci: " + n1 + " " + n2);
		for(int i  = 2; i < num; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}
}