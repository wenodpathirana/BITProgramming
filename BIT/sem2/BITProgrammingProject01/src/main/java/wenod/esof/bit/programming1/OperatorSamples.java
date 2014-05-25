package wenod.esof.bit.programming1;

public class OperatorSamples {
	
	public void bitwiseSample(){
		int a = 60; // 60 = 0011 1100
		int b = 13; // 13 = 0000 1101
 		
		int c = a >> 5;
		
		System.out.println("a >>> 5 :" +c);
		
		a&=b;
		
		System.out.println("a &= b :" +a);
	}

}
