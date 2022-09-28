import java.util.*;

public class Soal3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int result = 0;
        System.out.print("Input number 1 : ");
        int number1 = s.nextInt();
        System.out.print("Operator : ");
        String operator = s.next();
        System.out.print("Input number 2 : ");
        int number2 = s.nextInt();
        s.close();
        switch(operator){
            case "+":
            	result = number1 + number2;
                break;
            
            case "-":
            	result = number1 - number2;
                break;
                
            case "/":
            	result = number1 / number2;
                break;
            
            case "*":
            	result = number1 * number2;
                break;
            
            default:
                System.out.println("Can't be execute!!");
                break;
        } 
        System.out.println("Result :" + result);
	}
}
