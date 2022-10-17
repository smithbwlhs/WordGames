public class WordGames
{
    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    public String scramble()
    {
        // switch first half
        // and second half
        int length = word.length();
        int middle = length/2;
        String firstHalf = word.substring(0,middle);
        String secondHalf = word.substring(middle);
        return secondHalf + firstHalf;

    }


    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        return null;
    }


    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        return null;
    }


    public String toString()
    {
        // Games[word]
        return null;
    }


}
