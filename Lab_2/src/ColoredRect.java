import java.awt.Graphics;

public class ColoredRect extends DrawableRect{
	
	public java.awt.Color inColor ;
	private Graphics gr ;
	ColoredRect(java.awt.Color c){
		inColor = c;
	}
	
	public void draw(Graphics g) {
		gr = g;
		gr.setColor(inColor);
		gr.fillRect(x1, y1, x2, y2);
		gr.setColor(outColor);
		gr.drawRect(x1, y1, x2, y2);
	}
}