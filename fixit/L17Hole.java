package by.epam.l02.fixit;

import java.util.Scanner;

/*public class Hole {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a = 0, b = 0, x = 0, y = 0, z = 0;
System.out.print("������� a: ");
if (sc.hasNextDouble())
a = sc.nextDouble();
System.out.print("������� b: ");
if (sc.hasNextDouble())
b = sc.nextDouble();
System.out.print("������� x: ");
if (sc.hasNextDouble())
x = sc.nextDouble();
System.out.print("������� y: ");
if (sc.hasNextDouble())
y = sc.nextDouble();
System.out.print("������� z: ");
if (sc.hasNextDouble())
z = sc.nextDouble();
if ((a > x) && (b > y))
System.out.println("�������.");
else if ((a > y) && (b > x))
System.out.println("�������.");
else if ((a > x) && (b > z))
System.out.println("�������.");
else if ((a > z) && (b > x))
System.out.println("�������.");
else if ((a > y) && (b > z))
System.out.println("�������.");
else if ((a > z) && (b > y))
System.out.println("�������.");
else
System.out.println("�� �������.");
}
}*/

/*������ ������� �, � �������������� ��������� � ������� �, �, z �������.
����������, ������� �� ������ ����� ���������.*/

public class L17Hole
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		double a = 0, b = 0;
		double x = 0, y = 0, z = 0;

		System.out.print("������� a: ");
		if (sc.hasNextDouble())
			a = sc.nextDouble();

		System.out.print("������� b: ");
		if (sc.hasNextDouble())
			b = sc.nextDouble();

		System.out.print("������� x: ");
		if (sc.hasNextDouble())
			x = sc.nextDouble();

		System.out.print("������� y: ");
		if (sc.hasNextDouble())
			y = sc.nextDouble();

		System.out.print("������� z: ");
		if (sc.hasNextDouble())
			z = sc.nextDouble();

		if (   (a > x) && (b > y) 
			|| (a > x) && (b > z) 
			|| (a > y) && (b > x) 
			|| (a > y) && (b > z) 
			|| (a > z) && (b > x)
			|| (a > z) && (b > y)
			)
			System.out.println("�������.");
		else
			System.out.println("�� �������.");

	}
}