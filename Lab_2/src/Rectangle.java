public class Rectangle {
	    protected int x1,y1;
		protected int x2,y2;
	    
	    public Rectangle(int x1, int y1, int x2 , int y2) {
	    	this.x1 = x1;
	    	this.y1 = y1;
	    	this.x2 = x2;
	    	this.y2 = y2;
	    }
	    
	    public Rectangle(int x2 , int y2) {
	    	this.x1 = 0;
	    	this.y1 = 0;
	    	this.x2 = x2;
	    	this.y2 = y2;
	    }
	    
	    public Rectangle() {
	    	x1 = 0;	y1 = 0;
	    	x2 = 0; y2 = 0;
	    }
	    public void rect_print() {
	    System.out.print("x1 y1 =(" + x1+" , "+ y1 + ")" + " x2 y2 =(" + x2+" , "+ y2 + ")\n");
	    }
	    
	    public void move (int dx, int dy) {
	    	x1 += dx; x2 +=dx;
	    	y1 += dy; y2 +=dy;
	    }
	    
	    public Rectangle Union(Rectangle r) {
	    	var r1 = new java.awt.Rectangle(x1,y1,x2,y2);
	        var r2 = new java.awt.Rectangle(r.x1,r.y1,r.x2,r.y2);
	        var tmp = r1.intersection(r2);
	        return new Rectangle(tmp.x,tmp.y,tmp.width,tmp.height);
	    }
	    
	    public int area(Rectangle r) {
	    	//S = |x2 - x1| * |y2 - y1|
	    	return Math.abs(r.x2-r.x1) * Math.abs(r.y2-r.y1);
	    }

}
