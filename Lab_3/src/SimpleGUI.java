import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Window.Type;

public class SimpleGUI extends JFrame {
    private JButton btnDraw = new JButton("Draw");
    private JTextField in_x = new JTextField("50", 5);
    private JLabel lblX = new JLabel("X");
    private JRadioButton r_emp = new JRadioButton("Empty");
    private JTextField in_y;
    private JTextField in_y1;
    private JTextField in_x1;
    
    public Color bord_col,inner_col = Color.WHITE;

    public SimpleGUI() {
        super("Петренко Ивт-5");
        setResizable(false);
        setType(Type.UTILITY);
        this.setBounds(100, 100, 220, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        getContentPane().setLayout(null);
        lblX.setHorizontalAlignment(SwingConstants.CENTER);
        lblX.setBounds(46, 11, 46, 25);
        container.add(lblX);
        in_x.setBounds(46, 39, 46, 25);
        container.add(in_x);

        ButtonGroup group = new ButtonGroup();
        group.add(r_emp);
        r_emp.setBounds(0, 148, 92, 25);
        container.add(r_emp);
        btnDraw.setBounds(0, 208, 204, 53);

        btnDraw.addActionListener(new ButtonEventListener ());
        container.add(btnDraw);
        
        JLabel lblY = new JLabel("Y");
        lblY.setHorizontalAlignment(SwingConstants.CENTER);
        lblY.setBounds(102, 11, 46, 25);
        getContentPane().add(lblY);
        
        in_y = new JTextField("50", 5);
        in_y.setBounds(102, 39, 46, 25);
        getContentPane().add(in_y);
        
        JRadioButton r_col = new JRadioButton("Colored");
        r_col.setSelected(true);
        group.add(r_col);
        r_col.setBounds(0, 176, 92, 25);
        getContentPane().add(r_col);
        
        in_y1 = new JTextField("100", 5);
        in_y1.setBounds(102, 103, 46, 25);
        getContentPane().add(in_y1);
        
        in_x1 = new JTextField("100", 5);
        in_x1.setBounds(46, 103, 46, 25);
        getContentPane().add(in_x1);
        
        JLabel lblX_2 = new JLabel("X1");
        lblX_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblX_2.setBounds(46, 75, 46, 25);
        getContentPane().add(lblX_2);
        
        JLabel lblY_2 = new JLabel("Y1");
        lblY_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblY_2.setBounds(102, 75, 46, 25);
        getContentPane().add(lblY_2);
        
        JButton b_outcol = new JButton("Border");
        b_outcol.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		bord_col = JColorChooser.showDialog(null, "Border Collour", Color.BLUE);
        	}
        });
        b_outcol.setBounds(98, 149, 89, 23);
        getContentPane().add(b_outcol);
        
        JButton b_incol = new JButton("Fill");
        b_incol.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		inner_col = JColorChooser.showDialog(null, "Border Collour", Color.ORANGE);
        	}
        });
        b_incol.setBounds(98, 177, 89, 23);
        getContentPane().add(b_incol);
    }

    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        	DrawableRect rctngl;
        	if(r_emp.isSelected()) {
        		rctngl = new DrawableRect();
        	 }
        	else {
        		rctngl = new ColoredRect(inner_col);
        	}
        	
        	rctngl.SetSize(Integer.parseInt(in_x.getText()), Integer.parseInt(in_y.getText()), Integer.parseInt(in_x1.getText()), Integer.parseInt(in_y1.getText()));
    		rctngl.outColor = bord_col;
            DrawRect rect = new DrawRect(rctngl);
            rect.createAndShowGui();
        }
    }
}
