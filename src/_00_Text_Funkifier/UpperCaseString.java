package _00_Text_Funkifier;

public class UpperCaseString extends SpecialString{

	public UpperCaseString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		return s.toUpperCase();
	}

}
