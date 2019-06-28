package sudoku;

import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.StackPane;

/**
 * Painel de acordeão
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 1
public class AccordionPane extends StackPane {

    private Accordion accordion;
    private TitledPane instructionsPane;
    private TitledPane optionsPane;
    // Nível 3
    private TitledPane sudokuPane;

    public AccordionPane() {
        createAccordion();
    }

    // Nível 1
    private void createAccordion() {
        accordion = new Accordion();

        instructionsPane = new InstructionsPane();
        optionsPane = new OptionsPane();
        sudokuPane = new SudokuPane();

        accordion.getPanes().add(instructionsPane);
        accordion.getPanes().add(optionsPane);

        // Nível 3
        accordion.getPanes().add(sudokuPane);

        getChildren().add(accordion);
    }
}
