package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.readFromConsoleD;
import static by.epam.l02.homework_common.Console.println;

/*��������� �������� �������*/

public class HW17
{
	public static void main(String[] args)
	{
		double x = readFromConsoleD("x");;

		double f = 0;
		

		if (x <= -3)
		{
			f = 9;
		}
		else
		{
			f = 1 / (x * x + 1);
		}

		println("��� x = " + x + " �������� ������� f(x) = " + f);
	}
}
