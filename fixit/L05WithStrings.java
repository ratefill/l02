package by.epam.l02.fixit;

/*
Работа со строками
Листинг l5
public class WithStrings {
public static void main(String[] args) {
String str1;
String str2 = "Hello";
String str3 = new String(", world");
String str4 = str2 + str3;
out.println("str2 = " + str2);
out.println("str3 = " + str3);
out.println("str4 = " + str4);
String str;
str = "hello";
int len = str.length();
out.println("str = " + str + "; length=" + len);
String str5="one", str6="one";
if(str5.equals(str6))
{
System.out.println("str5=str6");
}

else
{
System.out.println("str5<>str6");
}
String str7="one", str8="one";
if(str7 == str8)
{
System.out.println("str7=str8");
}
else
{
System.out.println("str7<>str8");
}
String str9=new String("one"), str10=new String("one");
if(str9 == str10)
{
System.out.println("str9=str10");
}
else
{
System.out.println("str9<>str10");
}
}
}
*/

//Работа со строками

public class L05WithStrings
{
	public static void main(String[] args)
	{
		//String str1;
		String str2 = "Hello";
		String str3 = new String(", world");
		String str4 = str2 + str3;
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
		
		String str;
		str = "hello";
		int len = str.length();
		System.out.println("str = " + str + "; length=" + len);
		
		String str5 = "one";
		String str6 = "one";
		
		if (str5.equals(str6))
		{
			System.out.println("str5=str6");
		}
		else
		{
			System.out.println("str5<>str6");
		}
		
		String str7 = "one";
		String str8 = "one";
		if (str7 == str8)
		{
			System.out.println("str7=str8");
		}
		else
		{
			System.out.println("str7<>str8");
		}
		String str9 = new String("one"); 
		String str10 = new String("one");
		if (str9 == str10)
		{
			System.out.println("str9=str10");
		}
		else
		{
			System.out.println("str9<>str10");
		}
	}
}