package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;
import static java.lang.Math.abs;

/*��������� ����������� ���������� �����, ����� ������ ����� ����� � ������������
� ��������� �����������. ���������� ���������� ������, ����� ������� 3-� �
���������� �����, ������ ������� <3*/

public class HW09numbers
{
	public static void main(String[] args)
	{
		int num;
		int even = 0;
		int sum = 0;
		int count_abs3 = 0;

		int N = readFromConsoleI("���-�� ����� N");
		for (int i = 0; i < N; i++)
		{
			num = readFromConsoleI("����� �" + (i + 1));
			if (num % 2 == 0)//������� ������ �����
			{
				even++;
			}
			if (num % 3 == 0)//����� �����, ������� 3
			{
				sum+=num;
			}
			if (abs(num)<3)//������� �����, ������ ������� <3
			{
				count_abs3+=num;
			}			
		}
		println("���-�� ������ �����: " + even);
		println("C���� �����, ������� 3: " + sum);
		println("���-�� �����, ������ ������� <3: " + count_abs3);
		
	}
}
