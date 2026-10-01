 import java.util.Scanner;

public class StringDelAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         
        String orgStr = scanner.nextLine();

    
        int M = scanner.nextInt();
        int N = scanner.nextInt();

         
        int turns = calculateTurns(orgStr, M, N);

        System.out.println("Number of turns: " + turns);

        scanner.close();
    }

    public static int calculateTurns(String orgstr, int M, int N) {
        int turns = 0;
        String newstr = orgstr;

        while (true) {
            String hString = newstr.substring(newstr.length() - M) +
                                 newstr.substring(0, newstr.length() - M);
            String pString = newstr.substring(newstr.length() - N) +
                                  newstr.substring(0, newstr.length() - N);

            System
            
            if (hString.equals(orgstr) || pString.equals(orgstr)) {
                turns++;
                break;
            }

            turns++;
            newstr = hString;
        }

        return turns;
    }
}
