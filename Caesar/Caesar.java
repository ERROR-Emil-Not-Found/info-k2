import java.util.Scanner;


public class Caesar {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the key (as integer): ");
        int tempKey = Integer.parseInt(sc.nextLine());
        CaesarChiffre caesar = new CaesarChiffre(tempKey);

        System.out.print("Enter text: "); 
        String text = sc.nextLine();
        
        System.out.println("Your text encoded is: ");
        System.out.println(
            caesar.encrypt(text)
        );

        System.out.print("your text decoded is: ");
        System.out.println(
            caesar.decrypt(text)
        );

    }

}