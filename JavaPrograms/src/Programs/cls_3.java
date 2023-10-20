package Programs;
//3. Check if the input is panagram or not. (Panagram is a sentence that contains all the alphabets from a-z)
import java.util.Scanner;
public class cls_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }
    public static boolean checkPangram(String sentence) {
        boolean[] alphabet = new boolean[26]; // Array to mark the presence of letters a-z
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; // Convert character to index (0-25)
                alphabet[index] = true;
            }
        }
        // Check if all letters a-z are present
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
	}
}
