package java_20190610;

public class TryCatchFinallyDemo {
	public static double average(int a, int b){
		int sum = a+b; 
	
		return (double)sum/(double)2;
	}
	
	public static void main(String[] args) {
		/*
		if(args.length !=2){
			System.err.println("usage:java TryCatchFinallyDemo [��������][��������]");
			//���� S.O.P�� ����ص� ��������� ������ ��� �޼����� S.E.P �� ��� �ϴ°� ����
			return;
		}
		*/
		//Integer.parseInt()�޼ҵ�� ���ڰ� �ƴ� ���ڿ��� ��� ��, �Ϲ� ���ڿ��� ��� 
		//NumberFormatException ���ܰ� �߻���
		
		try {// ���� ������� ������ ArrayIndexOutOfBoundsException 
			int korean = Integer.parseInt(args[0]);
			//JVM�� ������ ������Ű��, ���� ��ü�� NumberFormayException ��ü�� �������� 
			//Catch ���� ã�´�. 
			int english= Integer.parseInt(args[1]);
			double avg= average(korean,english);
			System.out.printf("��� : %.2f \t",avg);
		} catch (NumberFormatException e) { //Exception�� ���� ��� ���� ���� �̱� ������ �ٷ� ó���Ҽ� �ִ�. 
		
			// JVM�� �����޼��� ����ѰͰ� ���� ������ ���´�.
			e.printStackTrace(); 
			
			System.err.println("���� �޽���: "+e.getMessage());
		
			
			System.err.println("���� ���� ���ڸ� ��");
			
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) { //Exception�� ���� ��� ���� ���� �̱� ������ �ٷ� ó���Ҽ� �ִ�. 
		
			//e.printStackTrace(); 
			//System.err.println("���� �޽���: "+e.getMessage());
			System.err.println("usage:java TryCatchFinallyDemo [��������][��������]"); 
			
			
		}finally {
			//���� ���� �������  ������ �����Ѵ�.  IO(Input Output) Ȥ�� DB(Data Base)���� �ַ� ���δ� ���� ������
			System.out.println("finally block");
			
		} 			
	}
	
	
	
	
}
