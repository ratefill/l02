package by.epam.l02.homework;

/*��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] �
����� h. ��������� ����������� � ���� �������, ������ ������� ������� � ��������
���������, ������ - ��������������� �������� �������*/

import static by.epam.l02.homework_common.Console.println;

public class HW15for
{
	public static void main(String[] args)
	{
		double a = 1;
		double b = 2;
		double h = 0.2;//���
		double f;

		for (double x = a; x <= b; x += h)
		{
			f = 2 * Math.tan(x / 2) + 1;//�������� �������
			println("x = " + x + ", f(x) = " + f);
		}
	}
}
