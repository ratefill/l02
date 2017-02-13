package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.println;

/*Создать программу ввода целых чисел как аргументов командной строки, подсчета
их суммы и вывода результата на консоль.*/

public class HW12CommandArgs
{
	public static void main(String[] args)
	{
		int sum=0;
		println("args.length: " + args.length);
		if (args.length <= 0)
		{
			println("No arguments");
		}
		else
		{
			for (int i = 0; i < args.length; i++)
			{
				println("args[" + i + "]=" + args[i]);
				sum+=Integer.parseInt(args[i]);
			}
			println("sum=" + sum);	
		}
	}
}
