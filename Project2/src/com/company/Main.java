package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Coche auto= new Coche();
        auto.plusPuertas();
        auto.plusPuertas();
        System.out.println(auto.numpuertas);
    }
}

class Coche{

    public int numpuertas = 0;

    public int plusPuertas() {
        return numpuertas++;
    }
}