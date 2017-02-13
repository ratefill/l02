package by.epam.l02.fixit;

import java.util.Scanner;

/*public class Formula {
public static void main(String[] args) {
double x = 0, y = 0;
x = readXFromConsole();
y = calcY(x);
printResult(x, y);
x = readXFromConsole();
y = calcY(x);
printResult(x, y);
}
public static double calcY(double x){
double fx;
© EPAM Systems, 2017 Page: 27/41
if (x >= 3) {
fx = -x * x + 3 * x + 9;
} else {
fx = 1 / (Math.pow(x, 3) - 6);
}
return fx;
}
public static double readXFromConsole(){
Scanner sc = new Scanner(System.in);
int x = 0;
System.out.print("¬ведите x: ");
while(!sc.hasNextDouble()){
sc.next();
System.out.print("¬ведите x: ");
}
x = sc.nextInt();
return x;
}
public static void printResult(double x, double y){
System.out.println("y(" + x + ")=" + y + ";");
}
}*/

public class L04Formula
{
	public static void main(String[] args)
	{
		run();
		run();
	}

	private static void run()
	{
		double x = 0;
		double y = 0;

		x = readXFromConsole();
		y = calcY(x);
		printResult(x, y);
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

	public static double readXFromConsole()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x = 0;

		while (true)
		{
			System.out.print("¬ведите x: ");
			if (sc.hasNextDouble())
			{
				x = sc.nextDouble();
				break;
			}
			else
			{
				sc.next();
			};
		};

		return x;
	}

	public static void printResult(double x, double y)
	{
		System.out.println("y(" + x + ")=" + y + ";");
	}
}
