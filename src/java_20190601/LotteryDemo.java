package java_20190601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LotteryDemo {

	
	public static String console() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException {
		Lottery lottery=new Lottery();
		while(true){
			System.out.println("로또복권 갯수를 입력하세요>");
			String readLine= console();
			if(readLine.equals("bye"))break;
			int count =Integer.parseInt(readLine);
			lottery.inGame(count);
			
		}
		
	}
	

}

