package by.epam.l02.fixit;

/*public class Kvadrat {
public static void main(String[] args) {
double Skv; // ������� �������� ��������
double stononaKv;
double radiusOkr;
double skv2; // ������� ����������� ��������
double x; // �� ������� ��� ������ ���������� �������� ������ ���������
Skv = 25;
stononaKv = Math.sqrt(Skv); // ��������� ������� ��������
radiusOkr = stononaKv / 2;
skv2 = 0.5 * radiusOkr * radiusOkr * 4;
x = Skv / skv2;
System.out.println("x=" + x);
}
}
*/

/*���������� ������� � ������� �������� �������. ����� ������� ��������,
���������� � ��� ����������. �� ������� ��� ������� ���������� �������� ������
������� ���������?*/

public class L11Kvadrat
{
	public static void main(String[] args)
	{
		double big_S; // ������� �������� ��������
		double small_S; // ������� ����������� ��������
		//double big_L;// ������� �������� (��������) ��������

		double dif; // �� ������� ��� ������ ���������� �������� ������
					// ���������

		big_S = 25;// ������ �� �������

		//big_L = Math.sqrt(big_S); // ��������� ������� ��������

		small_S = big_S / 2;

		dif = big_S / small_S;

		System.out.println("������ ��������, ���������� � ���������� small_S=" + small_S);
		System.out.println("������ ���������� � ���������� �������� ������ �������� ������� � " + dif);		
	}
}
