/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum9;

/**
 *
 * @author Nyunnyun
 */
public class RumusMatematika {
     double a,t;
    double l_segitiga;

    public static void main (String[]args){
        RumusMatematika rm = new RumusMatematika();
        rm.luasSegitiga();
    }

    void luasSegitiga(){
        a=7;
        t=10;
        l_segitiga=0.5*a*t;
        System.out.println("Luas segitiga = "+l_segitiga);
    }
}
