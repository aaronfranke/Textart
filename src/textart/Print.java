
package textart; 

public class Print { 
	
	public static final void decide() {
		System.out.print("What do you want to print? "); 
		String responseToPrint = Parser.keyboard.next(); 
		responseToPrint = responseToPrint.toLowerCase(); 
		if (responseToPrint.startsWith("a")) { 
			System.out.println("Printing the entire world... "); 
			Print.all(); 
		} else if (responseToPrint.startsWith("w")) { 
			System.out.println("Printing the world at full with... "); 
			Print.wide(Textart.maximized); 
		} else if (responseToPrint.startsWith("p")) { 
			System.out.print("Printing an area. Input top-left X coordinate: "); 
			short X1 = (short)(Parser.integer16() - 1); 
			System.out.print("Input top-left Y coordinate: "); 
			short Y1 = (short)(Parser.integer16() - 1); 
			System.out.print("Input bottom-right X coordinate: "); 
			short X2 = (short)(Parser.integer16() - 1); 
			System.out.print("Input bottom-right Y coordinate: "); 
			short Y2 = (short)(Parser.integer16() - 1); 
			System.out.println("Printing the world from (" + X1 + ", " + Y1 + ") to (" + X2 + ", " + Y2 + ")... "); 
			Print.part(X1, Y1, X2, Y2); 
		} else { 
			System.out.println("What the heck does that mean? "); //Loop will still continue if this command is executed. 
			try { 
			    Thread.sleep(2000); 
			} catch (InterruptedException e) { 
				System.out.println("VERY BAD ERROR! Program will likely crash now... "); 
			} 
		} 
	} 
	
	public static final void all() { 
		System.out.print(Parser.newlines); 
		for (short currentY = 0; currentY < Textart.canvasSize; currentY++) { 
			for (short currentX = 0; currentX < Textart.canvasSize; currentX++) { 
				if (Textart.canvasColor[currentY][currentX] == 'g') { 
					System.out.print(Color.GREEN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'r') { 
					System.out.print(Color.RED + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'b') { 
					System.out.print(Color.BLUE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'k') { 
					System.out.print(Color.BLACK + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'w') { 
					System.out.print(Color.WHITE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'c') { 
					System.out.print(Color.CYAN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'm') { 
					System.out.print(Color.MAGENTA + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'y') { 
					System.out.print(Color.YELLOW + Textart.canvasCharacter[currentY][currentX]); 
				} else { 
					System.out.print(Color.RESET + Textart.canvasCharacter[currentY][currentX]); 
				} 
			} 
			System.out.println(); 
		} 
		System.out.println(Color.RESET); 
	} 
	
	public static final void wide(boolean maximized) {
		if (maximized) {
			maximized();
		} else {
			widee();
		}
	}
	
	public static final void widee() { 
		System.out.print(Parser.newlines); 
		for (int currentY = 0; currentY < 21 && currentY < Textart.canvasSize; currentY++) { 
			for (int currentX = 0; currentX < 79 && currentX < Textart.canvasSize; currentX++) { 
				if (Textart.canvasColor[currentY][currentX] == 'g') { 
					System.out.print(Color.GREEN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'r') { 
					System.out.print(Color.RED + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'b') { 
					System.out.print(Color.BLUE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'k') { 
					System.out.print(Color.BLACK + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'w') { 
					System.out.print(Color.WHITE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'c') { 
					System.out.print(Color.CYAN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'm') { 
					System.out.print(Color.MAGENTA + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'y') { 
					System.out.print(Color.YELLOW + Textart.canvasCharacter[currentY][currentX]); 
				} else { 
					System.out.print(Color.RESET + Textart.canvasCharacter[currentY][currentX]); 
				} 
			} 
			System.out.println(); 
		} 
		System.out.println(Color.RESET); 
	} 
	
	public static final void maximized() { 
		System.out.print(Parser.newlines); 
		for (int currentY = 0; currentY < 61 && currentY < Textart.canvasSize; currentY++) { 
			for (int currentX = 0; currentX < 209 && currentX < Textart.canvasSize; currentX++) { 
				if (Textart.canvasColor[currentY][currentX] == 'g') { 
					System.out.print(Color.GREEN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'r') { 
					System.out.print(Color.RED + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'b') { 
					System.out.print(Color.BLUE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'k') { 
					System.out.print(Color.BLACK + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'w') { 
					System.out.print(Color.WHITE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'c') { 
					System.out.print(Color.CYAN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'm') { 
					System.out.print(Color.MAGENTA + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'y') { 
					System.out.print(Color.YELLOW + Textart.canvasCharacter[currentY][currentX]); 
				} else { 
					System.out.print(Color.RESET + Textart.canvasCharacter[currentY][currentX]); 
				} 
			} 
			System.out.println(); 
		} 
		System.out.println(Color.RESET); 
	} 
	
	public static final void part(short X1, short Y1, short X2, short Y2) { 
		System.out.print(Parser.newlines); 
		for (short currentY = Y1; currentY <= Y2; currentY++) { 
			for (short currentX = X1; currentX <= X2; currentX++) { 
				if (Textart.canvasColor[currentY][currentX] == 'g') { 
					System.out.print(Color.GREEN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'r') { 
					System.out.print(Color.RED + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'b') { 
					System.out.print(Color.BLUE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'k') { 
					System.out.print(Color.BLACK + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'w') { 
					System.out.print(Color.WHITE + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'c') { 
					System.out.print(Color.CYAN + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'm') { 
					System.out.print(Color.MAGENTA + Textart.canvasCharacter[currentY][currentX]); 
				} else if (Textart.canvasColor[currentY][currentX] == 'y') { 
					System.out.print(Color.YELLOW + Textart.canvasCharacter[currentY][currentX]); 
				} else { 
					System.out.print(Color.RESET + Textart.canvasCharacter[currentY][currentX]); 
				} 
			} 
			System.out.println(); 
		} 
		System.out.println(Color.RESET); 
	} 
	
} 










