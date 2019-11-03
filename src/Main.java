import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String crossword = "";
        List<String> words = new ArrayList<String>();
        Crossword game = new Crossword(crossword, words);
        game.play();
    }
}
