package learning.learning;

public class timeTable {

	public void printTimesTable(int Table) {

		System.out.println("Times table of: " + Table);
		System.out.println("------------------------");
		for(int i = 1;i<=10;i++) {
			System.out.println(Table + " x " + i + " = " + Table*i);
		}
	}
	public void printTimesTable2(int Table, int Range) {	
		System.out.println("Times table of: " + Table);
		System.out.println("------------------------");
		for(int i = 1;i<=Range;i++) {
			System.out.println(Table + " x " + i + " = " + Table*i);
		}
	}
	public void printTimesTable3(int table, int range) {

		for(int i = table; i <= range; i++) {
			System.out.println("Times table of: " + i);
			System.out.println("------------------------");
			for(int j=1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}

	public void printTimesTable4(int table, int range) {

		for(int i = table; i >= range; i--) {
			System.out.println("Times table of: " + i);
			System.out.println("------------------------");
			for(int j=1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}


}
