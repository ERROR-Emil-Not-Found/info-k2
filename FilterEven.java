import java.util.ArrayList;

class FilterEven {

    private static ArrayList<Integer> n = new ArrayList();


    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            n.add(i);
        }

        ArrayList<Integer> fuckYou = filterEven(n); //bruh java why the heck
        
        for(Integer i : fuckYou) {
            System.out.print(Integer.toString(i) + ", ");
        }
    }

    private static ArrayList filterEven(ArrayList<Integer> natural) {
        ArrayList<Integer> even = new ArrayList();
        for(Integer i : natural) {
            if(i % 2 == 0) {
                even.add(i);
            }
        }
        return even;
    }
}