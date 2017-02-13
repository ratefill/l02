/**
 * 
 */
package by.epam.l02.example;

/**
 * @author Owner
 *
 */
public class CommandArgs
{
	public static void main(String[] args)
	{
		System.out.println("args.length: " + args.length);
		if (args.length <= 0)
		{
			System.out.println("No arguments");
			return;
		}
		for (int i = 0; i < args.length; i++)
		{
			System.out.println("args[" + i + "]=" + args[i]);
		}
	}
}