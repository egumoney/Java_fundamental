package java_20190529;

public class st_ex {
	public static void main(String[] args) {
/*		
 		int h=0;
		int a=h++;
		boolean st_Flag=true;
		boolean nd_Flag=true;
		boolean rd_Flag=true;
		 
		System.out.println(a);
		System.out.println(++h);
		System.out.println(h);
		System.out.println(++h);
		System.out.println(!st_Flag);
		
		System.out.println(st_Flag&&st_Flag);
		*/
		
		/* 	 
		for(int i=0;i<100;++i){
			System.out.println(i); 
		}
		*/
/*
		int i=0;
		boolean Flag=false;
		 

		System.out.println(Flag && Flag);
		
*/		
		
		int[] st_bar={1,2,3,4};

		int[] nd_bar=st_bar;

		for(int i=0;i<st_bar.length;i++){	
			System.out.println("배열_st"+st_bar[i]);
			System.out.println("배열_nd"+nd_bar[i]);			
		}
		st_bar[2]=100;
		for(int i=0;i<st_bar.length;i++){	
			System.out.println("배열_st"+st_bar[i]);
			System.out.println("배열_nd"+nd_bar[i]);			
		} 
		
		
		nd_bar[0]=999;
		for(int i=0;i<st_bar.length;i++){	
			System.out.println("배열_st"+st_bar[i]);
			System.out.println("배열_nd"+nd_bar[i]);			
		}

 
		
		
		
	}
}
