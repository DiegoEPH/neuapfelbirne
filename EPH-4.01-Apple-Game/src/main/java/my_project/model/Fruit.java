package my_project.model;

import KAGO_framework.model.GraphicalObject;
import my_project.control.ProgramController;

public class Fruit extends GraphicalObject {

    protected double speed;

    public Fruit(double x, double y) {
        this.x = x;
        this.y = y;
        speed = 150;
    }

    public void update(double dt) {
        y = y + 100 * dt;

        //TODO 01 Ein Apfel soll von oben herab fallen. Sobald er unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 02).
    }



    }

