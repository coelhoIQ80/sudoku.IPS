package sudoku;

import java.util.ArrayList;
import java.util.Random;

/**
 * Sudokus fornecidos com a aplicação
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
public class SampleGames extends ArrayList<Game> {

    SampleGames() {
        addSampleGames();
    }

    private void addSampleGames() {
        Game game1 = new Game();

        String[][] initialNumbers1 = {
            {" ", " ", " ", " ", "6", "8", " ", " ", " "},
            {"8", " ", " ", " ", " ", " ", "6", " ", "5"},
            {" ", "9", "3", " ", " ", " ", "4", " ", " "},
            {" ", "2", " ", "4", "9", " ", " ", "1", " "},
            {"5", "1", " ", "8", " ", "6", " ", " ", "2"},
            {" ", " ", "8", "7", " ", " ", " ", " ", " "},
            {" ", "4", " ", " ", " ", " ", "3", "2", " "},
            {" ", " ", " ", " ", " ", " ", "9", "4", " "},
            {" ", " ", "7", " ", " ", " ", " ", " ", " "}
        };
        game1.setInitialNumbers(initialNumbers1);
        game1.setLevel(Level.EASY);
        game1.setSolution("images/01_sudoku_1_sol.png");
        add(game1);

        Game game2 = new Game();
        String[][] initialNumbers2 = {
            {" ", " ", " ", " ", " ", "9", "5", "1", "3"},
            {"5", " ", "7", " ", " ", " ", " ", "9", " "},
            {" ", " ", "8", " ", " ", "3", " ", " ", "7"},
            {" ", "2", "5", " ", " ", " ", " ", " ", " "},
            {"3", " ", " ", "4", "5", "2", "8", " ", " "},
            {" ", "8", " ", " ", "7", "1", "3", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", "9"},
            {" ", " ", "6", " ", " ", "8", " ", " ", " "},
            {" ", "5", "9", " ", " ", " ", " ", " ", "2"}
        };
        game2.setInitialNumbers(initialNumbers2);
        game2.setLevel(Level.EASY);
        game2.setSolution("images/02_sudoku_1_sol.png");
        add(game2);
    }

    public Game randomGame() {
        Random randomSequence = new Random();
        int index = randomSequence.nextInt(this.size());
        return get(index);
    }
}
