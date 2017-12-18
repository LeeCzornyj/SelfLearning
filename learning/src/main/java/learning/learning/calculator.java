package learning.learning;

public class calculator {

	static int[] arrays = {1,2,3,4,5,6,7,8,9,10};

	public static void main(String[] args) {
		//	System.out.println(calc(2, 5, true));
		//outputArrays();
		loopOutput();
	}

	public static void outputArrays() {

		for(int i=0; i<arrays.length;i++) {
			System.out.println(arrays[i]);
		}

	}

	public static int calc(int arg1, int arg2, boolean arg3) {

		int total = 0;
		for(int i = 2; i<10; i++) {
			arg1 = arrays[i-2];
			arg2 = arrays[i-1];
			if(arg3 == true) {
				total = arg1 + arg2;
			}
			else if (arg3 == false) {
				total = arg1*arg2;
			}
			if(arg1 == 0) {
				total = arg2;}

			else if(arg2==0) {
				total = arg1;
			}
			//	System.out.println(total);

		}
		return total;
	}

	public static void loopOutput() {
		for(int i =0; i< arrays.length; i++) {
			arrays[i] = i+1;
			System.out.print(arrays[i]+", ");
		}	
		System.out.println();
		for(int i =0; i< arrays.length; i++) {
			arrays[i] = arrays[i]*10;
			System.out.print(arrays[i]+", ");
		}

	}

}
