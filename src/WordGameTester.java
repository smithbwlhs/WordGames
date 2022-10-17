import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Please enter a word: ");
        String usersWord = input.nextLine();
        // Scramble it
        WordGames game1 = new WordGames(usersWord);
        String scrambled = game1.scramble();

        // Print out scrambled word
        System.out.println(scrambled);


        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();

        System.out.println(game1.bananaSplit(idx,word));


        // Ask for a character (store as a String)
        System.out.println("Please enter a character in "+game1 + " : ");
        String letter = input.nextLine();
        // Ask for random word
        System.out.println("Please enter a random word: ");
        word = input.nextLine();
        // Add random word at character
        // Print out the word
        System.out.println(game1.bananaSplit(letter,word));



    }
}
