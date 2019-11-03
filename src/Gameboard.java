import java.util.ArrayList;
import java.util.List;

public class Gameboard {

    private char[][] board;
    private String crossword;
    private List<String> words;

    public Gameboard( String crossword, List<String> words) {
        this.board = new char[20][20];
        this.crossword = crossword;
        this.words = words;
        creatingGameboard();
    }

    public List<String> removeWord(String word){
        List<String> listOfWords = this.words;
        char [] arrBoard = crossword.toCharArray();
        if (arrContains(arrBoard,word)){
            listOfWords.remove(word);
            words = listOfWords;
        }
        return words;
    }

    public void creatingGameboard(){
        char [] swapBoard = this.crossword.toCharArray();
        int k = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
               this.board[i][j] = swapBoard[k];
                k++;
            }
        }
    }

    public void printingGameboard(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(this.board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isComplete(){
        if (words.size()==0){
            return true;
        }
        return false;
    }

    private boolean arrContains(char[] arr, String word){
        char[] wordOfChars = word.toCharArray();
        int lenghtOfWord = word.length();

        String wordForReverse = reverseOfWord(word);
        char[] reverseOfChars = wordForReverse.toCharArray();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < lenghtOfWord; j++) {
                // --->
                if (arr[i] == wordOfChars[j] && arr[i+lenghtOfWord]== wordOfChars[lenghtOfWord]){
                    return true;
                }
                // <---
                if (arr[i] == reverseOfChars[j] && arr[i+lenghtOfWord]==reverseOfChars[lenghtOfWord]){
                    return true;
                }
            }
        }
        return false;
    }

    private String reverseOfWord (String word){
        int lenght = word.length();
        String swap_word= "";
        for (int i = lenght-1; i >= 0 ; i--) {
            swap_word = swap_word + word.charAt(i);
        }
        return swap_word;
    }

    public String solveCrossword(){
        String endString ="";
        if(isComplete()){
            while (!crossword.isEmpty()){
                //  TO DO
            }
        }

        return endString;
    }


}
