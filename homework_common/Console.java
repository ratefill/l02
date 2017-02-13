package by.epam.l02.homework_common;

import java.util.Scanner;

public class Console
{
	
	private static Scanner sc = new Scanner(System.in);

	public static double readFromConsoleD(String descr)
	{
		double x = 0;

		while (true)
		{
			System.out.print("¬ведите " + descr + ": ");
			if (sc.hasNextDouble())
			{
				x = sc.nextDouble();
				break;
			}
			else
			{
				sc.next();
			}
		}

		return x;
	}

	
	public static int readFromConsoleI(String descr)
	{
		int x = 0;

		while (true)
		{
			System.out.print("¬ведите " + descr + ": ");
			if (sc.hasNextInt())
			{
				x = sc.nextInt();
				break;
			}
			else
			{
				sc.next();
			}
		}

		return x;
	}

	public static void print(String x)
	{
		System.out.print(x);
	}
	public static void println(String x)
	{
		System.out.println(x);
	}
	public static void println(double x)
	{
		System.out.println(x);
	}
}
