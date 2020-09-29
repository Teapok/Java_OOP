import java.awt.Color;
import java.awt.Graphics;

public class DrawableRect extends Rectangle{
	
	public DrawableRect(Color c) {
		outColor = c;
	}
	
	DrawableRect(){
		
	}
	protected Color outColor = Color.black ;
	
	public void SetSize(int x,int y,int w,int h) {
		x1 = x;
		y1 = y;
		x2 = w;
		y2 = h;
	}
	public void draw(Graphics g){
		g.setColor(outColor);
		g.drawRect(x1, y1, x2, y2);
	}
}