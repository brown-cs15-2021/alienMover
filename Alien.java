package alienMover;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Alien {
    private Ellipse face;
    private Ellipse leftEye;
    private Ellipse rightEye;

    public Alien(Pane root) {
        this.face = new Ellipse(0, Constants.FACE_Y, Constants.FACE_RAD_X, Constants.FACE_RAD_Y);
        this.face.setFill(Color.CHARTREUSE);
        this.leftEye = new Ellipse(0, Constants.EYE_Y, Constants.EYE_RAD_X, Constants.EYE_RAD_Y);
        this.rightEye = new Ellipse(0, Constants.EYE_Y, Constants.EYE_RAD_X, Constants.EYE_RAD_Y);
        this.setXLoc(Constants.START_X_OFFSET);
        root.getChildren().addAll(this.face, this.leftEye, this.rightEye);
    }

    public void moveRight() {
        this.setXLoc(this.face.getCenterX() + Constants.DISTANCE_X);
    }

    public void moveLeft() {
        this.setXLoc(this.face.getCenterX() - Constants.DISTANCE_X);
    }

    private void setXLoc(double x) {
        this.face.setCenterX(x);
        this.leftEye.setCenterX(x - Constants.EYE_X_OFFSET);
        this.rightEye.setCenterX(x + Constants.EYE_X_OFFSET);
    }
}
