package java_20190604.step3;

public class StopWatchDemo {// Ŭ���� ���� �ʿ䰡 �־�δ� . ���� �и������ʰ� ���� 3���� 
	
	
	// �������� Start'Nano'Time �� �־��µ� Ŭ���� ���ҷ� ���� �������� ��밡������.
	// ����  ��ž�����ġ ��ž�и���ġ
	//Ŭ���� �и� �������� �������̵� �Ҽ� �ְ� ���� 
	//OOP ù���� �Ϸ�. ������  �ڵ� �ߺ��� ���� �����ִ�... 
	//
	
	public static void main(String[] args) {
		StopMilliWatch sm= new StopMilliWatch();
		sm.start();
		
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		sm.stop();
		System.out.println("����ð�(�и�������):"+sm.getElapsedTime());
		
		StopNanoWatch sn =new StopNanoWatch();
		sn.start();
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		sn.stop();
		System.out.println("����ð�(���뼼����):"+sn.getElapsedTime());
		
		
	}
}
