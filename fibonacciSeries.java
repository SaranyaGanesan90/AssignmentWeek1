package assignment.week1;

public class fibonacciSeries {

	public static void main(String[] args) {
	  int n=8,num1=0,num2=1,sum;
	  System.out.println("fibonacci series:");
	  System.out.println(num1);
	  System.out.println(num2);
	  for (int i=1;i<=n;i++) {
		  sum = num1 + num2;
		  num1 = num2;
		  num2 = sum;
	System.out.println(sum);				  
	  }

	}

}
