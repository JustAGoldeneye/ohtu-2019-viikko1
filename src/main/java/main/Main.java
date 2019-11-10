package main;

import ohtu.ohtuvarasto.Varasto;

public class Main {

    public static void main(String[] args) {
        
        if (true) {
            if (true) {
                if (true) {
                    System.out.println("omena");
                }
            }
        }

        Varasto olutta = new Varasto(100.0, 20.2);

        System.out.println("Olutvarasto: " + olutta);
        System.out.println("olutta.otaVarastosta(1000.0)");
        double saatiin = olutta.otaVarastosta(1000.0);
        System.out.println("saatiin " + saatiin);
        System.out.println("Olutvarasto: " + olutta);
    }
}
