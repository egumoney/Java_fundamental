package java_20190603;

public class MethodDemo {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int sum = c.plus(10, 20);
		c.p(sum);
		
		sum=c.minus(100, 20);
		c.p(sum);
		
		sum=c.multi(9, 3);
		c.p(sum);
		System.out.println();
		
		
	}
}
