package java_20190529;

public class ArrayDemo {
	public static void main(String[] args) {
		//int �迭 ����
		int[] test = new int[4];
		//�迭 �Ҵ�  
		/*
	  	test[0]=1;
		test[1]=2;
		test[2]=3;
		test[3]=4;	 
		*/
		
/*
		int index=0;
		
		test[index++]=index;
		test[index++]=index;
		test[index++]=index;
		test[index++]=index;

		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		System.out.println(test[3]);
*/		
		 //�迭�� ������ �Ҵ��� ���ÿ� �ϴ� ��� 
		
		int[] test1={100,200,300,400};
		
		int a = test1[1];// �׽�Ʈ 1 �� 2���� ���� �����´� 0�� ù��° 
		
		int index=0;
		
		test[index++]=index;
		test[index++]=index;
		test[index++]=index;
		test[index++]=index;

		//�迭����
		for(int i=0;i<test.length;i++){
			// test[i]=i;// �迭�Ҵ��� �̹�7~11 ���ο��� �Ϸ��
			System.out.println(test[i]);
		}
		
		
		for (int temp:test1)
		System.out.println("�ݷ� �۹� ��°�:"+temp);
		
		//test2�� test1�� ���������� ����Ű�� �迭�� ���� ���� �����Ѵ� 
		int[] test2 = test1;
		
		
		//test2[3] �� ���� �����ϸ�  test1[3]�� ���� ����ȴ�.
		//�ֳ��ϸ� test1�� test2�� ���������� ����Ű�� �迭�� ���� �����̴�.
		test1[3]=4000;
		
		System.out.println(test1[3]);
		System.out.println(test2[3]);
		
		/*
		int[][] test3= new int [2][3];
		test3[0][0]=10; 
		test3[0][1]=20; 
		test3[0][2]=30; 
		test3[1][0]=40; 
		test3[2][0]=50; 
		test3[3][0]=60; 
		*/
		
		int[][] test4= {{10,20,30},{40,50,60}};		
		/*	
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
		
		int[] test5 = new int[8];
		System.arraycopy(test1, 0, test5 , 0, 4);
		
		test5[4]=500;
		test5[5]=600;
		test5[6]=700; 
		test5[7]=800; 
		
		for(int i : test5){
			System.out.println(i);
		}
		
	}
}
