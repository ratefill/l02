package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;

/*��������� ������ ���������� ����� N, � ����� N ������������ �����. ���������
������� ������������ ����� � ����������, ������� ����� ��������� ����� ������
� >15*/

public class HW10truncate
{
	public static void main(String[] args)
	{
		int num;
		int even = 0;
		int count15 = 0;

		int N = readFromConsoleI("���-�� ����� N");
		for (int i = 0; i < N; i++)
		{
			num = (int) readFromConsoleD("����� �" + (i + 1));
			if (num % 2 == 0)// ������� ������ �����
			{
				even++;
			}
			if (num > 15)// ������� �����, >15
			{
				count15++;
			}
		}
		println("���-�� ������ ��������� �����: " + even);
		println("���-�� ��������� �����, >15: " + count15);

	}
}
