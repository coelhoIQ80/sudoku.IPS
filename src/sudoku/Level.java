package sudoku;

/**
 * Enumeration class Level - valores possíveis para o nível do jogo
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 3
public enum Level {
    EASY, INTERMEDIATE, HARD;

    @Override
    public String toString() {
        switch (this) {
            case INTERMEDIATE:
                return "Intermédio";
            case HARD:
                return "Difícil";
            case EASY:
            default:
                return "Fácil";
        }
    }
}
