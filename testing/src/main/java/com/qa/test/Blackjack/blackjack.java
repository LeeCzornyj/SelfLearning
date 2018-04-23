package com.qa.test.Blackjack;

public class blackjack {

	public int blackjackMain1(int val1, int val2) {
		int highest = 0;
		if( ((val1<val2) && (val2<=21) && (val2 > 0)) || ((val1>21) && (val2 > 0) && (val2 <= 21)) ) {
			highest = val2;
			System.out.println(highest);
		} else if( ((val2<val1) && (val1<=21) && (val1 > 0)) || ((val2>21) && (val1 > 0) && (val1 <= 21)) ){
			highest = val1;
			System.out.println(highest);
		}else if (val1 == val2 && val1 < 21 || val2 < 21 ){
			highest = val1;
			System.out.println(highest);
		} else if((val1 > 21) && (val2 >21)) {
			System.out.println("0");
		}	
		return highest;
	}
	
	
}
