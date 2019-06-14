package java_20190610;

public class TryCatchFinallyDemo {
	public static double average(int a, int b){
		int sum = a+b; 
	
		return (double)sum/(double)2;
	}
	
	public static void main(String[] args) {
		/*
		if(args.length !=2){
			System.err.println("usage:java TryCatchFinallyDemo [국어점수][영어점수]");
			//보통 S.O.P를 사용해도 상관없지만 에러성 경고 메세지는 S.E.P 를 사용 하는게 좋다
			return;
		}
		*/
		//Integer.parseInt()메소드는 숫자가 아닌 문자열일 경우 즉, 일반 문자열일 경우 
		//NumberFormatException 예외가 발생됨
		
		try {// 값을 집어넣지 않으면 ArrayIndexOutOfBoundsException 
			int korean = Integer.parseInt(args[0]);
			//JVM은 실행을 중지시키고, 예외 객체인 NumberFormayException 객체를 생성한후 
			//Catch 블러을 찾는다. 
			int english= Integer.parseInt(args[1]);
			double avg= average(korean,english);
			System.out.printf("평균 : %.2f \t",avg);
		} catch (NumberFormatException e) { //Exception을 넣을 경우 가장 상위 이기 때문에 바로 처리할수 있다. 
		
			// JVM이 에러메세지 출력한것과 같은 문구가 나온다.
			e.printStackTrace(); 
			
			System.err.println("예외 메시지: "+e.getMessage());
		
			
			System.err.println("문자 말고 숫자를 너");
			
			// TODO: handle exception
		} catch (ArrayIndexOutOfBoundsException e) { //Exception을 넣을 경우 가장 상위 이기 때문에 바로 처리할수 있다. 
		
			//e.printStackTrace(); 
			//System.err.println("예외 메시지: "+e.getMessage());
			System.err.println("usage:java TryCatchFinallyDemo [국어점수][영어점수]"); 
			
			
		}finally {
			//예외 유무 상관없이  무조건 실행한다.  IO(Input Output) 혹은 DB(Data Base)에서 주로 쓰인다 열고 닫을때
			System.out.println("finally block");
			
		} 			
	}
	
	
	
	
}
