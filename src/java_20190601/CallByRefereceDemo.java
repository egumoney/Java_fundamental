package java_20190601;

public class CallByRefereceDemo {
	public static void change(int i,int[] a,String str){
		i = 20;
		a[2]+=3000;	
		str+=  "def";
	}
	
	
	public static void main(String[] args) {
		int i = 10;
		int[] a = {10,20,30,40};
		String tt="abc";
		System.out.println("i: "+i);
		System.out.println(a[2]);
		System.out.println(tt);
		//i�� call by value, a�� call by reference  		
		change(i,a,tt);
		//�� �޼ҵ忡�� ������ i��  Value ���� �������� �ʴ´�. ���� �����ϴ°� �ƴϱ� ����.  a�� �ٲ�� ������ �迭�� �־��� ������ ���۷���(�ּ�)�� �Ѿ�� ���� ��ȯ�� �Ȱ�. 
		
		System.out.println("i:"+i);	
		System.out.println(a[2]);
		System.out.println(tt); // abc�� ���´�. String Ŭ������ �ݹ��� ���۷��� �� �������.   
		
	}
	
	
	
}
