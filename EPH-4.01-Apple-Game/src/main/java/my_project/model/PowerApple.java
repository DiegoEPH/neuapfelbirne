package my_project.model;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class PowerApple extends Apple {
    public PowerApple(double x, double y) {
        super(x, y);

    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(217, 160, 20));
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawCircle(x, y, radius);
    }



    }

