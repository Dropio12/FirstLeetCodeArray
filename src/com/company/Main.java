package com.company;
import java.awt.*;


class Fenêtre {
    public final static int LARGEUR = 800;
    public final static int HAUTEUR = 600;

    public static void main(String[] args) {
        Frame F = new Frame();
        F.setTitle("Fenêtre");
        F.setSize(LARGEUR, HAUTEUR);
        F.setBackground(Color.darkGray);
        F.setVisible(true);
    }
}


