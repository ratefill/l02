package by.epam.l02.fixit;

import java.util.Scanner;

/*public class Line02 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int A = 0, B = 0, C = 0, D = 0;
int count = 0;
System.out.print("������� ����� A: ");
if (sc.hasNextInt()) {
A = sc.nextInt();
}
System.out.print("������� ����� B: ");
if (sc.hasNextInt()) {
B = sc.nextInt();
}
System.out.print("������� ����� C: ");
if (sc.hasNextInt()) {
C = sc.nextInt();
}
System.out.print("������� ����� D: ");
if (sc.hasNextInt()) {
D = sc.nextInt();
}
if (A % 2 == 0) {
count++;
}
if (B % 2 == 0) {
count++;
}
if (C % 2 == 0) {
count++;
}
if (D % 2 == 0) {
count++;
}
if (count >= 2) {
System.out.println("� ������������������ ���� ����� ����
������ �����.");
} else {
System.out.println("� ������������������ ��� ����� ����
������ �����.");
}
}
}*/


/*��������� �������� ���������, ���������� �������� true, ���� ���������
������������ �������� ��������, � false � � ��������� ������: ����� �������� �����
����� �, �, �, D ���� ���� �� ��� ������.
*/

public class L13Line02
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{

		int A = 0, B = 0, C = 0, D = 0;
		int count = 0;
		System.out.print("������� ����� A: ");
		if (sc.hasNextInt())
		{
			A = sc.nextInt();
		}
		System.out.print("������� ����� B: ");
		if (sc.hasNextInt())
		{
			B = sc.nextInt();
		}
		System.out.print("������� ����� C: ");
		if (sc.hasNextInt())
		{
			C = sc.nextInt();
		}
		System.out.print("������� ����� D: ");
		if (sc.hasNextInt())
		{
			D = sc.nextInt();
		}
				
		
		if (A % 2 == 0)
		{
			count++;
		}
		if (B % 2 == 0)
		{
			count++;
		}
		if (C % 2 == 0)
		{
			count++;
		}
		if (D % 2 == 0)
		{
			count++;
		}
		if (count >= 2)
		{
			System.out.println("� ������������������ ���� ��� ��� ����� ������ �����.");
		}
		else
		{
			System.out.println("� ������������������ ��� ���� � ����� ������ �����.");
		}
	}
}
