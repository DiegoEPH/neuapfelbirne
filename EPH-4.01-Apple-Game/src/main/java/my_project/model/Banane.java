package my_project.model;

import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Banane extends Fruit {
    public Banane(double x, double y){
        super(x,y);
        width = 25;
        height = 35;

    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(215, 199, 40));
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,width,height);
    }

    @Override
    public void update(double dt) {
        super.update(dt);
        fall();

    }





    //TODO 03 Eine Birne soll von oben herab fallen. Sobald sie unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 04).

    public void jumpBack(){
        y=-200;
        x=Math.random()*800+100;

    }
    public void fall(){
        if (y>1000){
            jumpBack();
        }
    }
}
