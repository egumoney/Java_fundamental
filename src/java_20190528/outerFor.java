package java_20190528;

public class outerFor {
	public static void main(String[] args) {
	
		tt:for(int j=2;j<=9;j++){
			if(j==3) continue;
			for(int k=1;k<=9;k++){
				if(k==4&&j==5)break tt;
				System.out.println(j+"*"+k+"="+(j*k));
			}			
			System.out.println();
		}
	
	}
}
