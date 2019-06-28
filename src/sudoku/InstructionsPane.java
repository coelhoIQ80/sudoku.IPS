package sudoku;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Instruções do jogo
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 1
public class InstructionsPane extends TitledPane {

    public InstructionsPane() {
        setText("Sudoku: Como Jogar");
        setFont(Font.font("Verdana", FontWeight.BOLD, 18));

        // Nível 2
        setContent(createInstructions());
    }

    // Nível 2
    private Node createInstructions() {
        VBox vbox = new VBox();

        vbox.setPadding(new Insets(60));
        vbox.setSpacing(10);

        Label lblTitle = new Label("Sudoku: Como Jogar");
        lblTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

        String instructions = "\nO Sudoku é um passatempo que envolve raciocínio e lógica."
                + "\n\nA ideia do jogo é completar as 81 células usando números de 1 a 9,"
                + "\nsem repetir números na mesma linha, coluna ou quadrado 3 x 3.";

        TextArea txtInstructions = new TextArea(instructions);
        txtInstructions.setFont(Font.font("Verdana", 16));
        txtInstructions.setWrapText(true);
        txtInstructions.setPrefRowCount(5);
        txtInstructions.setEditable(false);

        vbox.getChildren().addAll(lblTitle, txtInstructions);

        return vbox;
    }

}
