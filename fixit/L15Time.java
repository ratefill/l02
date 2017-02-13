package by.epam.l02.fixit;

import java.util.Scanner;

/*

public class Time {
public static void main(String[] args) {
int n = 0;
int hour, min, sec;
Scanner sc = new Scanner(System.in);
System.out.print("Введите количество секунд: ");
if (sc.hasNextInt())
n = sc.nextInt();
if ((n > 86400) || (n < 0)) {
System.out.println("Неверное значение.");
return;
}
hour = n / 3600;
n = n - hour * 3600;
min = n / 60;
n = n - min * 60;
sec = n;
System.out.println("В " + n + " секундах: " + hour + " ч. " + min
+ " мин. " + sec + " сек.");
}
}
*/

/*Идет n-я секунда суток, определить, сколько полных часов, полных минут и
секунд прошло к этому моменту*/

public class L15Time
{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = 0, time = 0;
		int hour, min, sec;

		System.out.print("Введите количество секунд: ");
		if (sc.hasNextInt())
			time = n = sc.nextInt();
		if ((n > 86400) || (n < 0))
		{
			System.out.println("Неверное значение.");
			return;
		}
		hour = n / 3600;
		n = n % 3600;// n - hour * 3600;
		min = n / 60;
		n = n % 60;// n - min * 60;
		sec = n;
		System.out.println("В " + time + " секундах: " + hour + " ч. " + min + " мин. " + sec + " сек.");
	}
}