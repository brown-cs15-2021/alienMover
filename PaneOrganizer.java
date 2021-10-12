package alienMover;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PaneOrganizer {

    private BorderPane root;
    private Alien alien;

    public PaneOrganizer() {
        this.root = new BorderPane();
        Pane alienPane = new Pane();
        this.root.setCenter(alienPane);
        HBox buttonPane = new HBox();
        this.root.setBottom(buttonPane);
        this.alien = new Alien(alienPane);
        this.setUpButtons(buttonPane);
    }

    private void setUpButtons(HBox buttonPane) {
        Button b1 = new Button("Move Left!");
        Button b2 = new Button("Move Right!");
        buttonPane.getChildren().addAll(b1, b2);
        buttonPane.setSpacing(Constants.BUTTON_SPACING);
        buttonPane.setAlignment(Pos.CENTER);
        b1.setOnAction((ActionEvent e) -> this.alien.moveLeft());
        b2.setOnAction((ActionEvent e) -> this.alien.moveRight());
    }

    public Pane getRoot() {
        return this.root;
    }
}
