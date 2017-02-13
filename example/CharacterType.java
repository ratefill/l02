package by.epam.l02.example;

public class CharacterType
{
	public static void main(String[] args)
	{
		char c = '9';
		Character ch = new Character(c);		
		System.out.println("charValue() - " + ch.charValue());
		System.out.println("isJavaIdentifierStart? - " + Character.isJavaIdentifierStart(c));
		System.out.println("isLetter? - " + Character.isLetter(c));
		System.out.println("digit for 12 - " + Character.forDigit(14, 16));
	}
}
