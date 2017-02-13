package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;

/*Напишите программу вычисления суммы четырёх слагаемых.*/

public class HW05sum
{

	public static void main(String[] args)
	{
		double A, B, C, D, sum;
		
		A = readFromConsoleD("1-ое слагаемое");
		B = readFromConsoleD("2-ое слагаемое");
		C = readFromConsoleD("3-ое слагаемое");
		D = readFromConsoleD("4-ое слагаемое");
		
/*		A = 3;
		B = 4;
		C = 5;
		D = 6;*/
		sum = A + B + C + D;

		print("Сумма четырех слагаемых = " + sum);
	}
}
