package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.println;
import static by.epam.l02.homework_common.Console.readFromConsoleI;

/*��������� ����������� ���������� �����, ������ ����� ����� � ������������ �
���������� ����������� ,����������, ������� ����� ������ 15 ��� <2, ���� �����
����� �����, ������� ������� �� 5 � �������� 4. ��������� ������� �� �����.*/

public class HW11or
{	 
	public static void main(String[] args)
	{
		int num;		
		int count = 0;//���-�� ����� > 15 ��� <2
		int sum = 0;

		int N = readFromConsoleI("���-�� ����� N");
		for (int i = 0; i < N; i++)
		{
			num = readFromConsoleI("����� �" + (i + 1));
			if (num > 15 || num < 2)// ������� �����, >15 ��� <2
			{
				count++;
			}
			if (num%5==4)// ������� �����, >15
			{
				sum++;
			}			
		}
		println("���-�� �����  >15 ��� <2: " + count);
		println("����� �����, ������� ������� �� 5 � �������� 4: " + sum);

	}
}
