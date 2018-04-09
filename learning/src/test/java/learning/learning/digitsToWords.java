package learning.learning;

public class digitsToWords {

	//1-99
	public void printNumber(int number) {
		if(number<10) {
			String test1 = getEndNumber(number);
			System.out.println(test1);
		} else if(number >= 20 && number <100) {
			String test1 = getEndNumber(number);
			number = number - number%10;
			String test2 = getFirstNumber(number);
			System.out.println(test2 + " "+test1);
		} else if(number >=10 && number <20) {
			String test1= getTeens(number);
			System.out.println(test1);
		} else if(number >=100 && number <1000) {
			String temp1 = getEndNumber(number/100) + " hundred ";
			System.out.print(temp1);
			int number2 = number%100;
			//System.out.println(number2);
			if(number2<20 && number2 >10) {
				String temp2 = getTeens(number2);
				System.out.print(temp2);
			}else {
				int number3 = number2 -number2%10;
				String temp2 = getFirstNumber(number3);
				System.out.print(temp2 + " ");
				String temp3 = getEndNumber(number2%10);
				System.out.println(temp3);
			}
		}
	}

	private String getEndNumber(int number){
		int temp;
		String temp2 = ""; 
		if(number>19 || number <10) {
			temp = number%10;
			switch(temp) {
			case 1: temp2 = "One";break;
			case 2: temp2 ="Two";break;
			case 3: temp2 = "Three";break;
			case 4: temp2 = "Four";break;
			case 5:	temp2 ="Five";break;
			case 6: temp2 = "Six";break;
			case 7:	temp2 = "Seven";break;
			case 8: temp2 = "Eight";break;
			case 9:	temp2 = "Nine";break;
			default:temp2 = "";
			}
		}
		return temp2;
	}

	private String getFirstNumber(int number) {
		int temp = number/10;
		String temp2;
		switch(temp) {
		case 2: temp2 = "Twenty";break;
		case 3:	temp2 ="Thirty";break;
		case 4: temp2 = "Fourty";break;
		case 5: temp2 = "Fifty";break;
		case 6: temp2 ="Sixty";break;
		case 7: temp2 = "Seventy";break;
		case 8: temp2 = "Eighty";break;
		case 9: temp2 = "Ninety";break;
		default:temp2="";break;
		}
		return temp2;
	}
	
	private String getTeens(int number) {
		String temp2 = "";
		switch(number){
		case 10: temp2 = "Ten";break;
		case 11: temp2 = "Eleven";break;
		case 12: temp2 = "Twelve";break;
		case 13: temp2 = "Thirteen";break;
		case 14: temp2 = "Fourteen";break;
		case 15: temp2 = "Fifteen";break;
		case 16: temp2 = "Sixteen";break;
		case 17: temp2 = "Seventeen";break;
		case 18: temp2 = "Eighteen";break;
		case 19: temp2 = "Nineteen";break;
		}		
		return temp2;
	}
	
}