import java.util.Scanner;

public class Arvaa {
    public static void main(String[] args) throws Exception {
       
        Scanner in = new Scanner(System.in);
        String rightName = "Toivo";
        String input;
        String guess = "";
        int tries = 0;
        boolean stop = false;

        while (true) {
            System.out.println("Guess my name (if you want to quit though, type 'stop')\n");
            guess = in.nextLine();
            tries++;

            if (guess.equalsIgnoreCase("stop")) {
                stop = true;
                break;
            }
            
            if (guess.equalsIgnoreCase(rightName)) {
                System.out.println("Congrats, you got the right one!");
                break;
            }

        }
    }
}
