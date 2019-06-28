package sudoku;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

/**
 * Representa um número do jogo
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 4
public class Cell extends ChoiceBox {

    private final int rowNumber;
    private final int columnNumber;

    private final ObservableList<String> items;

    public Cell(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;

        items = FXCollections.observableArrayList();
        addChoices();
        setItems(items);
        this.getSelectionModel().selectFirst();
    }

    private void addChoices() {
        items.addAll(" ", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        this.setMaxWidth(45);
        this.setMinWidth(45);
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setCellValue(String value) {
        this.setValue(value);
    }

}
