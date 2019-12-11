/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestorario;

/**
 *
 * @author tss
 */
public class Ora {

    public static void main(String[] args) {

        Orologio o = new Orologio(1, 12, 13);
        System.out.println(o);
        System.out.println(o.validate(0, 0, 0));
        System.out.println(o.validate(25, 0, 0));
        System.out.println(o.validate(0, 60, 0));
        System.out.println(o.validate(0, 0, 60));
        o = o.add(1, 1, 1);
        System.out.println(o);
        o = o.meno(1, 1, 1);
        System.out.println(o);
        o = o.meno(1, 10, 1);
        System.out.println(o);
        o = o.meno(1, 20, 20);
        System.out.println(o);
        o = new Orologio(23, 59, 59);
        System.out.println(o);
        o = o.add(0, 0, 1);
        System.out.println(o);

    }
}
