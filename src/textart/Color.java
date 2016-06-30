
package textart; 

public class Color { 
	
	public static final void list() { 
		System.out.println(Color.RED + "Red, " + Color.GREEN + "Green, " + Color.BLUE + "Blue, " + Color.BLACK + "Black, " + Color.WHITE + "White, " + Color.CYAN + "Cyan, " + Color.YELLOW + "Yellow/Orange, " + Color.RESET + "or "+ Color.MAGENTA + "Magenta. "); 
	} 
	
	public static final String RESET = "\u001B[0m"; 
	public static final String BLACK = "\u001B[30m"; 
	public static final String WHITE = "\u001B[37m"; 
	public static final String RED = "\u001B[31m"; 
	public static final String GREEN = "\u001B[32m"; 
	public static final String BLUE = "\u001B[34m"; 
	public static final String CYAN = "\u001B[36m"; 
	public static final String MAGENTA = "\u001B[35m"; 
	public static final String YELLOW = "\u001B[33m"; 
	public static final String ORANGE = "\u001B[33m"; 

} 






