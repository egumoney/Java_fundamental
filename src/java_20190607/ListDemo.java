package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		
		//�������� �ߺ��� Ȱ���ϰ�, ������ �����Ѵ�.
		ArrayList<String> list = new ArrayList<String>();
		//�Է�
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		
	
		// input �� add  ||  output�� get //��� get(index) 
		for(int i=0;i<list.size();i++){
			String temp = list.get(i);
			System.out.println(temp);
		}
		
		for(String temp:list){
			System.out.println(temp);
		}
		
		//list.remove(index) //�ش���ǥ����
		//list.clear();//���λ���
		
		list.remove(2); //  0 1 2 �� ���� 
		String temp= list.get(2); // 4 �� ���´� 3�� ���� �Ѵ��� ������ ����Ʈ �Ѵ�. 
		System.out.println(temp);
		
	}
}


