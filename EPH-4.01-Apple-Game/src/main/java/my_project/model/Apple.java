package my_project.model;

import KAGO_framework.view.DrawTool;

public class Apple extends Fruit {

    //Attribute


    public Apple(double x, double y){
    super(x,y);
        radius = 30;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(255,0,0,255);
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawCircle(x,y,radius);
    }

    @Override
    public void update(double dt) {
    super.update (dt);
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




