package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;

/*�������� ��������� ���������� ����� ������ ���������.*/

public class HW05sum
{

	public static void main(String[] args)
	{
		double A, B, C, D, sum;
		
		A = readFromConsoleD("1-�� ���������");
		B = readFromConsoleD("2-�� ���������");
		C = readFromConsoleD("3-�� ���������");
		D = readFromConsoleD("4-�� ���������");
		
/*		A = 3;
		B = 4;
		C = 5;
		D = 6;*/
		sum = A + B + C + D;

		print("����� ������� ��������� = " + sum);
	}
}
