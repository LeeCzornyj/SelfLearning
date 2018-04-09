package learning.learning;

public class Forloops {

	public void ForLoops() {
		int no = 2;

		for(int i = no; i<=10; i++) {
			System.out.print(i);
			if(i%2==0) {
				System.out.println(" Even ");
			} else {
				System.out.println(" Odd ");
			}

		}

		while(no<=10) {
			System.out.print(no);
			if(no%2==0) {
				System.out.println(" EVEN ");
			} else {
				System.out.println(" ODD ");
			}
			no++;
		}

	}

	public void nestedWhile() {
		int A = 1;
		while(A<=10) {
			int B=1;
			while(B<=10) {
				System.out.println(B);
				B++;
			}
			A++;
		}
	}

	public void nntimes() {
		int n = 1;
		while(n<=10) {
			System.out.println();
			for(int j = 0; j< n; j++) {
				System.out.print(n);
			}
			n++;
		}
	}
	
	public void alternatenntimes() {
		int a = 1;
		while(a<=10) {
			int b = 1;

			while(b<=a) {
				System.out.print(a);
				b++;
			}
			a++;
			System.out.println(	);
		}
	}
	
	public void secondLoopTest() {
		int A,B,C;
		for(A=1,B=10,C=100;A<=10;) {
			System.out.println(A+ "-"+B+"-"+C);
			A++;
			B+=10;
			C+=100;
		}
		System.out.println(A+"-"+B+"-"+C);
		for(A=1;;A++) {
			System.out.println("*");
			if(A==10)break;	
		}
	}
}
