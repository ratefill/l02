package by.epam.l02.homework;

/*Программа вводит два числа a и b, если а > b, то программа вводит третье число с и
находит сумму b+c. Если а=b, то программа печатает слово «Конец». Если а<b, то
программа вводит третье число с, находит сумму a+b+c, выводит на экран сумму
a+b+c и слова «Новый год!».*/

import static by.epam.l02.homework_common.Console.*;

public class HW07ifelse
{
	public static void main(String[] args)
	{
		double A, B, C, result;
		double accuracy = 0.00000001;// точность 8 знаков после запятой

		A = readFromConsoleD("A");
		B = readFromConsoleD("B");
		if (A - B > accuracy)// если а > b
		{
			// программа вводит третье число с и находит сумму b+c.
			C = readFromConsoleD("C");
			result = B + C;
			print("Результат выражения B+C= " + result);
		}
		else if (B - A > accuracy)
		{
			// программа вводит третье число с и находит сумму b+c.
			C = readFromConsoleD("C");
			result = A + B + C;
			print("Результат выражения A+B+C= " + result + ", \"Новй год!\"");
		}
		else
		{
			print("Конец");
		}
	}
}
