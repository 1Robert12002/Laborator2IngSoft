package org.example;

import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) {

        ArrayList<Carte> biblioteca = new ArrayList<Carte>();

        Carte carte1 = new Carte("Roald Dahl", "The Wonderful Story of Henry Sugar");
        carte1.addPage(new Pagina(1, "Ceva"));

        Carte carte2 = new Carte("J.R.R. Tolkien", "The Lord of the Rings");
        carte2.addPage(new Pagina(3, "Alceva"));

        Carte carte3 = new Carte("J.K. Rowling", "Harry Potter and the Philosopher's Stone");
        carte3.addPage(new Pagina(2, "Alceva2"));

        biblioteca.add(carte1);
        biblioteca.add(carte2);
        biblioteca.add(carte3);

        for (Carte Carte : biblioteca) {
            System.out.println(Carte.toString());
        }
    }
}

