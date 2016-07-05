
package textart; 

public class Colors { 
	
	public static final void list() { 
		System.out.println(Colors.RED + "Red, " + Colors.GREEN + "Green, " + Colors.BLUE + "Blue, " + Colors.BLACK + "Black, " + Colors.WHITE + "White, " + Colors.CYAN + "Cyan, " + Colors.YELLOW + "Yellow/Orange, " + Colors.RESET + "or "+ Colors.MAGENTA + "Magenta. "); 
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






