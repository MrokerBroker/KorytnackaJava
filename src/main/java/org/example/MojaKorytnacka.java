package org.example;

import sk.upjs.jpaz2.Turtle;

public class MojaKorytnacka extends Turtle {
    public void trojuholnik(int dlzka) {
        this.step(dlzka);
        this.turn(120);
        this.step(dlzka);
        this.turn(120);
        this.step(dlzka);
        this.turn(120);
    }
    public void zahada(int dlzka){
        this.trojuholnik(dlzka);
        this.turn(120);
        this.trojuholnik(dlzka);
        this.turn(120);
        this.trojuholnik(dlzka);
        this.turn(120);
    }
    public void stvorec(double dlzka){
        for (int i=0; i<4;i++){
            this.step(dlzka);
            this.turn(90);
        }
    }
}
