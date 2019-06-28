package sudoku;

import java.util.ArrayList;
import java.util.List;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

/**
 * Linha do jogo
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 4
public class Row extends HBox {

    private final int rowNumber;
    private final List<Cell> rowCells;

    public Row(int rowNumber) {
        this.rowNumber = rowNumber;
        rowCells = new ArrayList<>();
        createCells();
    }

    private void createCells() {

        for (int j = 1; j <= 9; j++) {
            Cell cell = new Cell(this.rowNumber, j);

            cell.setStyle("-fx-border-color: black");

            switch (this.rowNumber) {
                case 1:
                case 2:
                case 3:
                case 7:
                case 8:
                case 9:
                    if (j == 4 || j == 5 || j == 6) {
                        cell.setStyle("-fx-border-color: red");
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    if (j != 4 && j != 5 && j != 6) {
                        cell.setStyle("-fx-border-color: red");
                    }
            }

            this.setAlignment(Pos.CENTER);
            this.setHeight(50);

            this.getChildren().add(cell);
            rowCells.add(cell);
        }
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public List<Cell> getRowCells() {
        return rowCells;
    }

}
