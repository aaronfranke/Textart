
package textart; 

public class Shapes { 
	
	public static final void copy(short X1, short Y1, short X2, short Y2, short X3, short Y3) { 
		int endX = X3 + (X2 - X1), endY = Y3 + (Y2 - Y1); 
		
		for (short currentY = Y1; currentY <= Y2; currentY++) { 
			for (short currentX = X1; currentX <= X2; currentX++) { 
				Textart.canvasBuffer[currentY - Y1][currentX - X1] = Textart.canvasColor[currentY][currentX]; 
			} 
		} 
		
		for (short currentY = Y3; currentY <= endY; currentY++) { 
			for (short currentX = X3; currentX <= endX; currentX++) { 
				Textart.canvasColor[currentY][currentX] = Textart.canvasBuffer[currentY - Y3][currentX - X3]; 
			} 
		} 
		
		for (short currentY = Y1; currentY <= Y2; currentY++) { 
			for (short currentX = X1; currentX <= X2; currentX++) { 
				Textart.canvasBuffer[currentY - Y1][currentX - X1] = Textart.canvasCharacter[currentY][currentX]; 
			} 
		} 
		
		for (short currentY = Y3; currentY <= endY; currentY++) { 
			for (short currentX = X3; currentX <= endX; currentX++) { 
				Textart.canvasCharacter[currentY][currentX] = Textart.canvasBuffer[currentY - Y3][currentX - X3]; 
			} 
		} 
	} 
	
	public static final void point(short X, short Y, char color, char character) { 
		Textart.canvasColor[Y][X] = color; 
		Textart.canvasCharacter[Y][X] = character; 
	} 
	
	public static final void square(short X, short Y, short size, char color, char character) { 
		for (int currentY = Y; currentY < Y + size; currentY++) { 
			for (int currentX = X; currentX < X + size*1.75; currentX++) { 
				Textart.canvasColor[currentY][currentX] = color; 
				Textart.canvasCharacter[currentY][currentX] = character; 
			} 
		} 
	} 
	
	public static final void rect(short X1, short Y1, short X2, short Y2, char color, char character) { 
		for (short currentY = Y1; currentY <= Y2; currentY++) { 
			for (short currentX = X1; currentX <= X2; currentX++) { 
				Textart.canvasColor[currentY][currentX] = color; 
				Textart.canvasCharacter[currentY][currentX] = character; 
			} 
		} 
	} 
	
	public static final void diamond(short X, short Y, float Xradius, float Yradius, char color, char character) { 
		short startY = (short)(Y - Math.round(Yradius+1)); 
		short startX = (short)(X - Math.round(Xradius+1)); 
		float radius = 0, radiusBig = 0;
		if (Xradius*1.75 < Yradius) { 
			radius = Xradius; 
			radiusBig = Yradius; 
		} else { 
			radius = Yradius; 
			radiusBig = Xradius; 
		} 
		if (startY < 0) { 
			startY = 0; 
		} 
		if (startX < 0) { 
			startX = 0; 
		} 
		for (short currentY = startY; currentY <= Y + 1 + Yradius; currentY++) { 
			for (short currentX = startX; currentX <= X + 1 + Xradius; currentX++) { 
				//System.out.println(Math.sqrt((currentY-Y)*(currentY-Y)+(currentX-X)*(currentX-X))); 
				//System.out.println(currentX + " x " + currentY + " " + X + " " + Y); 
				if (Math.abs((currentY-Y))*Xradius+Math.abs((currentX-X))*Yradius < radius*radius*(radiusBig/radius)) { 
					Textart.canvasColor[currentY][currentX] = color; 
					Textart.canvasCharacter[currentY][currentX] = character; 
				} 
			} 
		} 
	} 
	
	public static final void circle(short X, short Y, float radius, char color, char character) { 
		short startY = (short)(Y - Math.round(radius+1)); 
		if (startY < 0) { 
			startY = 0; 
		} 
		short startX = (short)(X - Math.round(radius+1)*1.75); 
		if (startX < 0) { 
			startX = 0; 
		} 
		for (short currentY = startY; currentY <= Y + 1 + radius; currentY++) { 
			for (short currentX = startX; currentX <= X + 1 + radius*1.75; currentX++) { 
				//System.out.println(Math.sqrt((currentY-Y)*(currentY-Y)+(currentX-X)*(currentX-X))); 
				//System.out.println(currentX + " x " + currentY + " " + X + " " + Y); 
				if (Math.sqrt((currentY-Y)*(currentY-Y)+((currentX-X)/1.75)*((currentX-X)/1.75)) < radius) { 
					Textart.canvasColor[currentY][currentX] = color; 
					Textart.canvasCharacter[currentY][currentX] = character; 
				} 
			} 
		} 
	} 
} 









