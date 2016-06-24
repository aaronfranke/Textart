
package textart; 

import java.util.Scanner; 
import java.util.regex.*; 

public class Parser { 
	
	public static final String decimalPattern = "([0-9]*)\\.([0-9]*)"; 
	public static final String newlines = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	public static final Scanner keyboard = new Scanner(System.in); 
	
	public static final  long integer64() { //Returns whole numbers up to about 9 quintillion. 
		boolean invalid = true; 
		long number = 0; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (input.matches("\\d+")){ 
				number = Long.parseLong(input); 
				invalid = false; 
			} else { 
				System.out.println("That's not a whole number! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return number; 
	} 
	
	public static final int integer32() { //Returns whole numbers up to about 2 billion but can handle user inputs of up to 9 quintillion. 
		boolean invalid = true; 
		int number = 0; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (input.matches("\\d+")){ 
				long inputNumber = Long.parseLong(input); 
				if (inputNumber < 2147483600) { 
					invalid = false; 
					number = (int)inputNumber; 
				} else { 
					System.out.println("That's too big! "); 
					System.out.print("Try again: "); 
				} 
			} else { 
				System.out.println("That's not a whole number! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return number; 
	} 
	
	public static final short integer16() { //Returns whole numbers up to about 30 thousand but can handle user inputs of up to 9 quintillion. 
		boolean invalid = true; 
		short number = 0; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (input.matches("\\d+")){ 
				long inputNumber = Long.parseLong(input); 
				if (inputNumber < 32760) { 
					invalid = false; 
					number = (short)inputNumber; 
				} else { 
					System.out.println("That's too big! "); 
					System.out.print("Try again: "); 
				} 
			} else { 
				System.out.println("That's not a whole number! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return number; 
	} 

	public static final byte integer8() { //Returns whole numbers up to 125 but can handle user inputs of up to 9 quintillion. 
		boolean invalid = true; 
		byte number = 0; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (input.matches("\\d+")){ 
				long inputNumber = Long.parseLong(input); 
				if (inputNumber < 126) { 
					invalid = false; 
					number = (byte)inputNumber; 
				} else { 
					System.out.println("That's too big! "); 
					System.out.print("Try again: "); 
				} 
			} else { 
				System.out.println("That's not a whole number! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return number; 
	} 
	
	public static final float floating32() { //Returns floating numbers with 32 bits of precision. 
		boolean invalid = true; 
		float number = 0; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (Pattern.matches(decimalPattern, input) || input.matches("\\d+")){ 
				number = Float.parseFloat(input); 
				invalid = false; 
			} else { 
				System.out.println("That's not a number! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return number; 
	} 
	
	public static final double floating64() { //Returns floating numbers with 64 bits of precision. 
		boolean invalid = true; 
		double number = 0; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (Pattern.matches(decimalPattern, input) || input.matches("\\d+")){ 
				number = Float.parseFloat(input); 
				invalid = false; 
			} else { 
				System.out.println("That's not a number! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return number; 
	} 
	
	public static final String text() { //Returns text that isn't composed of numbers. 
		boolean invalid = true; 
		String text = " "; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (Pattern.matches(decimalPattern, input) || input.matches("\\d+")){ 
				System.out.println("That's a number! Type some text instead. "); 
				System.out.print("Try again: "); 
			} else {
				text = input; 
				invalid = false; 
			}
		} 
		return text; 
	} 
	
	public static final char character() { //Returns a single character and requests an input of a single character if more than one is input. 
		boolean invalid = true; 
		char character = ' '; 
		while (invalid) { 
			String input = keyboard.next(); 
			if (input.toLowerCase().equals("none") || input.toLowerCase().equals("space")) {
				character = ' ';
				invalid = false;
			} else if (input.length() == 1){ 
				character = input.charAt(0); 
				invalid = false; 
			} else { 
				System.out.println("That's not a single character! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return character; 
	} 
	
	public static final char color() { //Returns a color based on name or letter and requests an input of a valid color if an invalid one is input.
		boolean invalid = true; 
		char character = 's'; 
		while (invalid) { 
			String input = keyboard.next(); 
			input = input.toLowerCase(); 
			if (input.equals("reset")) { //Default color 
				invalid = false; 
				character = 's'; 
			} else if (input.equals("black") || input.startsWith("k")) { //Black 
				invalid = false; 
				character = 'k'; 
			} else if (input.startsWith("r")) { //Red 
				invalid = false; 
				character = 'r'; 
			} else if (input.startsWith("b")) { //Blue 
				invalid = false; 
				character = 'b'; 
			} else if (input.startsWith("g")) { //Green 
				invalid = false; 
				character = 'g'; 
			} else if (input.startsWith("w")) { //White 
				invalid = false; 
				character = 'w'; 
			} else if (input.startsWith("c")) { //Cyan 
				invalid = false; 
				character = 'c'; 
			} else if (input.startsWith("m")) { //Magenta 
				invalid = false; 
				character = 'm'; 
			} else if (input.startsWith("y")) { //Yellow 
				invalid = false; 
				character = 'y'; 
			} else { 
				System.out.println("That's not a color! "); 
				System.out.print("Try again: "); 
			} 
		} 
		return character; 
	} 
	
} 





