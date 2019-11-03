import java.util.List;

public class Crossword {
    private String crossword;
    private  Gameboard gameboard;
    private List<String> words;

    public Crossword(String crossword, List<String> words) {
        this.crossword = crossword;
        this.words = words;
        this.gameboard = new Gameboard(crossword, words);
    }

    public void play(){
        while (!this.gameboard.isComplete()){
            for (int i = 0; i <20; i++) {
                for (int j = 0; j <20; j++) {
                    // checking chars in board
                }
            }
        }
        this.gameboard.printingGameboard();
    }
}
