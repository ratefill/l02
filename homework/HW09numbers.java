package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;
import static java.lang.Math.abs;

/*Программа запрашивает количество чисел, затем вводит целые числа в соответствии
с указанным количеством. Определяет количество четных, сумму кратных 3-м и
количество чисел, модуль которых <3*/

public class HW09numbers
{
	public static void main(String[] args)
	{
		int num;
		int even = 0;
		int sum = 0;
		int count_abs3 = 0;

		int N = readFromConsoleI("кол-во чисел N");
		for (int i = 0; i < N; i++)
		{
			num = readFromConsoleI("число №" + (i + 1));
			if (num % 2 == 0)//подсчет четных чисел
			{
				even++;
			}
			if (num % 3 == 0)//сумма чисел, кратных 3
			{
				sum+=num;
			}
			if (abs(num)<3)//подсчет чисел, модуль которых <3
			{
				count_abs3+=num;
			}			
		}
		println("Кол-во четных чисел: " + even);
		println("Cумма чисел, кратных 3: " + sum);
		println("Кол-во чисел, модуль которых <3: " + count_abs3);
		
	}
}
