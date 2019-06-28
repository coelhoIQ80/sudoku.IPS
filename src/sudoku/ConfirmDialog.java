
package sudoku;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Caixa de diálogo - Confirmação
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 2
public class ConfirmDialog extends Stage {
    
    public ConfirmDialog(String title, String message, final EventHandler<ActionEvent> actionYes) {
        VBox dialogPane = new VBox(10);
        dialogPane.setPadding(new Insets(10));
        dialogPane.setAlignment(Pos.CENTER);

        Label lblMessage = new Label(message);
        lblMessage.setStyle("-fx-font-weight: bold;");

        final HBox dialogButtons = new HBox(10);
        dialogButtons.setAlignment(Pos.CENTER);
        
        Button btnYes = new Button("Sim");
        btnYes.setOnAction(e -> {
            actionYes.handle(e);
            ((Stage)dialogButtons.getScene().getWindow()).close();
        });
        
        Button btnNo = new Button("Não");
        btnNo.setOnAction(e -> ((Stage)dialogButtons.getScene().getWindow()).close());
        
        dialogButtons.getChildren().addAll(btnYes,btnNo);

        dialogPane.getChildren().addAll(lblMessage,dialogButtons);
        
        setResizable(false);
        initStyle(StageStyle.UTILITY);
        initModality(Modality.APPLICATION_MODAL);
        setIconified(false);
        setTitle(title);
        
        setScene(new Scene(dialogPane));
        show();
    }
}
