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
public class Orologio {

    private int ora;
    private int minuti;
    private int secondi;

    public Orologio(int ora, int minuti, int secondi) {
        if (!validate(ora, minuti, secondi)) {
            throw new IllegalArgumentException("Argomenti sbagliati");
        }
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    @Override
    public String toString() {
        return "Orologio{" + "ora=" + ora + ", minuti=" + minuti + ", secondi=" + secondi + '}';
    }

    public boolean validate(int ora, int minuti, int secondi) {
        if (ora < 0 || ora > 23) {
            return false;
        } else if (minuti < 0 || minuti > 59) {
            return false;
        } else if (secondi < 0 || secondi > 59) {
            return false;
        }
        return true;
    }

    public Orologio add(int ora, int minuti, int secondi) {
        if (validate(ora, minuti, secondi)) {
            addOra(ora);
            addOra(addMinuti(minuti));
            addOra(addMinuti(addSecondi(secondi)));
            return this;
        }
        return null;
    }

    public Orologio meno(int ora, int minuti, int secondi) {
        if (validate(ora, minuti, secondi)) {
            menoOra(ora);
            menoOra(menoMinuti(minuti));
            menoOra(menoMinuti(menoSecondi(secondi)));
            return this;
        }
        return null;
    }

    private int addOra(int ora) {
        int ret = 0;
        this.ora += ora;
        if (this.ora > 23) {
            this.ora -= 24;
            ret = 1;
        }
        return ret;
    }

    private int addMinuti(int minuti) {
        int ret = 0;
        this.minuti += minuti;
        if (this.minuti > 59) {
            this.minuti -= 60;
            ret = 1;
        }
        return ret;
    }

    private int addSecondi(int secondi) {
        int ret = 0;
        this.secondi += secondi;
        if (this.secondi > 59) {
            this.secondi -= 60;
            ret = 1;
        }
        return ret;
    }

    private int menoOra(int ora) {
        int ret = 0;
        this.ora -= ora;
        if (this.ora < 0) {
            this.ora = 0;
            ret = 1;
        }
        return ret;
    }

    private int menoMinuti(int minuti) {
        int ret = 0;
        this.minuti -= minuti;
        if (this.minuti < 0) {
            this.minuti += 60;
            ret = 1;
        }
        return ret;
    }

    private int menoSecondi(int secondi) {
        int ret = 0;
        this.secondi -= secondi;
        if (this.secondi < 0) {
            this.secondi += 60;
            ret = 1;
        }
        return ret;
    }
}
