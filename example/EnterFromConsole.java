package by.epam.l02.example;

import java.util.Scanner;

public class EnterFromConsole
{
	public static void main(String[] args)
	{
	//	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.print("������� ����� �����: ");
		if (scanner.hasNextInt())
		{
			x = scanner.nextInt();
			System.out.println("�� ����� " + x);
		} else
		{
			scanner.next();
			System.out.println("�� ����� �� ����� �����.");
		}
		double y;
		System.out.print("������� ������������ �����: ");
		if (scanner.hasNextDouble())
		{
			y = scanner.nextDouble();
			System.out.println("�� ����� " + y);
		} else
		{
			scanner.next();
			System.out.println("�� ����� �� ������������ " + " �����.");
		}
		scanner.close();
	}
}
