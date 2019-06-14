package java_20190610;

class InsufficientBalceException extends Exception{
	InsufficientBalceException(String msg){
		//Super�� Exception Ŭ���� �Ű����� String�� �����ڸ� ȣ�����ش�.
		//msg�� �����޽����� ����� �������� ����Ѵ�.
		super(msg);
	}
}	

class InCorrectAccountException extends Exception{
	InCorrectAccountException(String msg){
		//
		//
		super(msg);
	}
}	

public class ThrowExceptionDemo {

	public static double withdraw(String account, int amount) throws InsufficientBalceException, InCorrectAccountException{
	
		double balace= 2_000_000;
		String dbAccount ="123-12-123123123";
		
		if(account != null && account.equals(dbAccount)){	
			if(balace - amount >0){//�ܰ� 1�̶� ������� 
				balace -=amount;
			}else{
				throw new InsufficientBalceException ("�ܾ��� �����մϴ�");
			}
		}else{
			throw new InCorrectAccountException("���¹�ȣ�� �߸��Ǿ����ϴ�.");
		}
		return balace;
	}
	
	public static void main(String[] args) {
		double balance;
		try {
			balance = withdraw("123-12-123123123" , 15_000 );
			System.out.println("�ܾ�: "+balance );
		} catch (InsufficientBalceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (InCorrectAccountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		}	
	}	
	
}
