package org.example;

import sk.upjs.jpaz2.JPAZUtilities;
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

    public void ciarkaBodkaCiarka(double dlzka) {
        this.step(dlzka / 2);
        this.penUp();
        this.step(dlzka / 6);
        this.setFillColor(Color.orange);
        this.dot(dlzka / 12);
        this.step(dlzka / 6);
        this.penDown();
        this.step(dlzka / 2);
    }

    public void domcek(double dlzka) {
        this.stvorec(dlzka);
        this.step(dlzka);
        this.turn(30);
        this.trojuholnik(dlzka);
    }

    public void slniecko(double polomer) {
        this.setPenColor(Color.yellow);
        this.setFillColor(Color.yellow);
        for (int i = 0; i <= 36; i++) {
            this.step(2 * polomer);
            this.step(-2 * polomer);
            this.turn(10);
        }
        this.dot(polomer);
        this.setVisible(false);
    }

    public void vrtulka(double dlzka) {
        for (int i = 0; i < 8; i++) {
            this.step(dlzka);
            this.turn(45);
            this.step(10);
            this.center();
        }
    }

    public void Kriz(double strana) {
        this.setPenColor(Color.red);
        this.setPenWidth(5);
        this.penUp();
        this.turn(-90);
        this.step(strana / 2);
        this.penDown();
        this.turn(90);
        for (int i = 0; i < 4; i++) {
            this.step(strana);
            this.turn(90);
            this.step(strana);
            this.turn(90);
            this.step(strana);
            this.turn(-90);
        }
    }

    public void diamant(double dlzka, double uhol) {
        this.setPenColor(Color.red);
        this.turn(uhol / 2);
        this.step(dlzka);
        this.turn(-uhol);
        this.step(dlzka);
        this.turn(180 + uhol);
        this.step(dlzka);
        this.turn(-uhol);
        this.step(dlzka);
    }

    public void mitsubishi(double dlzka, double uhol) {
        this.setPenColor(Color.red);
        for (int i = 0; i < 3; i++) {
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

    public void Hviezda4(double strana, double uhol) {
        this.setPenColor(Color.blue);
        for (int i = 0; i < 4; i++) {
            this.turn(uhol / 2);
            this.step(strana);
            this.turn(180 - uhol);
            this.step(strana);
            this.turn(-90 + uhol / 2);
        }
    }

    public void plnyStvorec(double strana) {
        this.setFillColor(Color.magenta);
        this.penUp();
        this.openPolygon();
        for (int i = 0; i < 4; i++) {
            this.step(strana);
            this.turn(90);
        }
        this.closePolygon();
        this.penDown();
    }

    public void plnySestuholnik(double strana, int n) {
        this.setFillColor(Color.red);
        this.penUp();
        this.openPolygon();
        for (int i = 0; i < n; i++) {
            this.step(strana);
            this.turn(360 / n);
        }
        this.closePolygon();
    }

    public void Sipka(double dlzka) {
        this.setFillColor(Color.magenta);
        this.penUp();
        this.openPolygon();
        this.turn(90);
        this.step(dlzka / 2);
        for (int i = 0; i < 2; i++) {
            this.turn(-120);
            this.step(dlzka);
        }
        this.turn(-120);
        this.step(dlzka / 2);
        this.turn(-90);
        this.closePolygon();
    }

    public void navigacnaSipka(double dlzka) {
        for (int i = 0; i < 5; i++) {
            Sipka(dlzka);
            this.step(dlzka / 2);
        }
    }

    public void rovnoramennt(double strana, double uhol) {
        double startX = this.getX();
        double startY = this.getY();
        this.turn(-uhol / 2);
        this.step(strana);

    }

    public void nachodnaPochodzka(int pocetKrokov, double polomer) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        this.setPosition(startX, startY);
        this.setDirection(natocenie);
        for (int i = 0; i < pocetKrokov; i++) {
            this.turn(90 * (int) (Math.random() * 4));
            if (this.distanceTo(startX, startY) < polomer / 3) {
                this.penUp();

            } else {
                this.penDown();
                if (this.distanceTo(startX, startY) < 2 * polomer / 3) {
                    this.setPenColor(Color.blue);

                } else {
                    this.setPenColor(Color.red);

                }
            }

            this.turn(Math.random() * 4);
            this.step(2);
            if (distanceTo(startX, startY) > polomer) {
                this.step(-2);
            }
            //JPAZUtilities.delay(1);nn
        }

    }

    public void nachodnaPochodzkaStvorec(int pocetKrokov, double strana) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        this.setPosition(startX, startY);
        this.setDirection(natocenie);
        for (int i = 0; i < pocetKrokov; i++) {
            this.turn(Math.random() * 360);
            this.step(5);
            if (this.getX() > startX + strana / 2 ||
                    this.getX() < startX - strana / 2 ||
                    this.getY() > startY + strana / 2 ||
                    this.getY() < startY - strana / 2) {
                this.step(-5);
            }
        }
    }

    public void plny_trojuholnik(double strana) {
        this.setFillColor(Color.red);
        this.setPenColor(Color.pink);
        this.openPolygon();
        for (int i = 0; i < 4; i++) {
            this.turn(-30);
            this.step(strana);
            this.turn(120);
            this.step(strana);
            this.turn(120);
            this.step(strana);
            this.turn(-120);
        }
        this.closePolygon();
    }

    public void moderneUmenie(int pocBodiek, double sirka, double vyska) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        this.turn(90);
        for (int i = 0; i < 2; i++) {
            this.step(sirka);
            this.turn(90);
            this.step(vyska);
            this.turn(90);
        }
        for (int i = 0; i < pocBodiek; i++) {
            double polomer = 2 + Math.random() * 5;
            double surX = startX + polomer + Math.random() * (sirka - 2 * polomer);
            double surY = startY + polomer + Math.random() * (vyska - 2 * polomer);
            if (Math.random() > 0.5) {
                this.setFillColor(Color.blue);
            } else {
                setFillColor(Color.red);
            }
            this.setPosition(surX, surY);
            this.dot(polomer);
            JPAZUtilities.delay(10);
        }

    }

    public void jemen(int pocKrokov, double sirka, double vyska) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < pocKrokov; i++) {
            if (this.getY() > startY - vyska / 6 || this.getY() < startY + vyska / 6) {
                this.setPenColor(Color.white);
            }
            if (this.getY() < startY - vyska / 6) {
                this.setPenColor(Color.red);
            }
            if (this.getY() > startY + vyska / 6) {
                this.setPenColor(Color.black);
            }
            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }
            this.turn(Math.random() * 360);
            this.step(2);

        }
        this.setPosition(startX - (sirka / 2) - 2, startY - (vyska / 2) - 2);
        this.setDirection(natocenie);
        this.setPenColor(Color.black);
        this.turn(90);
        for (int i = 0; i < 2; i++) {
            this.step(sirka + 4);
            this.turn(90);
            this.step(vyska + 4);
            this.turn(90);
        }

    }
    public void laos(int pocKrokov, double sirka, double vyska) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < pocKrokov; i++) {
            if (this.distanceTo(startX,startY)<vyska/5) {
                this.setPenColor(Color.white);
            }
            if (this.distanceTo(startX,startY)>vyska/5) {
                this.setPenColor(Color.blue);
            }
            if (this.getY()>startY+vyska/4 ||
                this.getY()<startY-vyska/4) {
                this.setPenColor(Color.red);
            }
            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }
            this.turn(Math.random() * 360);
            this.step(2);

        }
        this.setPosition(startX - (sirka / 2) - 2, startY - (vyska / 2) - 2);
        this.setDirection(natocenie);
        this.setPenColor(Color.black);
        this.turn(90);
        for (int i = 0; i < 2; i++) {
            this.step(sirka + 4);
            this.turn(90);
            this.step(vyska + 4);
            this.turn(90);
        }

    }
    public void japan(int pocKrokov, double sirka, double vyska) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < pocKrokov; i++) {
            if (this.distanceTo(startX,startY)<vyska/4) {
                this.setPenColor(Color.red);
            }
            if (this.distanceTo(startX,startY)>vyska/4) {
                this.setPenColor(Color.white);
            }
            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }
            this.turn(Math.random() * 360);
            this.step(2);

        }
        this.setPosition(startX - (sirka / 2) - 2, startY - (vyska / 2) - 2);
        this.setDirection(natocenie);
        this.setPenColor(Color.black);
        this.turn(90);
        for (int i = 0; i < 2; i++) {
            this.step(sirka + 4);
            this.turn(90);
            this.step(vyska + 4);
            this.turn(90);
        }

    }
    public void cad(int pocKrokov, double sirka, double vyska) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < pocKrokov; i++) {
            if (this.getX()<startX-sirka/6) {
                this.setPenColor(Color.blue);
            }
            else if (this.getX()>startX+sirka/6) {
                this.setPenColor(Color.red);
            }
            else {
                this.setPenColor(Color.yellow);
            }
            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }
            this.turn(Math.random() * 360);
            this.step(2);

        }
        this.setPosition(startX - (sirka / 2) - 2, startY - (vyska / 2) - 2);
        this.setDirection(natocenie);
        this.setPenColor(Color.black);
        this.turn(90);
        for (int i = 0; i < 2; i++) {
            this.step(sirka + 4);
            this.turn(90);
            this.step(vyska + 4);
            this.turn(90);
        }
//jjj
    }
    public void kolumbia(int pocKrokov, double sirka, double vyska) {
        double startX = this.getX();
        double startY = this.getY();
        double natocenie = this.getDirection();
        for (int i = 0; i < pocKrokov; i++) {
            if (this.getY()<startY) {
                this.setPenColor(Color.yellow);
            }
             if(this.getY()>startY) {
                this.setPenColor(Color.blue);
            }
            if (this.getY()>startY+vyska/4){
                this.setPenColor(Color.red);
            }
            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }
            this.turn(Math.random() * 360);
            this.step(2);

        }
        this.setPosition(startX - (sirka / 2) - 2, startY - (vyska / 2) - 2);
        this.setDirection(natocenie);
        this.setPenColor(Color.black);
        this.turn(90);
        for (int i = 0; i < 2; i++) {
            this.step(sirka + 4);
            this.turn(90);
            this.step(vyska + 4);
            this.turn(90);
        }

    }
    public void kostarika(int pocKrokov, double sirka, double vyska){
        double startX=this.getX();
        double startY=this.getY();
        double natocenie=this.getDirection();
        for(int i=0;i<pocKrokov;i++){
            if (this.getY()<startY+vyska/6
                    || this.getY()>startY-vyska/6) {
                this.setPenColor(Color.red);
            }
            if (this.getY()>startY+vyska/6
                || this.getY()<startY-vyska/6) {
                this.setPenColor(Color.white);
            }

            if (this.getY()>startY+vyska/3
                    || this.getY()<startY-vyska/3) {
                this.setPenColor(Color.blue);
            }

            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }


            this.setDirection(Math.random()*360);
            this.step(2);

        }

    }
    public void benin(int pocKrokov, double sirka, double vyska){
        double startX=this.getX();
        double startY=this.getY();
        double natocenie=this.getDirection();
        for(int i=0;i<pocKrokov;i++){
            if(this.getX()<startX-sirka/4){
                this.setPenColor(Color.green);
            }
            if(this.getX()>startX-sirka/4){
                this.setPenColor(Color.yellow);
            }
            if(this.getX()>startX-sirka/4
                && this.getY()>startY){
                this.setPenColor(Color.red);
            }


            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }


            this.setDirection(Math.random()*360);
            this.step(2);

        }

    }
    public void gambia(int pocKrokov, double sirka, double vyska){
        double startX=this.getX();
        double startY=this.getY();
        double natocenie=this.getDirection();
        for(int i=0;i<pocKrokov;i++){
            if (this.getY()>startY-vyska/8
                    || this.getY()<startY+vyska/8){
                this.setPenColor(Color.blue);
            }
            if((this.getY()<startY-vyska/8
                && this.getY()>startY-3*vyska/16) || (this.getY()<startY+3*vyska/16 &&
                    this.getY()>startY+vyska/8)){
                this.setPenColor(Color.white);
            }
            if(this.getY()>startY+3*vyska/16){
                this.setPenColor(Color.green);
            }
            if(this.getY()<startY-3*vyska/16){
                this.setPenColor(Color.red);
            }


            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }


            this.setDirection(Math.random()*360);
            this.step(2);

        }

    }
    public void nigger(int pocKrokov, double sirka, double vyska){
        double startX=this.getX();
        double startY=this.getY();
        double natocenie=this.getDirection();
        for(int i=0;i<pocKrokov;i++){
            if(this.getY()>startY-vyska/6 ||
                this.getY()<startY+vyska/6){
                this.setPenColor(Color.white);
            }
            if(this.getY()>startY+vyska/6){
                this.setPenColor(Color.green);
            }
            if(this.getY()<startY-vyska/6){
                this.setPenColor(Color.orange);
            }
            if(distanceTo(startX,startY)<vyska/8){
                this.setPenColor(Color.orange);
            }

            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }


            this.setDirection(Math.random()*360);
            this.step(2);

        }

    }
    public void maurious(int pocKrokov, double sirka, double vyska){
        double startX=this.getX();
        double startY=this.getY();
        double natocenie=this.getDirection();
        for(int i=0;i<pocKrokov;i++){
            if(this.getY()>startY){
                this.setPenColor(Color.yellow);
            }
            if(this.getY()<startY){
                this.setPenColor(Color.blue);
            }
            if(this.getY()<startY-vyska/4){
                this.setPenColor(Color.red);
            }
            if(this.getY()>startY+vyska/4){
                this.setPenColor(Color.green);
            }
            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }


            this.setDirection(Math.random()*360);
            this.step(2);

        }

    }
    public void texas(int pocKrokov, double sirka, double vyska){
        double startX=this.getX();
        double startY=this.getY();
        double natocenie=this.getDirection();
        for(int i=0;i<pocKrokov;i++){

            if(this.getY()<startY){
                this.setPenColor(Color.white);
            }
            if(this.getY()>startY){
                this.setPenColor(Color.red);
            }
            if(this.getX()<startX-sirka/6){
                this.setPenColor(Color.blue);
            }
            if (this.getX() > startX + sirka / 2
                    || this.getX() < startX - sirka / 2
                    || this.getY() > startY + vyska / 2
                    || this.getY() < startY - vyska / 2) {
                this.step(-2);
            }


            this.setDirection(Math.random()*360);
            this.step(2);

        }
        this.penUp();
        this.setDirection(90);
        this.moveTo(startX-sirka/2 +sirka/12,startY-15);
        this.pathviezdica(80);


    }
    public void pathviezdica(double strana){
        this.setFillColor(Color.white);
        this.openPolygon();
        for(int i=0;i<5;i++){
              this.step(strana);
              this.turn(144);
        }
        this.closePolygon();
    }






    }





