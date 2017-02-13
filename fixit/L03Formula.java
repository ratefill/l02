package by.epam.l02.fixit;

import java.util.Scanner;

/*Листинг l3
public class Formula {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double x = 0, y = 0;
System.out.print("Введите x: ");
x = sc.nextDouble();
y = calcY(x);
System.out.println("y=" + y);
System.out.print("Введите x: ");
x = sc.nextDouble();
y = calcY(x);
System.out.println("y(" + x + ")=" + y);
}
public static double calcY(double x){
double fx;
if (x >= 3) {
fx = -x * x + 3 * x + 9;
} else {
fx = 1 / (Math.pow(x, 3) - 6);
}
return fx;
}
}*/

public class L03Formula
{
	private static Scanner sc = new Scanner(System.in);
	private static double x;
	private static double y;

	private static boolean exec()
	{
		// x = y = 0;
		boolean result;

		System.out.print("Введите x: ");
		if (sc.hasNextDouble())
		{
			x = sc.nextDouble();
			y = calcY(x);
			result = true;
		}
		else
		{
			sc.next();
			System.out.println("Вы ввели неверное число.");
			result = false;
		}
		return (result);
	}

	public static void main(String[] args)
	{
		if (exec())
		{
			System.out.println("y=" + y);
		}
		;

		if (exec())
		{
			System.out.println("y(" + x + ")=" + y);
		}
		;
	}

	public static double calcY(double x)
	{
		double fx;
		if (x >= 3)
		{
			fx = -x * x + 3 * x + 9;
		}
		else
		{
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		return fx;
	}
}
