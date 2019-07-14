package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char [] chars = new char[s.length()];
		for(int i = 0; i < s.length(); i++)
		{
			chars[i] = s.charAt(s.length() -1 - i);
		}
		return new String(chars);
	}

}
