package java_20190610;

class InsufficientBalceException extends Exception{
	InsufficientBalceException(String msg){
		//Super는 Exception 클라스의 매개변수 String인 생성자를 호출해준다.
		//msg는 예러메시지를 출력할 목적으로 사용한다.
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
			if(balace - amount >0){//잔고가 1이라도 있을경우 
				balace -=amount;
			}else{
				throw new InsufficientBalceException ("잔액이 부족합니다");
			}
		}else{
			throw new InCorrectAccountException("계좌번호가 잘못되었습니다.");
		}
		return balace;
	}
	
	public static void main(String[] args) {
		double balance;
		try {
			balance = withdraw("123-12-123123123" , 15_000 );
			System.out.println("잔액: "+balance );
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
