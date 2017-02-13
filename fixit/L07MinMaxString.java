package by.epam.l02.fixit;

import java.util.Scanner;

/*Ввести n строк с консоли, найти самую длинную и самую короткую строки.
Вывести найденные строки и их длины.
public class MinMaxString {
public static void main(String[] args) {
int n = 10;
Scanner sc = new Scanner(System.in);
String max = "", min = "", str = "";
for (int i = 0; i < n; i++) {
System.out.print("> ");
if (sc.hasNextLine()) {
str = sc.nextLine();
if (i == 0) {
min = str;
}
if (str.length() > max.length()) {
max = str;
} else if (str.length() < min.length()) {
min = str;
}
}
}
System.out.println("max string = " + max + " length=" +
max.length());
System.out.println("min string = " + min + " length=" +
min.length());
}
}*/

//Ввести n строк с консоли, найти самую длинную и самую короткую строки.
//Вывести найденные строки и их длины.

public class L07MinMaxString
{
	public static void main(String[] args)
	{
		int n = 10;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String max = "", min = "", str = "";
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("> ");
			if (sc.hasNextLine())
			{
				str = sc.nextLine();
				
				if (i == 0)
				{
					min = str;
					max = str;
				}
				
				if (str.length() > max.length())
				{
					max = str;
				}
				else if (str.length() < min.length())
				{
					min = str;
				}
			}
		}
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
	}
}