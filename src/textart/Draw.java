
package textart;

import java.util.Arrays;

public class Draw extends Shapes { 
	
	public static final void point() { 
		short X = -1, Y = -1; 
		char color = 's', character = '#'; 
		while (X < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the point be (X axis)? "); 
			X =  (short)(Parser.integer16() - 1); 
			if (X < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (Y < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the point be (Y axis)? "); 
			Y =  (short)(Parser.integer16() - 1); 
			if (Y < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		System.out.print(Colors.RESET + "What character should be used? ");
		character = Parser.character();
		Colors.list();
		System.out.print(Colors.RESET + "What color should it be? "); 
		color = Parser.color(); 
		
		point(X, Y, color, character); 
	} 
	
	
	public static final void fill() { 
		char color = 's', character = '#'; 
		System.out.print(Colors.RESET + "Filling the entire world with what you specify next. "); 
		System.out.print(Colors.RESET + "What character should be used? ");
		character = Parser.character();
		Colors.list();
		System.out.print(Colors.RESET + "What color should it be? "); 
		color = Parser.color(); 
		
		for (char[] world : Textart.canvasColor) { 
			Arrays.fill(world, color); 
		}
		
		for (char[] world : Textart.canvasCharacter) { 
			Arrays.fill(world, character); 
		}
	} 
	
	
	public static final void copy() {
		short X1 = -1, Y1 = -1, X2 = -1, Y2 = -1, X3 = -1, Y3 = -1;

		while (X1 < 0 || X1 > Textart.canvasSize - 1) { 
			System.out.print("What is the left side's coordinate of the region you want to copy? "); 
			X1 = (short)(Parser.integer16() - 1); 
			if (X1 < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X1 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (X2 < 0 || X2 > Textart.canvasSize - 1) { 
			System.out.print("What is the right side's coordinate of the region you want to copy? "); 
			X2 = (short)(Parser.integer16() - 1); 
			if (X2 < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X2 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			}
		}
		while (Y1 < 0 || Y1 > Textart.canvasSize - 1) { 
			System.out.print("What is the top side's coordinate of the region you want to copy? "); 
			Y1 = (short)(Parser.integer16() - 1); 
			if (Y1 < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y1 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (Y2 < 0 || Y2 > Textart.canvasSize - 1) { 
			System.out.print("What is the bottom side's coordinate of the region you want to copy? "); 
			Y2 = (short)(Parser.integer16() - 1); 
			if (Y2 < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y2 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (X3 < 0 || X3 > Textart.canvasSize - 1) { 
			System.out.print("What is the left side's coordinate of the position to copy the region to? "); 
			X3 = (short)(Parser.integer16() - 1); 
			if (X3 < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (X3 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (Y3 < 0 || Y3 > Textart.canvasSize - 1) { 
			System.out.print("What is the top side's coordinate of the position to copy the region to? "); 
			Y3 = (short)(Parser.integer16() - 1); 
			if (Y3 < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y3 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		System.out.println("Copying... ");
		copy(X1, Y1, X2, Y2, X3, Y3);
	}
	
	
	public static final void square() { 
		short size = 0, X = -1, Y = -1; 
		char color = 's', character = '#'; 
		while (size < 1 || size > Textart.canvasSize) { 
			System.out.print("How big should the square be? "); 
			size = (short)(Parser.integer16() - 1); 
			if (size < 1) { 
				System.out.println("Too small! "); 
			} else if (size > Textart.canvasSize) { 
				System.out.println("Too big! "); 
			} 
		} 
		while (X < 0 || X > 4) { 
			System.out.print("Where should the top-left corner of the square be (X axis)? "); 
			X = (short)(Parser.integer16() - 1); 
			if (X < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X > 4) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (X < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the top-left corner of the square be (X axis)? "); 
			X = (short)(Parser.integer16() - 1); 
			if (X < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (Y < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the top-left corner of the square be (Y axis)? "); 
			Y =  (short)(Parser.integer16() - 1); 
			if (Y < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		System.out.print(Colors.RESET + "What character should be used? ");
		character = Parser.character(); 
		Colors.list();
		System.out.print(Colors.RESET + "What color should it be? "); 
		color = Parser.color(); 
		
		square(X, Y, size, color, character); 
	} 
	
	
	public static final void rect() { 
		short X1 = -1, X2 = -1, Y1 = -1, Y2 = -1; 
		char color = 's', character = '#'; 
		while (X1 < 0 || X1 > Textart.canvasSize - 1) { 
			System.out.print("Where should the left edge of the rectangle be? "); 
			X1 = (short)(Parser.integer16() - 1); 
			if (X1 < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X1 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (X2 < 0 || X2 > Textart.canvasSize - 1) { 
			System.out.print("Where should the right edge of the rectangle be? "); 
			X2 = (short)(Parser.integer16() - 1); 
			if (X2 < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X2 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			}
		}
		while (Y1 < 0 || Y1 > Textart.canvasSize - 1) { 
			System.out.print("Where should the top edge of the rectangle be? "); 
			Y1 = (short)(Parser.integer16() - 1); 
			if (Y1 < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y1 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (Y2 < 0 || Y2 > Textart.canvasSize - 1) { 
			System.out.print("Where should the bottom edge of the rectangle be? "); 
			Y2 = (short)(Parser.integer16() - 1); 
			if (Y2 < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y2 > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		System.out.print(Colors.RESET + "What character should be used? ");
		character = Parser.character();
		Colors.list();
		System.out.print(Colors.RESET + "What color should it be?"); 
		color = Parser.color(); 
		
		rect(X1, Y1, X2, Y2, color, character); 
	} 
	
	
	public static final void diamond() { 
		short X = -1, Y = -1; 
		float Xradius = 0, Yradius = 0; 
		char color = 's', character = '#'; 
		while (Xradius < 1 || Xradius > Textart.canvasSize || Xradius > 10000) { 
			System.out.print("How wide should the diamond be (radius/1.75)? "); 
			Xradius = Parser.floating32()*(float)1.75; 
			if (Xradius < 1) { 
				System.out.println("Too small! "); 
			} else if (Xradius > Textart.canvasSize || Xradius > 10000) { 
				System.out.println("Too big! "); 
			} 
		} 
		while (Yradius < 1 || Yradius > Textart.canvasSize || Yradius > 10000) { 
			System.out.print("How tall should the diamond be (radius)? "); 
			Yradius = Parser.floating32(); 
			if (Yradius < 1) { 
				System.out.println("Too small! "); 
			} else if (Yradius > Textart.canvasSize || Yradius > 10000) { 
				System.out.println("Too big! "); 
			} 
		} 
		while (X < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the center of the diamond be (X axis)? "); 
			X = (short)(Parser.integer16() - 1); 
			if (X < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (Y < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the center of the diamond be (Y axis)? "); 
			Y = (short)(Parser.integer16() - 1); 
			if (Y < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		System.out.print(Colors.RESET + "What character should be used? ");
		character = Parser.character();
		Colors.list();
		System.out.print(Colors.RESET + "What color should it be? "); 
		color = Parser.color(); 

		diamond(X, Y, Xradius, Yradius, color, character); 
	} 
	
	
	public static final void circle() { 
		short X = -1, Y = -1; 
		float radius = 0; 
		char color = 's', character = '#'; 
		while (radius < 1 || radius > Textart.canvasSize || radius > 10000) { 
			System.out.print("How big should the circle be (radius)? "); 
			radius = Parser.floating32(); 
			if (radius < 1) { 
				System.out.println("Too small! "); 
			} else if (radius > Textart.canvasSize || radius > 10000) { 
				System.out.println("Too big! "); 
			} 
		} 
		while (X < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the center of the circle be (X axis)? "); 
			X = (short)(Parser.integer16() - 1); 
			if (X < 0) { 
				System.out.println("Out of bounds! "); 
			} else if (X > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		while (Y < 0 || X > Textart.canvasSize - 1) { 
			System.out.print("Where should the center of the circle be (Y axis)? "); 
			Y = (short)(Parser.integer16() - 1); 
			if (Y < 1) { 
				System.out.println("Out of bounds! "); 
			} else if (Y > Textart.canvasSize) { 
				System.out.println("Out of bounds! "); 
			} 
		} 
		System.out.print(Colors.RESET + "What character should be used? ");
		character = Parser.character();
		Colors.list();
		System.out.print(Colors.RESET + "What color should it be? "); 
		color = Parser.color(); 

		circle(X, Y, radius, color, character); 
	} 
	
} 














