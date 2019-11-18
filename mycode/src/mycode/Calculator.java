package mycode;

public class Calculator {
	public int add(int num1,int num2) {
		int r= num1+num2;
		return r;
	}
	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.add(3, 3);
		
	}

}
