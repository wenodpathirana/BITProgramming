package wenod.esof.bit.programming1;


public class Assignment01PrintStars {
	
	public void printTrangl2(){
		System.out.println("prin trangl1 of stars");
		for(int u=1; u<4;u++){
			for(int v=0;v<u;v++){
				System.out.print("* ");
			}System.out.println(); 
	
		}
	}
	
	public void printTrangle(){
		System.out.println("Print trangle of stars");
		for (int i = 1; i < 6;) {
			for (int k = 6; k>i; k--)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print(i+" ");
			i += 1;
			System.out.println();
		}
	}
	
	public void printSquare(){
		System.out.println("Print trangle of square");
		for (int i = 1; i < 6; i++) {
			
			for (int j = 0; j < i; j++){
				System.out.print("* ");
			}
			System.out.print(" ***  ");
			for (int k = 6; k>i; k--)
				System.out.print("* ");
			System.out.println();
		}
	}

}
