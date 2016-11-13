package sample;


import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Semafor{
    private Circle red, green, yellow;

    public Semafor(Circle red, Circle yellow, Circle green) {
        this.red = red;
        this.yellow = yellow;
        this.green = green;

        setRed();
    }

    public void setRed(){
        red.setFill(Color.RED);
        yellow.setFill(Paint.valueOf("#795D00"));
        green.setFill(Paint.valueOf("#084600"));
    }
    public void setRedYellow(){
        red.setFill(Color.RED);
        yellow.setFill(Paint.valueOf("#FFCA00"));
        green.setFill(Paint.valueOf("#084600"));
    }
    public void setGreen(){
        red.setFill(Paint.valueOf("#460000"));
        yellow.setFill(Paint.valueOf("#795d00"));
        green.setFill(Paint.valueOf("#00FF00"));
    }

    public void setYellow(){
        red.setFill(Paint.valueOf("#460000"));
        yellow.setFill(Paint.valueOf("#FFCA00"));
        green.setFill(Paint.valueOf("#084600"));
    }
}


