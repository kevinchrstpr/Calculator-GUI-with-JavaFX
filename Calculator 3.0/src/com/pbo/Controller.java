package com.pbo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    public boolean mulai = true;
    public Text output;
    public String operan = "";
    public long angka1 = 0;
    public Perhitungan itung = new Perhitungan();

    public void tombolAngka(ActionEvent actionEvent){
        if (mulai){
            output.setText("");
            mulai = false;
        }
        String angka = ((Button)actionEvent.getSource()).getText();
        output.setText(output.getText() + angka);
    }

    public void tombolOperan(ActionEvent actionEvent){
        String operator = ((Button)actionEvent.getSource()).getText();

        if (!"=".equals(operator)){
            if (!operan.isEmpty())
                return;
            operan = operator;
            angka1 = Long.parseLong(output.getText());
            output.setText("");
        } else {
            if (operan.isEmpty())
                return;
            output.setText(String.valueOf(itung.hitung(angka1, Long.parseLong(output.getText()), operan)));
            operan = "";
            mulai = true;
        }
    }

    public void tombolReset(ActionEvent actionEvent){
        String balik = "0";
        output.setText(balik);
    }

    public void klikClose(ActionEvent actionEvent) {
        String close = ((Button)actionEvent.getSource()).getText();
        System.out.println("App " + close + "d");
        Platform.exit();
    }
}
