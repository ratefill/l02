package by.epam.l02.homework;

/*��������� ����� ���������� � ������� ����� ������ � ���� �� ��������� �������
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

		println("����� ���������� ���  r=" + r + " ����� " + l);
		println("������� ����� ��� r=" + r + " ����� " + s);
	}
}
