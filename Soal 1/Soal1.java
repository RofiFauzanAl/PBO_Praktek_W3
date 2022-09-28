import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String putString = input.nextLine();
		
		String[] symbol = putString.split("[ !,?._'@]+");
		input.close();
		
		System.out.println(symbol.length);
		
		for (String s : symbol)
		{
			System.out.println(s);
		}
	}
}
