package by.epam.l02.fixit;

import java.util.Scanner;

public class L10ColDays
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		int year = 0, month = 0, col_day = 0;
		System.out.print("Введите год: ");
		year = ReadFromConsole("год");
		month = ReadFromConsole("номер месяца");

		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			/*
			 * Год високосный, если он делится на четыре без остатка, но если он
			 * делится на 100 без остатка, это не високосный год. Однако, если
			 * он делится без остатка на 400, это високосный год. Таким образом,
			 * 2000 г. является особым високосным годом, который бывает лишь раз
			 * в 400 лет.
			 */
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
			{
				col_day = 29;
			}
			else
			{
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		System.out.println("Количество дней равно - " + col_day);
	}

	private static int ReadFromConsole(String var_name)
	{
		int x = 0;

		while (true)
		{
			System.out.print("Введите " + var_name + ": ");
			if (sc.hasNextInt())
			{
				x = sc.nextInt();
				break;
			}
			else
			{
				sc.next();
				System.out.println("введенный символ не вляется числом, попробуйте еще раз");
			}
			;
		}
		;

		return x;
	}

}