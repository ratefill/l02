package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.*;

/*Напишите программу нахождения гипотенузы и площади прямоугольного
треугольника по двум катетам.*/

public class HW04Pythagorean

{
	public static void main(String[] args)
	{
		double A, B, C;
		A = readFromConsoleD("1-ый катет");
		B = readFromConsoleD("2-ой катет");
		//A = 4;
		//B = 3;
		C = Math.sqrt(A*A+B*B);
		
		print("Гипотенуза равна " + C);
		
	}
};
