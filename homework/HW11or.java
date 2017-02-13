package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.println;
import static by.epam.l02.homework_common.Console.readFromConsoleI;

/*Программа запрашивает количество чисел, вводит целые числа в соответствии с
заявленным количеством ,определяет, сколько чисел больше 15 или <2, чему равна
сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.*/

public class HW11or
{	 
	public static void main(String[] args)
	{
		int num;		
		int count = 0;//кол-во чисел > 15 или <2
		int sum = 0;

		int N = readFromConsoleI("кол-во чисел N");
		for (int i = 0; i < N; i++)
		{
			num = readFromConsoleI("число №" + (i + 1));
			if (num > 15 || num < 2)// подсчет чисел, >15 или <2
			{
				count++;
			}
			if (num%5==4)// подсчет чисел, >15
			{
				sum++;
			}			
		}
		println("Кол-во чисел  >15 или <2: " + count);
		println("Сумма чисел, которые делятся на 5 с остатком 4: " + sum);

	}
}
