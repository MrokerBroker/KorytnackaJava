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

    public void vrtulka (double dlzka) {
        for (int i = 0; i < 8; i++) {
            this.step(dlzka);
            this.turn(45);
            this.step(10);
            this.center();
        }
    }

    public void Kriz( double strana ){
        this.setPenColor(Color.red);
        this.setPenWidth(5);
        this.penUp();
        this.turn(-90);
        this.step(strana/2);
        this.penDown();
        this.turn(90);
        for (int i = 0; i<4 ;i++) {
            this.step(strana);
            this.turn(90);
            this.step(strana);
            this.turn(90);
            this.step(strana);
            this.turn(-90);
            }
        }
    public void diamant(double dlzka,double uhol){
        this.setPenColor(Color.red);
        this.turn(uhol/2);
        this.step(dlzka);
        this.turn(-uhol);
        this.step(dlzka);
        this.turn(180+uhol);
        this.step(dlzka);
        this.turn(-uhol);
        this.step(dlzka);
    }
    public void mitsubishi(double dlzka,double uhol) {
        this.setPenColor(Color.red);
        for (int i=0; i < 3; i++) {
            this.turn(uhol / 2);
            this.step(dlzka);
            this.turn(-uhol);
            this.step(dlzka);
            this.turn(180 + uhol);
            this.step(dlzka);
            this.turn(-uhol);
            this.step(dlzka);
            this.turn(0.5 * uhol - 180);
            this.turn(120);
            //komentarises
        }
    }

    public void Hviezda4(double strana, double uhol){
        this.setPenColor(Color.blue);
        for(int i=0;i<4;i++){
            this.turn(uhol/2);
            this.step(strana);
            this.turn(180-uhol);
            this.step(strana);
            this.turn(-90+uhol/2);
        }
    }

    public void plnyStvorec(double strana){
        this.setFillColor(Color.magenta);
        this.penUp();
        this.openPolygon();
        for (int i=0;i<4;i++){
            this.step(strana);
            this.turn(90);
        }
        this.closePolygon();
        this.penDown();
    }
    public void plnySestuholnik(double strana,int n){
        this.setFillColor(Color.red);
        this.penUp();
        this.openPolygon();
        for(int i=0;i<n;i++){
            this.step(strana);
            this.turn(360/n);
        }
        this.closePolygon();
    }

    public void Sipka(double dlzka){
        this.setFillColor(Color.magenta);
        this.penUp();
        this.openPolygon();
        this.turn(90);
        this.step(dlzka/2);
        for(int i=0;i<2;i++) {
            this.turn(-120);
            this.step(dlzka);
        }
        this.turn(-120);
        this.step(dlzka/2);
        this.turn(-90);
        this.closePolygon();
    }
    public void navigacnaSipka(double dlzka){
        for(int i=0;i<5;i++) {
            Sipka(dlzka);
            this.step(dlzka / 2);
        }
    }
    public void rovnoramennt(double strana, double uhol){
        double startX=this.getX();
        double startY=this.getY();
        this.turn(-uhol/2);
        this.step(strana);
                        
    }
}


