package by.epam.l02.fixit;

import java.util.Scanner;

/*public class Hole {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a = 0, b = 0, x = 0, y = 0, z = 0;
System.out.print("Введите a: ");
if (sc.hasNextDouble())
a = sc.nextDouble();
System.out.print("Введите b: ");
if (sc.hasNextDouble())
b = sc.nextDouble();
System.out.print("Введите x: ");
if (sc.hasNextDouble())
x = sc.nextDouble();
System.out.print("Введите y: ");
if (sc.hasNextDouble())
y = sc.nextDouble();
System.out.print("Введите z: ");
if (sc.hasNextDouble())
z = sc.nextDouble();
if ((a > x) && (b > y))
System.out.println("Проидет.");
else if ((a > y) && (b > x))
System.out.println("Проидет.");
else if ((a > x) && (b > z))
System.out.println("Проидет.");
else if ((a > z) && (b > x))
System.out.println("Проидет.");
else if ((a > y) && (b > z))
System.out.println("Проидет.");
else if ((a > z) && (b > y))
System.out.println("Проидет.");
else
System.out.println("Не проидет.");
}
}*/

/*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.*/

public class L17Hole
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		double a = 0, b = 0;
		double x = 0, y = 0, z = 0;

		System.out.print("Введите a: ");
		if (sc.hasNextDouble())
			a = sc.nextDouble();

		System.out.print("Введите b: ");
		if (sc.hasNextDouble())
			b = sc.nextDouble();

		System.out.print("Введите x: ");
		if (sc.hasNextDouble())
			x = sc.nextDouble();

		System.out.print("Введите y: ");
		if (sc.hasNextDouble())
			y = sc.nextDouble();

		System.out.print("Введите z: ");
		if (sc.hasNextDouble())
			z = sc.nextDouble();

		if (   (a > x) && (b > y) 
			|| (a > x) && (b > z) 
			|| (a > y) && (b > x) 
			|| (a > y) && (b > z) 
			|| (a > z) && (b > x)
			|| (a > z) && (b > y)
			)
			System.out.println("Проидет.");
		else
			System.out.println("Не проидет.");

	}
}