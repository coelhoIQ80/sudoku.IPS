package sudoku;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

/**
 * Jogo
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 3
public class SudokuPane extends TitledPane {

    private VBox vboxGame;
    private SampleGames samples;
    private Game currentGame;
    private final List<Row> rows;

    public SudokuPane() {
        this.setText("Sudoku: Jogar");
        this.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        rows = new ArrayList<>();

        this.setContent(createContent());
    }

    private Node createContent() {
        VBox vbox = new VBox();
        HBox hboxButtons = new HBox();

        vbox.setPadding(new Insets(30));
        vbox.setAlignment(Pos.CENTER);

        vboxGame = new VBox();
        vboxGame.setPadding(new Insets(30));
        vboxGame.setAlignment(Pos.CENTER);

        for (int i = 1; i <= 9; i++) {
            Row row = new Row(i);
            vboxGame.getChildren().add(row);
            rows.add(row);
        }

        hboxButtons.setPadding(new Insets(30));
        hboxButtons.setAlignment(Pos.CENTER);
        hboxButtons.setSpacing(20);

        Button btnNewGame = new Button("Novo jogo");
        btnNewGame.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        btnNewGame.setMinWidth(120);
        btnNewGame.setOnAction(e -> new ConfirmDialog("Pedido de confirmação", "Confirma que pretende carregar um novo jogo?"
                + "\n\nO jogo atual não será guardado.\n", eYes -> loadNewGame()));

        Button btnExit = new Button("Terminar");
        btnExit.setFont(Font.font("Verdana", FontWeight.BOLD, 14));
        btnExit.setMinWidth(120);
        btnExit.setOnAction(e -> Platform.exit());

        hboxButtons.getChildren().addAll(btnNewGame, btnExit);

        samples = new SampleGames();
        loadNewGame();

        vbox.getChildren().addAll(vboxGame, hboxButtons);

        return vbox;
    }

    private void loadNewGame() {
        currentGame = samples.randomGame();
        String[][] numbers = currentGame.getInitialNumbers();

        rows.forEach((r) -> {
            r.getRowCells().forEach((c) -> {
                String number = numbers[c.getRowNumber() - 1][c.getColumnNumber() - 1];
                c.setCellValue(number);
            });
        });
    }
}
