package java_20190604.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch sw=new StopWatch();
		sw.start();
		
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		
		sw.stop();
		System.out.println("����ð�(�и�������) : "+sw.getElapsedTime());
		sw.startNano();
		for(int i=0;i<2_000_000_000l;i++){
			
		}
		sw.stopNano();
		
		System.out.println("����ð�(���뼼����):"+sw.getElapsedNanoTime());
	}
}