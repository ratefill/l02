package by.epam.l02.fixit;

import java.util.Scanner;

//������ ���������� ���� ������ ������������ (�1, �1),(�2, �2),(�3, y3) �
//����� ��� �������� � �������.

/*public class TriangSP {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
double a, b, c;
double P, S;
double p;
System.out.print("������� x1: ");
if (sc.hasNextDouble()) {
x1 = sc.nextDouble();
}
System.out.print("������� y1: ");
if (sc.hasNextDouble()) {
y1 = sc.nextDouble();
}
System.out.print("������� x2: ");
if (sc.hasNextDouble()) {
x2 = sc.nextDouble();
}
System.out.print("������� y2: ");
if (sc.hasNextDouble()) {
y2 = sc.nextDouble();
}
System.out.print("������� x3: ");
if (sc.hasNextDouble()) {
x3 = sc.nextDouble();
}
System.out.print("������� y3: ");
if (sc.hasNextDouble()) {
y3 = sc.nextDouble();
}
a = sqrt(pow(abs(abs(x1) - abs(x3)), 2) + pow(abs(abs(y1) -abs(y3)), 2));
b = sqrt(pow(abs(abs(x3) - abs(x2)), 2) + pow(abs(abs(y3) -abs(y2)), 2));
c = sqrt(pow(abs(abs(x1) - abs(x2)), 2) + pow(abs(abs(y1) -abs(y2)), 2));

P = a + b + c;
p = P / 2;
S = sqrt(p * (p - a) * (p - b) * (p - c));
System.out.println(a + " " + b + " " + c);
System.out.println("�������� ������������ ����� P=" + P + ",������� S=" + S);
}
}*/

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//�������� ������ ���� �������� ���������, ���������� �������:

public class L08TriangSP
{

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		double AB;// (x1,y1)(x2,y2)
		double BC;// (x2,y2)(x3,y3)
		double CA;// (x3,y3)(x1,y1)
		double P;// ��������
		double p2;// ������������
		double S;// �������

		// ���������� ������ ������������
		double x1 = 0, y1 = 0;
		double x2 = 0, y2 = 0;
		double x3 = 0, y3 = 0;

		x1 = ReadFromConsole("x1");
		y1 = ReadFromConsole("y1");
		x2 = ReadFromConsole("x2");
		y2 = ReadFromConsole("y2");
		x3 = ReadFromConsole("x3");
		y3 = ReadFromConsole("y3");

		AB = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
		BC = sqrt(pow(x2 - x3, 2) + pow(y2 - y3, 2));
		CA = sqrt(pow(x3 - x1, 2) + pow(y3 - y1, 2));

		P = AB + BC + CA; // ��������
		p2 = P / 2; // ������������
		S = sqrt(p2 * (p2 - AB) * (p2 - BC) * (p2 - CA));// ������� �� ������� ������

		System.out.println("AB=" + AB + ", BC=" + BC + ", CA=" + CA);
		System.out.println("�������� ������������ ����� P=" + P + ",������� S=" + S);

	}

	private static double ReadFromConsole(String var_name)
	{
		double x = 0;

		while (true)
		{
			System.out.print("������� " + var_name + ": ");
			if (sc.hasNextDouble())
			{
				x = sc.nextDouble();
				break;
			}
			else
			{
				sc.next();
			}
			;
		}
		;

		return x;
	}

}
