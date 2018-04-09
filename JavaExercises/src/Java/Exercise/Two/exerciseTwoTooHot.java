package Java.Exercise.Two;

public class exerciseTwoTooHot {

	public boolean tooHot(int temperature, boolean isSummer) {
		if(isSummer == false) {
			if(temperature>60 && temperature<=90) {
				isSummer = true;
			}

		} else if(isSummer == true) {
			if(temperature >60 && temperature <=100) {
				isSummer = true;
			} else {
				isSummer = false;
			}
		}
		return isSummer;
	}
}