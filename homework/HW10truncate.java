package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;

/*Программа вводит количество чисел N, а затем N вещественных чисел. Программа
усекает вещественные числа и определяет, сколько среди усеченных чисел четных
и >15*/

public class HW10truncate
{
	public static void main(String[] args)
	{
		int num;
		int even = 0;
		int count15 = 0;

		int N = readFromConsoleI("кол-во чисел N");
		for (int i = 0; i < N; i++)
		{
			num = (int) readFromConsoleD("число №" + (i + 1));
			if (num % 2 == 0)// подсчет четных чисел
			{
				even++;
			}
			if (num > 15)// подсчет чисел, >15
			{
				count15++;
			}
		}
		println("Кол-во четных усеченных чисел: " + even);
		println("Кол-во усеченных чисел, >15: " + count15);

	}
}
