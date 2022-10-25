package Bankomat;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Bankomat bankAccount = new Bankomat();

    public static void main(String[] args) {
        while(true) {
            int valueToDeposit = 0;
            try {
                System.out.print("Enter value to deposit: ");
                valueToDeposit = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException n) {
                System.out.println("Value is no integer");
            }
            
            
            try {
                bankAccount.deposit(valueToDeposit);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}