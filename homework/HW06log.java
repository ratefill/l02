package by.epam.l02.homework;

import static java.lang.Math.*;
import static by.epam.l02.homework_common.Console.*;

/*Программа запрашивает у пользователя a,b,c ,вычислить значение выражения a 2 -(b-
c) 2 +ln(b 2 +1).*/

public class HW06log
{
	public static void main(String[] args)
	{
		double A, B, C, result;
		A = readFromConsoleD("A");
		B = readFromConsoleD("B");
		C = readFromConsoleD("C");

		result = A * A - pow((B - C), 2) + log(B * B + 1);

		print("Результат выражения = " + result);

	}
}
