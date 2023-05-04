package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.Config;
import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    private Apple apple01, apple02, apple03, apple04;
    private Pear pear01, pear02, pear03, pear04, pear05;
    private Player player01;
    private SecondPlayer secondPlayer01;

    private Banane banane01;
    private PowerApple powerApple01;
    private RottenApple rottenApple01;
    private PowerPear powerPear01;


    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        double xPos = Math.random()*(Config.WINDOW_WIDTH-50) + 50;
        double yPos = Math.random()*(Config.WINDOW_HEIGHT-50) + 50;
        apple01 = new Apple(xPos, yPos);
        viewController.draw(apple01);
        apple02 = new Apple(xPos, yPos);
        viewController.draw(apple02);
        apple03 = new Apple(xPos, yPos);
        viewController.draw(apple03);
        apple04 = new Apple(xPos, yPos);
        viewController.draw(apple04);


        powerApple01 = new PowerApple(xPos, yPos);
        viewController.draw(powerApple01);

        rottenApple01 = new RottenApple(xPos,yPos);
        viewController.draw(rottenApple01);

        xPos = Math.random()*(Config.WINDOW_WIDTH-50) + 50;
        yPos = Math.random()*(Config.WINDOW_HEIGHT-50) + 50;
        pear01 = new Pear(xPos, yPos);
        viewController.draw(pear01);
        pear02 = new Pear(xPos, yPos);
        viewController.draw(pear02);
        pear03 = new Pear(xPos, yPos);
        viewController.draw(pear03);
        pear04 = new Pear(xPos, yPos);
        viewController.draw(pear04);
        pear05 = new Pear(xPos, yPos);
        viewController.draw(pear05);
        banane01 = new Banane(xPos, yPos);
        viewController.draw(banane01);

        player01 = new Player(0, Config.WINDOW_HEIGHT-100);
        viewController.draw(player01);
        viewController.register(player01);

        secondPlayer01 = new SecondPlayer(1000, Config.WINDOW_HEIGHT-100);
        viewController.draw(secondPlayer01);
        viewController.register(secondPlayer01);

        powerPear01 = new PowerPear(xPos, yPos);
        viewController.draw(powerPear01);

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
        if (checkAndHandleCollision(apple01)) {
            apple01.jumpBack();


        }
        if (checkAndHandleCollision(apple02)) {
            apple02.jumpBack();


        }
        if (checkAndHandleCollision(apple03)) {
            apple03.jumpBack();


        }
        if (checkAndHandleCollision(apple04)) {
            apple04.jumpBack();


        }
        if (checkAndHandleCollision(pear01)) {
            pear01.jumpBack();


        }
        if (checkAndHandleCollision(pear02)) {
            pear02.jumpBack();


        }
        if (checkAndHandleCollision(pear03)) {
           pear03.jumpBack();


        }
        if (checkAndHandleCollision(pear04)) {
            pear04.jumpBack();


        }
        if (checkAndHandleCollision(pear05)) {
            pear05.jumpBack();


        }
        if (checkAndHandleCollision(banane01)) {
            banane01.jumpBack();


        }
        if (checkAndHandleCollision(powerApple01)) {
            powerApple01.jumpBack();
            player01.setSpeed(player01.getSpeed()+Math.random()+500);
            secondPlayer01.setSpeed(secondPlayer01.getSpeed()+Math.random()+500);


        }
        if (checkAndHandleCollision(rottenApple01)) {
            rottenApple01.jumpBack();
            player01.setSpeed(50);
            secondPlayer01.setSpeed(50);


        }
        if (checkAndHandleCollision(powerPear01)) {
            powerPear01.jumpBack();
            player01.setWidth(player01.getWidth()+30);
            secondPlayer01.setWidth(secondPlayer01.getWidth()+30);


        }



    }



        //TODO 06 Fügen Sie eine Methode checkAndHandleCollision(Apple a) hinzu. Diese gibt true zurück, falls das Apple-Objekt mit dem Player-Objekt kollidiert. Nutzen Sie hierzu die collidesWith-Methode der Klasse GraphicalObject.
        public boolean checkAndHandleCollision (Pear p){
            return p.collidesWith(player01) || p.collidesWith(secondPlayer01);

        }
        public boolean checkAndHandleCollision (Apple a){
            return a.collidesWith(player01) || a.collidesWith(secondPlayer01);

        }

    public boolean checkAndHandleCollision (PowerApple pa){
        return pa.collidesWith(player01) || pa.collidesWith(secondPlayer01);


        }

   public boolean checkAndHandleCollision (RottenApple ra){
       return  ra.collidesWith(player01) || ra.collidesWith(secondPlayer01);

        }
    public boolean checkAndHandleCollision (Banane b){
        return b.collidesWith(player01) || b.collidesWith(secondPlayer01);


        }
    public boolean checkAndHandleCollision (PowerPear pp){
        return pp.collidesWith(player01) || pp.collidesWith(secondPlayer01);


    }

}


