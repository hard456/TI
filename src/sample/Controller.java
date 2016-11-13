package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.sql.Time;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable{
    @FXML
    public Circle S1R;
    @FXML
    public Circle S1Y;
    @FXML
    public Circle S1G;
    @FXML
    public Circle S2G;
    @FXML
    public Circle S2R;
    @FXML
    public Circle S2Y;
    @FXML
    public Circle S3G;
    @FXML
    public Circle S3R;
    @FXML
    public Circle S3Y;
    @FXML
    public Circle S4R;
    @FXML
    public Circle S4G;
    @FXML
    public Circle S4Y;
    @FXML
    public Circle S5R;
    @FXML
    public Circle S5G;
    @FXML
    public Circle S5Y;
    @FXML
    public Circle SG;
    @FXML
    public Circle S6Y;
    @FXML
    public Circle S6G;
    @FXML
    public Circle S6R;
    @FXML
    public Circle S7Y;
    @FXML
    public Circle S7G;
    @FXML
    public Circle S7R;
    @FXML
    public Circle C1R;
    @FXML
    public Circle C1G;
    @FXML
    public Circle C2R;
    @FXML
    public Circle C2G;
    @FXML
    public Circle C3R;
    @FXML
    public Circle C3G;
    @FXML
    public Circle C4R;
    @FXML
    public Circle C4G;
    @FXML
    public Circle C5R;
    @FXML
    public Circle C5G;
    @FXML
    public Circle C6R;
    @FXML
    public Circle C6G;
    @FXML
    public Circle C7R;
    @FXML
    public Circle C7G;
    @FXML
    public Circle C8R;
    @FXML
    public Circle C8G;
    @FXML

    public void volej(){

        System.out.println("kokot"); //jako pán Na PÁNA si myslel???? co zas jedeš, co děláš, si normární?
        C1R.setFill(Paint.valueOf("#ffffff"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        timing();
    }
    public int p = 0;
    public void timing(){

        SemaforChodci chodciLeva = new SemaforChodci(C1R, C1G, C2R, C2G);
        SemaforChodci chodciHorni = new SemaforChodci(C3R, C3G, C4R, C4G);
        SemaforChodci chodciPrava = new SemaforChodci(C5R, C5G, C6R, C6G);
        SemaforChodci chodciDolni = new SemaforChodci(C7R, C7G, C8R, C8G);
        Semafor S1 = new Semafor(S1R, S1Y, S1G);
        Semafor S2 = new Semafor(S2R, S2Y, S2G);
        Semafor S3 = new Semafor(S3R, S3Y, S3G);
        Semafor S4 = new Semafor(S4R, S4Y, S4G);
        Semafor S5 = new Semafor(S5R, S5Y, S5G);
        Semafor S6 = new Semafor(S6R, S6Y, S6G);
        Semafor S7 = new Semafor(S7R, S7Y, S7G);
        SemaforDoprava green = new SemaforDoprava(SG);
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                if (p == 0) {

                }
                if (p == 1) {

                    S1.setRedYellow();
                    S2.setRedYellow();
                    S7.setRedYellow();

                } else if (p == 2) {

                    S1.setGreen();
                    S2.setGreen();
                    S7.setGreen();
                    chodciDolni.setGreen();

                } else if (p == 3) {

                    S1.setYellow();
                    S2.setYellow();
                    S7.setYellow();
                    S3.setRedYellow();
                    S6.setRedYellow();
                    chodciDolni.setRed();

                } else if (p == 4) {

                    S3.setGreen();
                    S6.setGreen();
                    S7.setRed();
                    S1.setRed();
                    S2.setRed();
                    chodciLeva.setGreen();
                    chodciPrava.setGreen();

                } else if (p == 5) {

                    S3.setYellow();
                    S6.setYellow();
                    S4.setRedYellow();
                    S5.setRedYellow();
                    green.setGreen();
                    chodciLeva.setRed();
                    chodciPrava.setRed();

                } else if (p == 6) {

                    S3.setRed();
                    S6.setRed();
                    S4.setGreen();
                    S5.setGreen();
                    chodciHorni.setGreen();

                } else if (p == 7) {

                    S4.setYellow();
                    S5.setYellow();
                    chodciHorni.setRed();

                } else if (p == 8) {

                    S4.setRed();
                    S5.setRed();
                    green.disabled();
                    S1.setRedYellow();
                    S2.setRedYellow();
                    S7.setRedYellow();
                    p=1;
                }
                p++;
            }

        }, 0, 2000);
    }

}




