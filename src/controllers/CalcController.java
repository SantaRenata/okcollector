/*
 * File: CalcController.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/andteki
 * Copyright (c) 2020-2022 Nagy János
 * Refaktorálva: Sánta Renáta Diána, 2022-11-28, Szoft II N
 * Github: https://github.com/SantaRenata
 * GNU GPL v2
 */

package controllers;

public class CalcController {
    public static double calcPerimeter(double aSide, double bSide) {
        return aSide + bSide; 
    }

    public static double calcArea(double aSide, double bSide) {
        return aSide * bSide;
    }
}
