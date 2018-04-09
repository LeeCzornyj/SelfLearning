package learning.learning;

public class MultidimensionArrays {

	public void multiArray1() {
		
		int[][] multiarray = {{0,1,2},{1,2,3},{2,3,4}};
		for(int[] a : multiarray) {
			for(int b : a) {
				System.out.print(b);
			}
			System.out.println();
		}		
	}
}
