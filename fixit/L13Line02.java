package by.epam.l02.fixit;

import java.util.Scanner;

/*public class Line02 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int A = 0, B = 0, C = 0, D = 0;
int count = 0;
System.out.print("Введите число A: ");
if (sc.hasNextInt()) {
A = sc.nextInt();
}
System.out.print("Введите число B: ");
if (sc.hasNextInt()) {
B = sc.nextInt();
}
System.out.print("Введите число C: ");
if (sc.hasNextInt()) {
C = sc.nextInt();
}
System.out.print("Введите число D: ");
if (sc.hasNextInt()) {
D = sc.nextInt();
}
if (A % 2 == 0) {
count++;
}
if (B % 2 == 0) {
count++;
}
if (C % 2 == 0) {
count++;
}
if (D % 2 == 0) {
count++;
}
if (count >= 2) {
System.out.println("В последовательности есть более двух
четных чисел.");
} else {
System.out.println("В последовательности нет более двух
четных чисел.");
}
}
}*/


/*Составить линейную программу, печатающую значение true, если указанное
высказывание является истинным, и false — в противном случае: среди заданных целых
чисел А, В, С, D есть хотя бы два четных.
*/

public class L13Line02
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		int A = 0, B = 0, C = 0, D = 0;
		int count = 0;
		System.out.print("Введите число A: ");
		if (sc.hasNextInt())
		{
			A = sc.nextInt();
		}
		System.out.print("Введите число B: ");
		if (sc.hasNextInt())
		{
			B = sc.nextInt();
		}
		System.out.print("Введите число C: ");
		if (sc.hasNextInt())
		{
			C = sc.nextInt();
		}
		System.out.print("Введите число D: ");
		if (sc.hasNextInt())
		{
			D = sc.nextInt();
		}
				
		
		if (A % 2 == 0)
		{
			count++;
		}
		if (B % 2 == 0)
		{
			count++;
		}
		if (C % 2 == 0)
		{
			count++;
		}
		if (D % 2 == 0)
		{
			count++;
		}
		if (count >= 2)
		{
			System.out.println("В последовательности есть два или более четных чисел.");
		}
		else
		{
			System.out.println("В последовательности нет двух и более четных чисел.");
		}
	}
}
