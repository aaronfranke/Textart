
package textart; 

import java.util.*; 

public class Textart { 
	
	public static boolean maximized = false;
	public static short canvasSize = -1; 
	public static char[][] canvasColor; 
	public static char[][] canvasCharacter; 

	public static final void main(String[] args) { 
		if (args.length > 0) {
			maximized = true;
		}
		boolean doThings = true; 
		System.out.println(" \nText-based ASCII art painter via shapes, supporting various colors and characters. "); 
		System.out.println("Created by Aaron Franke. "); 
		System.out.println("\n "); 
		//Code to select a world size below. Useless if the below worldSize= line is uncommented. 
		
		while (canvasSize > 10000 || canvasSize < 2) { 
			System.out.print("How big should the canvas be? "); 
			short input = Parser.integer16(); 
			if (input > 10001) { 
				System.out.println("That's too big! The canvas needs to be less than ten thousand units. "); 
			} else if (input < 2) { 
				System.out.println("That's too small! "); 
			} else { 
				canvasSize = (short)input; 
			} 
		} 
		//worldSize = 80; 
		//Debug: System.out.println(worldSize); 
		
		canvasColor = new char[canvasSize][canvasSize]; 
		canvasCharacter = new char[canvasSize][canvasSize]; 
		
		for (char[] canvas : canvasColor) { 
			Arrays.fill(canvas, 'g'); 
		}
		
		for (char[] canvas : canvasCharacter) { 
			Arrays.fill(canvas, '#'); 
		}
		
		//Print.all();
		//Print.part(1, 1, 3, 3);
		Print.wide(maximized);
		//Print.wider();
		//Print.widee();
		
		//Loop Below, Above is one-time run code.
		 
		while (doThings) { 
			System.out.print("What do you want to do or draw? "); 
			String response = Parser.keyboard.next(); 
			response = response.toLowerCase(); 
			if (response.startsWith("rec")) { //This ends the loop. 
				Draw.rect(); 
				Print.wide(maximized); 
			} else if (response.startsWith("s")) { 
				Draw.square(); 
				Print.wide(maximized); 
			} else if (response.startsWith("d")) { 
				Draw.diamond(); 
				Print.wide(maximized); 
			} else if (response.startsWith("c")) { 
				Draw.circle(); 
				Print.wide(maximized); 
			} else if (response.startsWith("po")) { 
				Draw.point(); 
				Print.wide(maximized); 
			} else if (response.startsWith("f")) { 
				Draw.fill(); 
				Print.wide(maximized); 
			} else if (response.startsWith("pr")) { 
				Print.decide();
			} else if (response.startsWith("ex") || response.startsWith("q") || response.startsWith("en") || response.startsWith("re")) { 
				Print.wide(maximized); 
				System.out.println("Restarting program... "); 
				doThings = false; 
			} else { 
				System.out.println("What the heck does that mean? "); //Loop will still continue if this command is executed. 
				try { 
				    Thread.sleep(2000); 
				} catch (InterruptedException e) { 
					System.out.println("VERY BAD ERROR! Program will likely crash now... "); 
				} 
				Print.wide(maximized); 
			} 
		} 
		//Print.wide(terminal); 
		
		//Parser.keyboard.close(); 
		//System.out.print(newlines); 
		
		if (args.length == 0) { 
			main(new String[]{}); 
		} else { 
			main(new String[]{"terminal"}); 
		} 
	} 

} 






