package by.epam.l02.fixit;

import java.util.Scanner;

/* 
public class L16Point2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
double a, b;
System.out.print("Введите x1: ");

if (sc.hasNextDouble())
x1 = sc.nextDouble();
System.out.print("Введите y1: ");
if (sc.hasNextDouble())
y1 = sc.nextDouble();
System.out.print("Введите x2: ");
if (sc.hasNextDouble())
x2 = sc.nextDouble();
System.out.print("Введите y2: ");
if (sc.hasNextDouble())
y2 = sc.nextDouble();
a = Math.sqrt(x1 * x1 + y1 * y1);
b = Math.sqrt(x2 * x2 + y2 * y2);
if (a < b)
System.out.println("Точка А ближе к началу координат.");
else if (a > b)
System.out.println("Точка B ближе к началу координат.");
else
System.out.println("Точки равномерно удалены от начала
коодинат.");
}
}*/

/*Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из
точек находится ближе к началу координат.*/

public class L16Point2
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		double a, b;
		double accuracy=0.000000001;//точность вычисления

		System.out.print("Введите x1: ");
		if (sc.hasNextDouble())
			x1 = sc.nextDouble();

		System.out.print("Введите y1: ");
		if (sc.hasNextDouble())
			y1 = sc.nextDouble();

		System.out.print("Введите x2: ");
		if (sc.hasNextDouble())
			x2 = sc.nextDouble();

		System.out.print("Введите y2: ");
		if (sc.hasNextDouble())
			y2 = sc.nextDouble();

		a = Math.sqrt(x1 * x1 + y1 * y1);
		b = Math.sqrt(x2 * x2 + y2 * y2);
		
		if ((a-b)< accuracy)
		System.out.println("Точки равноудалены от начала коодинат.");
		else
		if (a < b)
			System.out.println("Точка А ближе к началу координат.");
		else 
			System.out.println("Точка B ближе к началу координат.");

	}
}