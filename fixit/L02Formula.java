package by.epam.l02.fixit;

/*Листинг l2
public class Formula {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double x = 0;
System.out.print("Введите x: ");
x = sc.nextDouble();
calcY(x);
System.out.print("Введите x: ");
x = sc.nextDouble();
calcY(x);
}
public static void calcY(double x){
double fx;
if (x >= 3) {
fx = -x * x + 3 * x + 9;
} else {
fx = 1 / (Math.pow(x, 3) - 6);
}
System.out.println("x = " + x + "; y=" + fx);
}
}*/

import java.util.Scanner;

public class L02Formula
{

	// @SuppressWarnings("resource")
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		exec();
		exec();
	}
	
	private static void exec()
	{
		double x = 0;

		System.out.print("Введите x: ");
		if (sc.hasNextDouble())
		{
			x = sc.nextDouble();
			calcY(x);
		}
		else
		{
			sc.next();
			System.out.println("Вы ввели неверное число.");
		}		
	} 

	public static void calcY(double x)
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
		System.out.println("x = " + x + "; y=" + fx);
	}
}