package week1day4;

public class Calculator {
	public void addTwoNumbers(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subtractTwoNumbers(int e, int f) {
		int d=e-f;
		System.out.println(d);
	}
	public void multiplyTwoNumbers(double i, double j) {
		double g=i*j;
		System.out.println(g);	
	}
	public void divideTwoNumbers(float x, float y) {
		float z=x/y;
		System.out.println(z);
	}
	
	
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addTwoNumbers(6, 7);
		calc.subtractTwoNumbers(10, 5);
		calc.multiplyTwoNumbers(12.5, 6.2);
		calc.divideTwoNumbers(37.5f, 5.50f);
		
		
		
		
	
		

	}

}
