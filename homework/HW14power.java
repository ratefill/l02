package by.epam.l02.homework;

/*���� ��� �������������� �����. �������� � ������� �� �� ���, �������� �������
��������������, � � ��������� ������� � �������������.*/

import static by.epam.l02.homework_common.Console.println;


public class HW14power
{
	public static void main(String[] args)
	{
		double a = 3;
		double b = -2;
		double c = 1;
		calc(a,'a');
		calc(b,'b');
		calc(c,'c');
	};

	private static void calc(double x, char message)
	{
		if (x > 0)
		{
			println("������� ����� " + message + " = " + x * x);
		}
		else
		{
			println("��������� ������� ����� " + message + " = " + Math.pow(x, 4));
		}
	}
}
