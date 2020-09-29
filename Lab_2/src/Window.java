import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Window extends JFrame{
		Window(){
	        setSize(300, 400);
	        setTitle("Lab_2");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }
		
	    public void paint(Graphics g) 
	    {
	    	var cr = new ColoredRect(Color.orange);
	    	cr.outColor = Color.BLUE;
	    	cr.SetSize(50,50,100,100);
			cr.draw(g);
	    }
	}