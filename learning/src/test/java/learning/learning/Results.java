package learning.learning;

public class Results {

	private int Phy, Chem, Math, count;
	private float det,total;
	private float oldDet, oldTotal;
	private boolean Imath, Iphys, Ichem;

	public void showResults(int phs, int che, int mat, String name) {
		if(phs >=0 && phs <=150 && che >=0 && che <=150 && mat <=150 && mat >=0) {
			oldTotal = phs+che+mat;
			oldDet=oldTotal*100/450;
			System.out.println(name + " has a total score of " + oldTotal);
			System.out.println(name+ " has a total percentage of " + oldDet);
		} else {
			System.out.println("Check your entries for " + name);
		}

	}

	public void physics(int a) {
		if(a >= 0 && a <=150) {
			Phy = a;
		} else {
			System.out.println("Invalid data entry");
			Iphys = true;
		}
		if(Phy < 60) count++;
	}

	public void chemistry(int a) {
		if(a >= 0 && a <=150) {
			Chem = a;
		} else {
			System.out.println("Invalid data entry");
			Ichem = true;
		}
		if(Chem < 60) count++;	
	}

	public void Mathematics(int a) {
		if(a >= 0 && a <=150) {
			Math = a;
		} else {
			System.out.println("Invalid data entry");
			Imath = true;
		}
		if(Math < 60) count++;
	}

	private void Calculation() {

		total = Math + Chem + Phy;
		det = total *100/450;
	}

	public void stateOfResit() {
		if(Ichem == false && Imath == false && Iphys == false) {
			if(count == 3) {
				System.out.println("GO HOME");
			} else if(count == 2) {
				System.out.println("Repeat the course");
			} else if(count == 1) {
				System.out.println("Resit the exam");
			} else if(count ==0) {
				System.out.println("CONGRATULATIONS YOU'VE PASSED");
				Calculation();
				System.out.println("Total marks: "+ total);
				System.out.println("Total percentage: "+ det);
			}
		}
	}



}
