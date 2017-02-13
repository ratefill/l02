package by.epam.l02.example;

import java.util.Scanner;

public class EnterFromConsole
{
	public static void main(String[] args)
	{
	//	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.print("Введите целое число: ");
		if (scanner.hasNextInt())
		{
			x = scanner.nextInt();
			System.out.println("Вы ввели " + x);
		} else
		{
			scanner.next();
			System.out.println("Вы ввели не целое число.");
		}
		double y;
		System.out.print("Введите вещественное число: ");
		if (scanner.hasNextDouble())
		{
			y = scanner.nextDouble();
			System.out.println("Вы ввели " + y);
		} else
		{
			scanner.next();
			System.out.println("Вы ввели не вещественное " + " число.");
		}
		scanner.close();
	}
}
