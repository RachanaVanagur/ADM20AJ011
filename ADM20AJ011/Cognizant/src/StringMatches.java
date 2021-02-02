
public class StringMatches {

	public static void main(String[] args) {
		String name="Sunil Joseph";
		String pattern = "^[a-zA-Z ]*$";
		boolean isNameValid = name.matches(pattern);
		System.out.println(isNameValid);
		
		System.out.println();
		System.out.println("-----------------------------");
		
		name="Sunil 1Joseph";
		isNameValid = validateName(name);
		System.out.println(isNameValid);
	}

	private static boolean validateName(String name) {
		char[] chars = name.toCharArray();
		for(char c : chars) {
			if(!((c>='A' && c<='Z')||(c>='a' && c<='z') || c==' '))
				return false;
		}
		return true;
	}

}
