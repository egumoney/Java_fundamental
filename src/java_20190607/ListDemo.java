package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		
		//데이터의 중복을 활용하고, 순서를 관리한다.
		ArrayList<String> list = new ArrayList<String>();
		//입력
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
	
		// input 은 add  ||  output은 get //출력 get(index) 
		for(int i=0;i<list.size();i++){
			String temp = list.get(i);
			System.out.println(temp);
		}
		
		for(String temp:list){
			System.out.println(temp);
		}
		
		//list.remove(index) //해당좌표삭제
		//list.clear();//전부삭제
		
		list.remove(2); //  0 1 2 로 시작 
		String temp= list.get(2); // 4 가 나온다 3을 삭제 한다음 공란은 쉬프트 한다. 
		System.out.println(temp);
		
	}
}


