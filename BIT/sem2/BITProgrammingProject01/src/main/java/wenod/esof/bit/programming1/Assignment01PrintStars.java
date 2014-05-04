package wenod.esof.bit.programming1;


public class Assignment01PrintStars {
	
	public void printTrangle(){
		System.out.println("Print trangle of stars");
		for (int i = 1; i < 6; i++) {
			/*for (int k = 6; k>i; k--)
				System.out.print(" ");*/
			for (int j = 0; j < i; j++)
				System.out.print("* ");
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
