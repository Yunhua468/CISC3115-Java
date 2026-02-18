
public class ClassExampleisCapitalized {
	public static void main(String[] args) { 
		if (args.length == 0) {
			System.err.println("Usage: java Max <numbers>");
			return;
			}
	}
	
	public static boolean isCapitalized(String str) {
		// The null, meaning that it doesn’t reference an object. 
		// The empty string, an object that exists. 
		//if (str.isEmpty() || str == null) { // wrong
		
		if (str == null || str.isEmpty()) {
			return Character.isUpperCase(str.charAt(0));
		}
		return Character.isUpperCase(str.charAt(0));
	}

}
