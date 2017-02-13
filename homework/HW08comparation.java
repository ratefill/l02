package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;
import static java.lang.Math.*;


/*Программа вводит два числа a и b, если a=b, то вывести на экран слова «скоро Новый
Год!», в противном случае ввести третье число с и вывести на экран 3 строки :
-значение выражения a+b+c
-значение выражения B*B + A*A
-«моя любимая футбольная команда»
*/

public class HW08comparation
{
	public static void main(String[] args)
	{
		double A, B, C;
		double accuracy = 0.00000001;// точность 8 знаков после запятой

		A = readFromConsoleD("A");
		B = readFromConsoleD("B");
		if (abs(A - B) <= accuracy)// если а = b
		{
			print("«скоро Новый год!»");
		}
		else
		{
			// программа вводит третье число с и находит сумму a+b+c, A*A+B*B, выводит фразу.
			C = readFromConsoleD("C");
			println("Результат выражения A+B+C= " + (A + B + C));
			println("Результат выражения A*A+B*B= " + (A*A+B*B));
			println("\"моя любимая футбольная команда\"");
		}
	}
}
