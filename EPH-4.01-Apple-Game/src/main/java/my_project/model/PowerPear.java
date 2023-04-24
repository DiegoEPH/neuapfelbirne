package my_project.model;


import KAGO_framework.view.DrawTool;

import java.awt.*;

public class PowerPear extends Fruit {

    //Attribute
    private double sin;{
        sin=0;
    }

    public PowerPear(double x, double y){
        super(x,y);
        width = 25;
        height = 35;

    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(131, 23, 194));
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,width,height);
    }

    @Override
    public void update(double dt) {
        super.update(dt);
        sin += 10*dt;
        x += Math.sin(sin)*10;
        fall();

    }





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
