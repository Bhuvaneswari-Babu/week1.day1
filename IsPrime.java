package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n=17;
		int count=0;
				for (int i = 2; i < n-1; i++) {
			if(n%i==0)//13/2
			{
				count++;								
		}
				}
			if(count==2) 
				System.out.println(n+" "+"is not a prime number");
			else
				System.out.println(n+" " +"is a prime number");
		
	}
	
	
}

			

			
				

