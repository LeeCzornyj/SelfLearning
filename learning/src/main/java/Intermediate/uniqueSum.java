package Intermediate;

public class uniqueSum {

	public static void main(String[] args) {
		uniqueSumMeth(3, 1, 2);
	}
	
	/* 111
	 * 112
	 * 121
	 * 211
	 */
	public static void uniqueSumMeth(int one, int two, int three) {
		int sum =0;
		if((one==two) && (one == three) && (two == three) ) {
			sum = 0;
		}else if ((one == two) && (one != three) && (two !=three)) {
			sum = one*three;
		}else if((one != two) && (one == three) && (two !=three)) {
			sum = one*two;
		}else if((one != two) && (one != three) && (two == three)) {
			sum = one*two;
		}else if((one!=two) && (one!=three) && (two!=three)) {
			sum = one*two*three;
		}
		
		System.out.println(sum);
	}
}
