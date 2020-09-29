import java.awt.Color;
import java.awt.Graphics;

public class DrawableRect extends Rectangle{
	
	public DrawableRect(Color c) {
		outColor = c;
	}
	
	DrawableRect(){
		
	}
	protected Color outColor = Color.black ;
	
	public void draw(Graphics g){
		g.setColor(outColor);
		g.drawRect(x1, y1, x2, y2);
	}
}