/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J3B.farmapp.mainPackage;

import J3B.farmapp.controller.GameController;

/**
 *
 * @author bewblaze01
 */
public class GardenGame {

    public static void main(String[] args) {
        GameController myGameController;
        myGameController = new GameController();
        myGameController.startGame();
    }

}
