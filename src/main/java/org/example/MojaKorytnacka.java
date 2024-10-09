package org.example;

import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class MojaKorytnacka extends Turtle {
    public void trojuholnik(int dlzka) {
        this.step(dlzka);
        this.turn(120);
        this.step(dlzka);
        this.turn(120);
        this.step(dlzka);
        this.turn(120);
    }

    public void zahada(int dlzka) {
        this.trojuholnik(dlzka);
        this.turn(120);
        this.trojuholnik(dlzka);
        this.turn(120);
        this.trojuholnik(dlzka);
        this.turn(120);
    }

    public void stvorec(double dlzka) {
        for (int i = 0; i < 4; i++) {
            this.step(dlzka);
            this.turn(90);
        }
    }
    public void ciarkaBodkaCiarka (double dlzka)
        {
            this.step(dlzka / 2);
            this.penUp();
            this.step(dlzka / 6);
            this.setFillColor(Color.orange);
            this.dot(dlzka / 12);
            this.step(dlzka / 6);
            this.penDown();
            this.step(dlzka / 2);
        }
    }

