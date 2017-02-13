package by.epam.l02.fixit;

import java.util.Scanner;

/* 
public class L16Point2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
double a, b;
System.out.print("������� x1: ");

if (sc.hasNextDouble())
x1 = sc.nextDouble();
System.out.print("������� y1: ");
if (sc.hasNextDouble())
y1 = sc.nextDouble();
System.out.print("������� x2: ");
if (sc.hasNextDouble())
x2 = sc.nextDouble();
System.out.print("������� y2: ");
if (sc.hasNextDouble())
y2 = sc.nextDouble();
a = Math.sqrt(x1 * x1 + y1 * y1);
b = Math.sqrt(x2 * x2 + y2 * y2);
if (a < b)
System.out.println("����� � ����� � ������ ���������.");
else if (a > b)
System.out.println("����� B ����� � ������ ���������.");
else
System.out.println("����� ���������� ������� �� ������
��������.");
}
}*/

/*���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, ������� ��
����� ��������� ����� � ������ ���������.*/

public class L16Point2
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		double a, b;
		double accuracy=0.000000001;//�������� ����������

		System.out.print("������� x1: ");
		if (sc.hasNextDouble())
			x1 = sc.nextDouble();

		System.out.print("������� y1: ");
		if (sc.hasNextDouble())
			y1 = sc.nextDouble();

		System.out.print("������� x2: ");
		if (sc.hasNextDouble())
			x2 = sc.nextDouble();

		System.out.print("������� y2: ");
		if (sc.hasNextDouble())
			y2 = sc.nextDouble();

		a = Math.sqrt(x1 * x1 + y1 * y1);
		b = Math.sqrt(x2 * x2 + y2 * y2);
		
		if ((a-b)< accuracy)
		System.out.println("����� ������������ �� ������ ��������.");
		else
		if (a < b)
			System.out.println("����� � ����� � ������ ���������.");
		else 
			System.out.println("����� B ����� � ������ ���������.");

	}
}