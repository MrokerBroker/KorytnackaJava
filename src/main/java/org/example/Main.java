package org.example;

import sk.upjs.jpaz2.*;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WinPane plocha = new WinPane();
        MojaKorytnacka mk = new MojaKorytnacka();
        plocha.add(mk);
        plocha.resize(1000,1000);

        mk.center();
        mk.ciarkaBodkaCiarka(100);



        }
    }
