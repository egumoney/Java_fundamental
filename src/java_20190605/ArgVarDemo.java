package java_20190605;

public class ArgVarDemo {
	
	public int sum(int... temp){
		int sum=0; 
		
		for(int value:temp){
			sum += value;
		}
		
		/*	
	 * for(int i=0;i<temp.length;i++){
			sum +=temp[i];
		}
		*/
		//인트 갯수 상관없이 막집어 넣어도된다.
		
		
		return sum;
	}

	public static void main(String[] args) {
		ArgVarDemo d= new ArgVarDemo();
		int a= d.sum(1);
		System.out.println(a);
		
		int b= d.sum(1,2);
		System.out.println(b);
		
		int c=d.sum(10,20,30);
		System.out.println(c);
		
		
		
	}
	
	
}
