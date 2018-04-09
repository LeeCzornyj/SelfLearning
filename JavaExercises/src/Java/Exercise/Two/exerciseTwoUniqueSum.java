package Java.Exercise.Two;

public class exerciseTwoUniqueSum {

	int no;	

	public void correctSum(int one, int two, int three	) {
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
