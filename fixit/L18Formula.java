package by.epam.l02.fixit;

import java.util.Scanner;

/*public class Formula {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double h = 0, a, b, c, D, x1, x2;
System.out.print("Введите h: ");
if (sc.hasNextDouble())

h = sc.nextDouble();
a = Math.sqrt((Math.abs(Math.sin(8 * h)) + 17)) / Math.pow(1 -
Math.sin(4 * h) * Math.cos(h * h + 18), 2);
b = 1 - Math.sqrt(3 / (3 + Math.abs(Math.tan(a * h * h) -
Math.sin(a * h))));
c = a * h * h * Math.sin(b * h) + b * Math.pow(h, 3) * Math.cos(a
* h);
D = b * b - 4 * a * c;
if (D < 0) {
System.out.println("Действительных корней нет.");
return;
} else if (D == 0) {
x1 = (-b) / (2 * a);
System.out.println("Один действительный корень, x=" + x1);
} else {
x1 = (-b - Math.sqrt(D)) / (2 * a);
x2 = (-b + Math.sqrt(D)) / (2 * a);
System.out.println("Два действительных корня, x1=" + x1 +
", x2=" + x2);
}
}
}*/

public class L18Formula
{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		double h = 0, a, b, c, D, x1, x2;
		
		System.out.print("Введите h: ");
		if (sc.hasNextDouble())
			h = sc.nextDouble();
		
		a = Math.sqrt((Math.abs(Math.sin(8 * h)) + 17)) / Math.pow(1 - Math.sin(4 * h) * Math.cos(h * h + 18), 2);
		b = 1 - Math.sqrt(3 / (3 + Math.abs(Math.tan(a * h * h) - Math.sin(a * h))));
		c = a * h * h * Math.sin(b * h) + b * Math.pow(h, 3) * Math.cos(a * h);
		D = b * b - 4 * a * c;
		
		if (D < 0)
		{
			System.out.println("Действительных корней нет.");
			return;
		}
		else if (D == 0)
		{
			x1 = (-b) / (2 * a);
			System.out.println("Один действительный корень, x=" + x1);
		}
		else
		{
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("Два действительных корня, x1=" + x1 + ", x2=" + x2);
		}
	}
}
