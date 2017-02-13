package by.epam.l02.fixit;

/*Ћистинг l1
public class Formula {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double x = 0, Fx;
System.out.print("¬ведите x: ");
if (sc.hasNextDouble()) {
x = sc.nextDouble();
}
if (x >= 3) {
Fx = -x * x + 3 * x + 9;
} else {
Fx = 1 / (Math.pow(x, 3) - 6);
}
System.out.println("F(x)=" + Fx);
}
}*/

import java.util.Scanner;

public class L01Formula
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		double Fx;
		
		System.out.print("¬ведите x: ");
		if (sc.hasNextDouble())
		{
			x = sc.nextDouble();
		}
		if (x >= 3)
		{
			Fx = -x * x + 3 * x + 9;
		} else
		{
			Fx = 1 / (Math.pow(x, 3) - 6);
		}
		System.out.println("F(x)=" + Fx);
	}
}
