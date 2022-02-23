package assignment.week1;

public class sumOfDigits {

	public static void main(String[] args) {
		int n = 3755;
		int sum;
		for(sum=0;n!=0;n=n/10)
			{
			sum=sum+n%10;
			}
			System.out.println("sum of digits" + sum);

	}

}
