package corejava;

public class SwapCharacter {

	// Java Program to Swap characters in a String

	public static String swapCharacters(String s, int B, int C)
		{
			int N = s.length();
			// If c is greater than n
			C = C % N;
			// loop to swap ith element with (i + C) % n th
			// element
			char[] chars = s.toCharArray();
			for (int i = 0; i < B; i++) {
				char temp = chars[i];
				chars[i] = chars[(i + C) % N];
				chars[(i + C) % N] = temp;
			}
			return String.valueOf(chars);
		}

		public static void main(String[] args)
		{
			String s = "ABCDEFGH";
			int B = 4;
			int C = 3;
			s = swapCharacters(s, B, C);
			System.out.println(s);
		}
	
}
