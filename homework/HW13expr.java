package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.println;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/*Вычислить значение выражения по формуле (все переменные принимают
действительные значения):
*/

public class HW13expr
{
	public static void main(String[] args)
	{
		double a = 4;
		double b = 2.3;
		double c = 8;
		double d = 7;

		double expr1;
		double expr2;

		expr1 = (b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) * c + b;
		expr2 = (a / c) * (b / d) - (a * b - c) / (c * d);

		println(expr1);
		println(expr2);
	}
}
