package wenod.esof.bit.programming1;

public class PrimitiveSamples {
	
	public void primitiveSamples(){
		//integers (byte, short, int, long)
		int x = 5;
		//floating point numbers (float, double)
		float y = 5.43f;
		
		float z = y + x; //will be a floating point value
		System.out.println("total : " + z);
		//char
		char a = 'a';
		char b = 88;
		
		System.out.println("char b" + b);
		
		//boolean
		boolean c = true;
		boolean d = false;
	}
	
	public void literalSamples(){
		//integer with decimal, octal, hexadecimal
		int x = 0x15; 
		int x2 = 15;
		
		System.out.println("Octal : "+x+" integer : " +x2);
	}
}
