/**
 * 
 */

/**
 * @author Bad Taste
 * greetz in different languages
 */
public class foo {

	/**
	 * Greets 
	 * @param languages chosen language
	 * @param repetitions how many times repeat greet
	 * @return a String with the greeting
	 */
	public String greet_method (int languages, int repetitions) {
		String result = "";
		String greet = "";

		greet = getGreet(languages, greet);

		// Repeat greet repetitions times
		for (int i =0;i <repetitions;i ++) {
			result += greet;
		}
		
		return result;
	}

	/**
	 *
	 * @param languages chosen language
	 * @param greet String where will be saved the String
	 * @return the String with the greeting
	 */
	private String getGreet(int languages, String greet) {
		switch (languages) {
			case 0 : greet = "hola";
					 break;
			case 1 : greet = "hello";
					 break;
			case 2 : greet = "kaixo";
			 		 break;
			 default:
				 	 break;
		 }
		return greet;
	}
}
