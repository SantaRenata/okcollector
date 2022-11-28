/*
 * File: MainController.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * Refaktorálva: Sánta Renáta Diána, 2022-11-28, Szoft II N
 * Github: https://github.com/SantaRenata
 * GNU GPL v2
 */

package controllers;

import models.FileHandler;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainWindow.calcButton.addActionListener(e -> {
            this.onClickCalcButton();
        });
    }
    
    public void onClickCalcButton() {
        double aSide = Double.parseDouble(this.mainWindow.asideField.getText());
        double bSide = Double.parseDouble(this.mainWindow.bsideField.getText());
        Double perimeter = CalcController.calcPerimeter(aSide, bSide);
        Double area = CalcController.calcArea(aSide, bSide);

        this.mainWindow.perimeterField.setText(perimeter.toString());
        this.mainWindow.areaField.setText(area.toString());
        
        String line = perimeter.toString() + ":" + area.toString();
        FileHandler fileHandler = new FileHandler();
        fileHandler.writeFile(line);    
    }

    //TODO: adatbázisba írás
    
}

