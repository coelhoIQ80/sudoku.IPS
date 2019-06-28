package sudoku;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Opções do jogo - escolher nível de dificuldade para o jogo
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 1
public class OptionsPane extends TitledPane {

    // Nível 2
    private Level level;
    private Label lblTitle;

    public OptionsPane() {
        this.setText("Sudoku: Opções");
        this.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

        this.setContent(createOptions());
    }

    private Node createOptions() {
        VBox vbox = new VBox();

        vbox.setPadding(new Insets(60));
        vbox.setSpacing(30);

        level = Level.EASY;
        lblTitle = new Label("Dificuldade: " + level);
        lblTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

        Button btnChooseLevel = new Button("Alterar Dificuldade ...");
        btnChooseLevel.setOnAction(e -> chooseLevel());

        vbox.getChildren().addAll(lblTitle, btnChooseLevel);

        return vbox;
    }

    public String getLevel() {
        return level.toString();
    }

    private void chooseLevel() {
        ChooseLevelDialog chooseLevelDialog = new ChooseLevelDialog(level);
        if (chooseLevelDialog.getLevel() != null) {
            level = chooseLevelDialog.getLevel();
            lblTitle.setText("Dificuldade: " + level);
        }
    }
}
