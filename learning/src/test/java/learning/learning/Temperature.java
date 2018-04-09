package learning.learning;

public class Temperature {

	int no;	

	public void isTempRight(int arg1) {

		no = arg1;
		if(no>1000) {
			System.out.println("A");
			if(no>5000) {
				System.out.println("E");
				if(no>10000) {
					System.out.println("F");
					if(no>12000) System.out.println("J");
				}else {
					System.out.println("G");
					if(no>9000) {
						System.out.println("H");						
					}else {
						System.out.println("I");
					}
				}
			}
		} else {
			System.out.println("B");
			if(no>500) {
				System.out.println("C");
				System.out.println("2");
				if(no>700) {
					System.out.println("M");
				}else {
					System.out.println("N");
				}
			} else {
				System.out.println("D");
				if(no<50) {
					System.out.println("K");
				} else {
					System.out.println("L");
				}
			}
		}
	}
}

