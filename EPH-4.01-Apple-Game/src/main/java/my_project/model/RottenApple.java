package my_project.model;

import KAGO_framework.view.DrawTool;

import java.awt.*;

public class RottenApple extends Apple{
        public RottenApple(double x, double y) {
            super(x, y);

        }

        @Override
        public void draw(DrawTool drawTool) {
            drawTool.setCurrentColor(new Color(45, 41, 18));
            drawTool.drawFilledCircle(x, y, radius);
            drawTool.setCurrentColor(0, 0, 0, 255);
            drawTool.drawCircle(x, y, radius);
        }
}
