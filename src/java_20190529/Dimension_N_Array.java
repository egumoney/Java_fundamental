package java_20190529;

public class Dimension_N_Array {
	public static void main(String[] args) {
		/*
		 
		
		int[][] test4= {{10,20,30,},{40,50,60}};	
		 	
		for(int i=0;i<test4.length;i++){
			for(int temp:test4[i]){
				System.out.print(temp+"\t");
			}
			System.out.println("i��:"+i);
		}
		*/
		/*
		for(int value[]:test4){
			for(int temp:value){
				System.out.print(temp+"\t");
			}
			System.out.println("i��:" );
		}
		*/ 
		int first_Dimension [][][]=
			{
					{
						{9,8,7,6},
						{9,8,7,6},
						{0,1,2,3}
					},
					{
						{9,8,7,6},
						{9,8,7,6},
						{0,1,2,3}
					},
					{
						{9,8,7,6},
						{9,8,7,6},
						{0,1,2,3}
					}
			 };
	
		int second_Dimension [][][]=first_Dimension;
		/*	
		first_Dimension[0][1]=3;
		
		second_Dimension[1][1]=3;
	*/	
		

		for(int temp[][] :second_Dimension ){
			for(int value[]:temp){
				for(int index:value){
					System.out.print(index+"\t");	
				}
				System.out.println();
			}
			System.out.println("���� ��������");
		}
		for(int temp[][] :first_Dimension ){
			for(int value[]:temp){
				for(int index:value){
					System.out.print(index+"\t");	
				}
				System.out.println();
			}
			System.out.println("���� �۽�Ʈ������");
		}
		
		second_Dimension [0][2][0]=100;
		
		first_Dimension [0][2][0]=100;
		
		System.out.println(first_Dimension[0][2]);
		second_Dimension [0][0][1]=100;
		
		first_Dimension [0][0][1]=100;
		 
		for(int temp[][] :second_Dimension ){
			for(int value[]:temp){
				for(int index:value){
					System.out.print(index+"\t");	
				}
				System.out.println();
			}
			System.out.println("�۽�Ʈ���� ��");
		}
		for(int temp[][] :first_Dimension ){
			for(int value[]:temp){
				for(int index:value){
					System.out.print(index+"\t");	
				}
				System.out.println();
			}
			System.out.println("��������� ��");
		}
		 
		
	}
}
