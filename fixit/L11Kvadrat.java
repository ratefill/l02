package by.epam.l02.fixit;

/*public class Kvadrat {
public static void main(String[] args) {
double Skv; // площадь внешнего квадрата
double stononaKv;
double radiusOkr;
double skv2; // площадь внутреннего вкадрата
double x; // во сколько раз пощадь вписанного квадрата меньше заданного
Skv = 25;
stononaKv = Math.sqrt(Skv); // вычисляем сторону квадрата
radiusOkr = stononaKv / 2;
skv2 = 0.5 * radiusOkr * radiusOkr * 4;
x = Skv / skv2;
System.out.println("x=" + x);
}
}
*/

/*Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
вписанного в эту окружность. Во сколько раз площадь вписанного квадрата меньше
площади заданного?*/

public class L11Kvadrat
{
	public static void main(String[] args)
	{
		double big_S; // площадь внешнего квадрата
		double small_S; // площадь внутреннего вкадрата
		//double big_L;// сторона внешнего (большого) квадрата

		double dif; // во сколько раз пощадь вписанного квадрата меньше
					// заданного

		big_S = 25;// задано по условию

		//big_L = Math.sqrt(big_S); // вычисляем сторону квадрата

		small_S = big_S / 2;

		dif = big_S / small_S;

		System.out.println("Площад квадрата, вписанного в окружность small_S=" + small_S);
		System.out.println("Площад вписанного в окружность квадрата меньше заданной площади в " + dif);		
	}
}
