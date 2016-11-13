package sample;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class SemaforChodci{

    private Circle aRed, aGreen, bRed, bGreen;

    public SemaforChodci(Circle aRed, Circle aGreen, Circle bRed, Circle bGreen) {
        this.aRed = aRed;
        this.aGreen = aGreen;
        this.bRed = bRed;
        this.bGreen = bGreen;

        this.setRed();

    }

    public void setGreen(){
        aRed.setFill(Paint.valueOf("#460000"));
        bRed.setFill(Paint.valueOf("#460000"));

        aGreen.setFill(Paint.valueOf("#00FF00"));
        bGreen.setFill(Paint.valueOf("#00FF00"));

    }

    public void setRed(){
        aGreen.setFill(Paint.valueOf("#084600"));
        bGreen.setFill(Paint.valueOf("#084600"));

        aRed.setFill(Color.RED);
        bRed.setFill(Color.RED);

    }
}
