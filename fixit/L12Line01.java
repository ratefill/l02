package by.epam.l02.fixit;

import java.util.Scanner;

/*public class L12Line01
Составить линейную программу, печатающую значение true, если указанное
высказывание является истинным, и false — в противном случае: в заданном натуральном
трехзначном числе N имеется четная цифра.
public class Line01 {
© EPAM Systems, 2017 Page: 34/41
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number = 0;
int digit = 0;
System.out.print("Введите число: ");
if (sc.hasNextInt())
number = sc.nextInt();
while (number != 0) {
digit = number % 10;
number = number / 10;
if (digit % 2 == 0) {
System.out.println("В числе есть четная цифра.");
return;
}
}
System.out.println("В числе нет четных цифр.");
}
}
*/

/*Составить линейную программу, печатающую значение true, если указанное
высказывание является истинным, и false — в противном случае: в заданном натуральном
трехзначном числе N имеется четная цифра.*/

public class L12Line01
{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{		
		int number = 0;
		int digit = 0;
		System.out.print("Введите число: ");
		if (sc.hasNextInt())
			number = sc.nextInt();
		
		while (number != 0)
		{
			digit = number % 10;
			number = number / 10;
			
			if (digit % 2 == 0)
			{
				System.out.println("В числе есть четная цифра.");
				return;
			}
		}
		System.out.println("В числе нет четных цифр.");
	}
}