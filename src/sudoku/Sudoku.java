package sudoku;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Aplicação Sudoku
 *
 * @author POO 2018/2019
 * @version jun/2019
 */
// Nível 1
public class Sudoku extends Application {

    @Override
    public void start(Stage primaryStage) {

        AccordionPane root = new AccordionPane();
        Scene scene = new Scene(root, 700, 700);

        primaryStage.setTitle("Sudoku");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
