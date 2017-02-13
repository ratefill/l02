package by.epam.l02.homework;

/*—оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с
шагом h. –езультат представить в виде таблицы, первый столбец которой Ц значени€
аргумента, второй - соответствующие значени€ функции*/

import static by.epam.l02.homework_common.Console.println;

public class HW15for
{
	public static void main(String[] args)
	{
		double a = 1;
		double b = 2;
		double h = 0.2;//шаг
		double f;

		for (double x = a; x <= b; x += h)
		{
			f = 2 * Math.tan(x / 2) + 1;//значение функции
			println("x = " + x + ", f(x) = " + f);
		}
	}
}
