import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class DrawRect extends JPanel {
    private static DrawableRect rctngl;
    
    public DrawRect(DrawableRect rctngl) {
		this.rctngl = rctngl;
	}

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        rctngl.draw(g);
        // draw the rectangle here
        //g.drawRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
    }

    @Override
    public Dimension getPreferredSize() {
        // so that our GUI is big enough
        return new Dimension(rctngl.x2 + 2 * rctngl.x1, rctngl.y2 + 2 * rctngl.y1);
    }

    // create the GUI explicitly on the Swing event thread
    public void createAndShowGui() {
        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
