package by.epam.l02.fixit;

import java.util.Scanner;

/*—оставить линейную программу, печатающую значение true, если указанное
высказывание €вл€етс€ истинным, и false Ч в противном случае: квадрат заданного
трехзначного числа равен кубу суммы цифр этого числа.
public class Line03 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number = 0;
int sumDigitNumber = 0;
int kv_number;
int kub_number;
System.out.print("¬ведите число: ");
if (sc.hasNextInt())
number = sc.nextInt();
kv_number = number * number;
while (number % 10 != 0) {
sumDigitNumber += number % 10;
number = number / 10;
}
sumDigitNumber += number;
kub_number = (int) Math.pow(sumDigitNumber, 3);
if (kub_number == kv_number)
System.out.println("TRUE");
else
System.out.println("FALSE");
}
}*/

/*—оставить линейную программу, печатающую значение true, если указанное
высказывание €вл€етс€ истинным, и false Ч в противном случае: квадрат заданного
трехзначного числа равен кубу суммы цифр этого числа.

*/

public class L14Line03
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		int number = 0;
		int sumDigitNumber = 0;
		int kv_number;
		int kub_number;
		
		System.out.print("¬ведите число: ");
		if (sc.hasNextInt())
			number = sc.nextInt();
		
		kv_number = number * number;
		
		while (number % 10 != 0)
		{
			sumDigitNumber += number % 10;
			number = number / 10;
		}
		
		//sumDigitNumber += number;
		
		kub_number = (int) Math.pow(sumDigitNumber, 3);
		
		if (kub_number == kv_number)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
