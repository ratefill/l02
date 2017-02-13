package by.epam.l02.homework;

/*Вычислить длину окружности и площадь круга одного и того же заданного радиуса
*/

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static by.epam.l02.homework_common.Console.println;

public class HW16radius
{
	public static void main(String[] args)
	{
		double r = 6;
		double l;
		double s;

		l = 2 * PI * r;
		s = PI * pow(r, 2);

		println("Длина окружности для  r=" + r + " ровна " + l);
		println("Площадь круга для r=" + r + " ровна " + s);
	}
}
