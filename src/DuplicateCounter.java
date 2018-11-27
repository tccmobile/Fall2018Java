import java.util.Scanner;

public class DuplicateCounter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ItemCount<String> wordCounter = new ItemCount<String>();
        String inputWord;

        wordCounter.setItem("that");

        System.out.println("Enter words (END at end):");

        // Read first word
        inputWord = scnr.next();

        // Keep reading until word read equals <end>
        while( !inputWord.equals("END") ) {
            wordCounter.incrementIfDuplicate(inputWord);

            // Read next word
            inputWord = scnr.next();
        }

        // Display final word count
        System.out.println("The word \"" + wordCounter.getItem() +
                "\" was read " + wordCounter.getCount() +
                " times.");
    }
}
