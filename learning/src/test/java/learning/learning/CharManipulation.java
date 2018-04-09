package learning.learning;

public class CharManipulation {

	public void printMessage(String M) {
		for(int i=0; i < M.length(); i++) {
			System.out.println(M.substring(i, i+1));
		}
	}

	public void printMessageReverse(String M) {
		for(int i = M.length()-1; i>=0; i--) {
			System.out.println(M.substring(i,i+1));
		}
	}
	//Hello everyone im a happy man
	public void printWordCount(String M) {
		int count = 1;
		for(int i = 0; i < M.length(); i++) {
			if((M.substring(i,i+1).equals(" ")) && (!M.substring(i+1, i+2).equals(" "))) {
				count++;
			}
		}
		System.out.println(count);
	}
	public void printWordsNewLine(String M) {
		int startIndex = -1;
		for(int i = 0; i < M.length(); i++) {
			if(M.substring(i,i+1).equals(" ")){ 
				System.out.println(M.substring(startIndex+1,i));
				startIndex = i;
			} else if (i == M.length()-1) {
				System.out.println(M.substring(startIndex+1, M.length()));
			}
			//			if(M.substring(i,i+1).equals(" ")) {
			//				System.out.println(M.substring(startIndex, i));
			//				startIndex = i + 1;
			//			}
		}
		//System.out.println(M.substring(startIndex, M.length()));
	}

	//hello my friends
	public void printWordsNewLineReverse(String M) {
		int startIndex = M.length();
		for(int i = M.length()-1; i >= 0; i--) {
			if(M.substring(i,i+1).equals(" ")) {
				System.out.println(M.substring(i+1, startIndex));
				startIndex = i;
			}
		}
		System.out.println(M.substring(0, startIndex));
	}
}


