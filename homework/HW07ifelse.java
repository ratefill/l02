package by.epam.l02.homework;

/*��������� ������ ��� ����� a � b, ���� � > b, �� ��������� ������ ������ ����� � �
������� ����� b+c. ���� �=b, �� ��������� �������� ����� �������. ���� �<b, ��
��������� ������ ������ ����� �, ������� ����� a+b+c, ������� �� ����� �����
a+b+c � ����� ������ ���!�.*/

import static by.epam.l02.homework_common.Console.*;

public class HW07ifelse
{
	public static void main(String[] args)
	{
		double A, B, C, result;
		double accuracy = 0.00000001;// �������� 8 ������ ����� �������

		A = readFromConsoleD("A");
		B = readFromConsoleD("B");
		if (A - B > accuracy)// ���� � > b
		{
			// ��������� ������ ������ ����� � � ������� ����� b+c.
			C = readFromConsoleD("C");
			result = B + C;
			print("��������� ��������� B+C= " + result);
		}
		else if (B - A > accuracy)
		{
			// ��������� ������ ������ ����� � � ������� ����� b+c.
			C = readFromConsoleD("C");
			result = A + B + C;
			print("��������� ��������� A+B+C= " + result + ", \"���� ���!\"");
		}
		else
		{
			print("�����");
		}
	}
}
