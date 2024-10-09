package org.example;

import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class MojaKorytnacka extends Turtle {
    public void trojuholnik(double dlzka) {
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
    public void domcek (double dlzka){
        this.stvorec(dlzka);
        this.step(dlzka);
        this.turn(30);
        this.trojuholnik(dlzka);
    }
    public void slniecko (double polomer){
        this.setPenColor(Color.yellow);
        this.setFillColor(Color.yellow);
        for (int i=0;i<=36;i++){
            this.step(2*polomer);
            this.step(-2*polomer);
            this.turn(10);
        }
        this.dot(polomer);
        this.setVisible(false);
    }
}

