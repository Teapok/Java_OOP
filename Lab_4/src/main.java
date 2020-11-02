import java.io.IOException;

public class main {
	
	public static void main (String [] args) {  
		//1
		StrOpr.First("I like Java!!!");
		//2
		var input_2 = "D:\\Workspace\\Labs\\OOP\\lab_4\\Lab_4\\bin\\TextFile.txt";
		try {
			StrOpr.Second(input_2, "Object-oriented programming");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3
		var input_3 = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
		StrOpr.Third(input_3,"Java");
		//4
		var input_4 = "fffff ab f 1234 jkjk";
		StrOpr.Fourth(input_4);
		//5
		var input_5 = "One two three раз два три one1 two2 123";
		StrOpr.Fifth(input_5);
		//6
		var input_6 = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
		StrOpr.Sixth(input_6);
	}
}
