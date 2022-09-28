import java.util.*;


public class Soal2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i < 3; i++)
        {
            String inputStr = input.next();
            int x = input.nextInt();
            System.out.printf( "%-15s%03d %n", inputStr, x);
        }
        input.close();
        System.out.println("================================");
	}
}

