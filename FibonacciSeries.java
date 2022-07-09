package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n=11,n3;
		
		System.out.print(n1+" "+n2);
		
		for (int i = 0; i <=n; i++) {			
	
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
			
	}
		
		
		
		

	}
}
