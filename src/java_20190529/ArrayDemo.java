package java_20190529;

public class ArrayDemo {
	public static void main(String[] args) {
		//int 배열 생성
		int[] test = new int[4];
		//배열 할당  
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
		 //배열의 생성과 할당을 동시에 하는 방법 
		
		int[] test1={100,200,300,400};
		
		int a = test1[1];// 테스트 1 즉 2번쨰 값을 가져온다 0이 첫번째 
		
		int index=0;
		
		test[index++]=index;
		test[index++]=index;
		test[index++]=index;
		test[index++]=index;

		//배열츌력
		for(int i=0;i<test.length;i++){
			// test[i]=i;// 배열할당은 이미7~11 라인에서 완료됨
			System.out.println(test[i]);
		}
		
		
		for (int temp:test1)
		System.out.println("콜론 퍼문 출력값:"+temp);
		
		//test2는 test1의 참조변수가 가르키는 배열과 같은 곳을 참조한다 
		int[] test2 = test1;
		
		
		//test2[3] 의 값을 변경하면  test1[3]의 값고 변경된다.
		//왜냐하면 test1과 test2의 참조변수가 가르키는 배열이 같기 때문이다.
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
			System.out.println("i값:"+i);
		}
		*/
		/*
		for(int value[]:test4){
			for(int temp:value){
				System.out.print(temp+"\t");
			}
			System.out.println("i값:" );
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
