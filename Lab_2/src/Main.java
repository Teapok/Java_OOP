public class Main {

	public static void main(String[] args) {
	
		//CreateWindow();
		var r = new Rectangle(3,4);
		r.rect_print();
		r.move(2, 3);
		r.rect_print();
		
		var rec2  = new Rectangle(1, 1, 7, 7);
		var rec3  = new Rectangle(2, 2, 4, 4);
		rec2.Union(rec3).rect_print();
		System.out.print(r.area(rec2.Union(rec3)));
		var w = new Window();
	}

}