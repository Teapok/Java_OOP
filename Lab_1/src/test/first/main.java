package test.first;

public class main {
	public static void main (String [] args) {   
		//args = new String[] {"123","one more"};
		//#1
        for (String argument : args) {     
		System.out.print(argument);
		}
        //#2
        FizBuz();
        //#3
        System.out.print(MyReverse("make install")); 
        //#4
        Fibonachi(20);
        //5
        System.out.print(Fact(4));
        //#6
        Resheto(99);
    }
	
	private static void Resheto(int count) {
		  var a = new int[count + 1];
		  for (int i = 0; i < count + 1; i++)
		    a[i] = i;
		  for (int p = 2; p < count + 1; p++)
		  {
		    if (a[p] != 0)
		    {
		    	System.out.print(a[p]+"\n");
		      for (int j = p*p; j < count + 1; j += p)
		        a[j] = 0;
		    }
		  }
	}

	public static void FizBuz() {
		for(int i = 1; i<=500;i++) {
			if(i%5==0) System.out.print("Fizz");
			if(i%7==0) System.out.print("Buzz");
			if(i%5!=0 && i%7!=0) System.out.print(i);
			System.out.print("\n");
		}
	}
	
	public static String MyReverse(String word) {
		String out = "";
		for(int i = 11;i >=0; i--) {
			out += word.charAt(i);
		}
		return out;
	}
	
	private static void Fibonachi(int count) {
		int[] f = new int[count];
		f[0] = 0;
		f[1] = 1;
		System.out.print("0 0 1 ");
		for (int i = 2; i < count; ++i) {
		    f[i] = f[i - 1] + f[i - 2];
		    System.out.print(f[i] + " ");
		}
		
	}
	
	private static int Fact(int N) {
		if(N < 0)
	        return 0;
	    if (N == 0)
	        return 1;
	    else
	        return N * Fact(N - 1);
		
	}
}
