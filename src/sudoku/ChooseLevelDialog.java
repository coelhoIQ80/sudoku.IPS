/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Jose-MSI
 */
public class ChooseLevelDialog extends Stage {

    private Level level = null;

    public ChooseLevelDialog(Level actualLevel) {

        setResizable(false);
        initStyle(StageStyle.UTILITY);
        initModality(Modality.APPLICATION_MODAL);
        setIconified(false);
        setTitle("Escolher Dificuldade");

        setScene(new Scene(createOptions(actualLevel)));

        centerOnScreen();
        showAndWait();
    }

    private VBox createOptions(Level actualLevel) {
        VBox vbox = new VBox();

        vbox.setPadding(new Insets(60));
        vbox.setSpacing(10);

        Label lblTitle = new Label("Dificuldade");
        lblTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 18));

        ToggleGroup group = new ToggleGroup();

        ToggleButton easyLevel = new ToggleButton(Level.EASY.toString());
        ToggleButton intermediateLevel = new ToggleButton(Level.INTERMEDIATE.toString());
        ToggleButton hardLevel = new ToggleButton(Level.HARD.toString());

        easyLevel.setToggleGroup(group);
        hardLevel.setToggleGroup(group);
        intermediateLevel.setToggleGroup(group);

        switch (actualLevel) {
            case EASY:
                group.selectToggle(easyLevel);
                break;
            case INTERMEDIATE:
                group.selectToggle(intermediateLevel);
                break;
            case HARD:
                group.selectToggle(hardLevel);
                break;
        }

        easyLevel.setFont(Font.font("Verdana", 16));
        easyLevel.setMinWidth(120);
        easyLevel.setOnAction(e -> {
            level = Level.EASY;
        });

        intermediateLevel.setFont(Font.font("Verdana", 16));
        intermediateLevel.setMinWidth(120);
        intermediateLevel.setOnAction(e -> {
            level = Level.INTERMEDIATE;
        });

        hardLevel.setFont(Font.font("Verdana", 16));
        hardLevel.setMinWidth(120);
        hardLevel.setOnAction(e -> {
            level = Level.HARD;
        });

        final HBox dialogButtons = new HBox(20);
        dialogButtons.setAlignment(Pos.CENTER);
        dialogButtons.setPadding(new Insets(30, 0, 0, 0));

        Button btnYes = new Button("Sim");
        btnYes.setOnAction(e -> {
            if (level == actualLevel) {
                level = null; // Sem alterações
            }
            close();
        });

        Button btnNo = new Button("Não");
        btnNo.setOnAction(e -> {
            level = null;
            close();
        });

        dialogButtons.getChildren().addAll(btnYes, btnNo);

        vbox.getChildren().addAll(lblTitle, easyLevel, intermediateLevel, hardLevel, dialogButtons);

        return vbox;
    }

    public Level getLevel() {
        return level;
    }
}
