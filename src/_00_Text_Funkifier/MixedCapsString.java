package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char [] chars = s.toCharArray();
		chars[0] = Character.toLowerCase(chars[0]);
		for(int i = 1; i < chars.length; i += 2)
		{
			if(Character.isUpperCase(chars[i]))
				chars[i] = Character.toLowerCase(chars[i]);
			else if(Character.isLowerCase(chars[i]))
				chars[i] = Character.toUpperCase(chars[i]);
		}
		return new String(chars);
	}

}
