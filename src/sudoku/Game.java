package sudoku;

/**
 * Jogo
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
public class Game {

    private Level level;
    private String[][] initialNumbers;
    private String solution;

    public Game() {
    }

    public String[][] getInitialNumbers() {
        return this.initialNumbers;
    }

    public void setInitialNumbers(String[][] initialNumbers) {
        this.initialNumbers = initialNumbers;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String picture) {
        this.solution = picture;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
