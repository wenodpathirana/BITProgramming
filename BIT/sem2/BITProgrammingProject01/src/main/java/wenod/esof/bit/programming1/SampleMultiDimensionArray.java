package wenod.esof.bit.programming1;

public class SampleMultiDimensionArray {
	
	
	public void putValuesToArray(){
		
		int[][] a = new int[5][5];
		
		a[0][0] = 1;
		
		for(int i = 0; i<5;i++){
			//a[i][0] = i+1;
			for (int j = 0;j<5;j++){
				a[j][i]=5*i+j+1;
			}
		}
		System.out.println(a[0][0]);
	}

}
