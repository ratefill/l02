package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;

/*�������� ��������� ���������� ���������� � ������� ��������������
������������ �� ���� �������.*/

public class HW04Pythagorean

{
	public static void main(String[] args)
	{
		double A, B, C;
		A = readFromConsoleD("1-�� �����");
		B = readFromConsoleD("2-�� �����");
		//A = 4;
		//B = 3;
		C = Math.sqrt(A*A+B*B);
		
		print("���������� ����� " + C);
		
	}
};
