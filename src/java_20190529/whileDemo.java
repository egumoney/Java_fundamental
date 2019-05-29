package java_20190529;

public class whileDemo {
	public static void main(String[] args) {
		int j=2;
		int k=1;
		while(j<=9){
			k=1;
			while(k<10){
				System.out.print(j+"X"+k+"="+(j*k)+"\t");
				System.out.print(j+"X"+k+"="+(j*k)+"\t");
				k++;
			}
			System.out.println();
			j++;
				
		}

	}
}
