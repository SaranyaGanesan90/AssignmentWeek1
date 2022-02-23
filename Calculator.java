package assignment.week1;

public class Calculator {

	public int addThreeNumbers(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public int subTwoNumbers(int num1, int num2) {
		return num1-num2;
	}
	public double mulTwoNumbers(double num1, double num2) {
		return num1*num2;
	}
	public float divTwoNumbers(float num1, float num2) {
		return num1/num2;
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.addThreeNumbers(10, 20,30));
		System.out.println(obj.subTwoNumbers(25, 20));
		System.out.println(obj.mulTwoNumbers(15, 20));
		System.out.println(obj.divTwoNumbers(15F, 20F));
	}
}
