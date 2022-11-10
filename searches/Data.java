package searches;
import java.util.Scanner;

public class Data {

    private static int[] data = new int[32];

    private static Scanner sc = new Scanner(System.in);
    private static Search search = new Search();

    public static void main(String[] args) {
        for(int i = 0; i < data.length; i++) {
            data[i] = 32 + i;
        }


        while(true) {
            try {
                System.out.println("enter number to be found (in the range [32; 64)): ");
                int toFind = Integer.parseInt(sc.nextLine());
                
                System.out.print("Linear Sort: ");
                int ls = search.linearSearch(toFind, data);
                if(ls == -1) {
                    System.out.println("not found in array");
                } else {
                    System.out.println(String.format("Found at position %s", ls));
                }
                
                System.out.print("Binary Sort: ");
                int bs = search.binarySearch(toFind, data);
                if (bs == -1) {
                    System.out.println("not found in array");
                } else {
                    System.out.println(String.format("Found at position %s", bs));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }

    

    


    
}
