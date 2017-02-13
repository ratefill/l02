package by.epam.l02.homework;

import static by.epam.l02.homework_common.Console.println;

/*Выведите на консоль ваши ФИО, адрес и телефон.*/

public class HW02FIO
{
	final static String FIO = "Александр Сергеевич Пушкин";
	final static String Address = "Российская империя, Санкт-Петербург, наб. реки Мойки 12";
	final static String Phone = "нет";

	public static void main(String[] args)
	{
		println("ФИО:" + FIO);
		println("Адрес:" + Address);
		println("Телефон:" + Phone);
	}
}
