import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    out.println("\nSTART OF THE PROGRAM");
    Scanner sc = new Scanner(System.in);
    out.println("Enter the integers to be sorted, each separated from the next by a single semicolon (;). Press enter once you are finished to begin the sorting process.");
    String rawInputtedString = sc.nextLine();
    int[] numbers = Arrays.stream(rawInputtedString.replaceAll(",", "").split(";")).mapToInt(Integer::parseInt).toArray();

    out.print("\nEND OF THE PROGRAM");
  }
  private static int[] sort(int[] input) {
    int[] remainingValues;
    int[] curValues;
    int curBit = 31;
    for(int i = 0; i < input.length; i++) {
      if ( input[i] >> curBit & (int) 0x01 == 1) {
        curValues.add(input[i]);
      }
      else {
        remainingValues.add(input[i]);
      }
    }
  }
}
