package sample;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class SemaforDoprava {
    private Circle green;

    public SemaforDoprava(Circle green) {
        this.green = green;
    }

    public void disabled(){
        green.setFill(Paint.valueOf("#084600"));
    }

    public void setGreen(){
        green.setFill(Paint.valueOf("#00FF00"));
    }
}
