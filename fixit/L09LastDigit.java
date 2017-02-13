package by.epam.l02.fixit;

import java.util.Scanner;

/*public class LastDigit {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number = 0;
int poslZifra;
int poslZifraKv;
System.out.print("Введите число: ");
if (sc.hasNextInt()) {
number = sc.nextInt();
}
poslZifra = number % 10;
switch (poslZifra) {
case 0:
poslZifraKv = 0;
break;
case 1:
poslZifraKv = 1;
break;
case 2:
poslZifraKv = 4;
break;
case 3:
poslZifraKv = 9;
break;
case 4:
poslZifraKv = 6;
break;
case 5:
poslZifraKv = 5;
break;
case 6:
poslZifraKv = 6;
break;
case 7:
poslZifraKv = 9;
break;
case 8:
poslZifraKv = 4;
break;
case 9:
poslZifraKv = 1;
break;
default:
System.out.println("Что-то не то с программой.");
return;
}
System.out.println("Квадрат числа " + number + " равняется " +
poslZifraKv);
}
}*/

public class L09LastDigit
{
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{		
		int number = 0;		
		int poslZifraKv;
		
		number = ReadFromConsole();
		poslZifraKv = (int)Math.pow(number % 10, 2) % 10;		

		
		System.out.println("Последняя цифра квадрата числа " + number + " равняется " + poslZifraKv);
	}



private static int ReadFromConsole()
{
	int x = 0;

	while (true)
	{
		System.out.print("Введите число: ");
		if (sc.hasNextInt())
		{
			x = sc.nextInt();
			break;
		}
		else
		{
			sc.next();
			System.out.println("введенный символ не вляется числом, попробуйте еще раз");
		}
		;
	}
	;

	return x;
}

}